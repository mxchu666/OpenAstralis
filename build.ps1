#!/usr/bin/env pwsh
# Build the OpenAstralis tooling. Requires JDK 21+ and Python 3.10+.
$ErrorActionPreference = 'Stop'

$root = $PSScriptRoot
$classes = Join-Path $root 'build/classes'
$jar = Join-Path $root 'build/openastralis-tools.jar'
$sep = [IO.Path]::PathSeparator

New-Item -ItemType Directory -Force -Path $classes, (Join-Path $root 'build') | Out-Null

$libs = (Get-ChildItem (Join-Path $root 'tools/lib') -Filter *.jar | ForEach-Object FullName) -join $sep
$src = (Get-ChildItem (Join-Path $root 'tools') -Filter *.java | ForEach-Object FullName)

Write-Host "javac $($src.Count) source file(s)"
& javac -Xlint:all -encoding UTF-8 -d $classes -cp $libs $src
if ($LASTEXITCODE -ne 0) { throw "javac failed" }

& jar --create --file $jar --main-class AstralisDeobf -C $classes .
if ($LASTEXITCODE -ne 0) { throw "jar failed" }

& java -cp "$jar$sep$libs" AstralisDeobf --help | Out-Null
if ($LASTEXITCODE -ne 0) { throw "smoke test failed" }

if (Get-Command python -ErrorAction SilentlyContinue) {
    Write-Host "python -m compileall tools"
    & python -m compileall -q (Join-Path $root 'tools')
    if ($LASTEXITCODE -ne 0) { throw "python compile failed" }
}

Write-Host "ok -> $jar"
