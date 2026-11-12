package com.astralis.scripting.api.http;

import java.util.function.Consumer;

public interface ScriptHttp {
   HttpCall send(HttpRequest var1, Consumer<HttpResponse> var2, Consumer<HttpFailure> var3);
}
