#!/usr/bin/env bash
# Build the OpenAstralis tooling. Requires JDK 21+ and Python 3.10+.
set -euo pipefail

root="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
classes="$root/build/classes"
jar="$root/build/openastralis-tools.jar"

mkdir -p "$classes" "$root/build"

libs="$(find "$root/tools/lib" -name '*.jar' | tr '\n' ':' | sed 's/:$//')"
mapfile -t src < <(find "$root/tools" -maxdepth 1 -name '*.java')

echo "javac ${#src[@]} source file(s)"
javac -Xlint:all -encoding UTF-8 -d "$classes" -cp "$libs" "${src[@]}"

jar --create --file "$jar" --main-class AstralisDeobf -C "$classes" .
java -cp "$jar:$libs" AstralisDeobf --help > /dev/null

if command -v python3 > /dev/null; then
  echo "python3 -m compileall tools"
  python3 -m compileall -q "$root/tools"
fi

echo "ok -> $jar"
