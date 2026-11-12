package com.astralis.scripting.api.http;

public interface HttpCall {
   void cancel();

   boolean isCancelled();

   boolean isDone();
}
