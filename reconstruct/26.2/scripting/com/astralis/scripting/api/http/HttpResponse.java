package com.astralis.scripting.api.http;

import java.util.List;
import java.util.Map;

public record HttpResponse(int status, Map<String, List<String>> headers, String body) {
   public HttpResponse(int status, Map<String, List<String>> headers, String body) {
   }

   public String firstHeader(String var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public final String toString() {
      throw new UnsupportedOperationException();
   }

   @Override
   public final int hashCode() {
      throw new UnsupportedOperationException();
   }

   @Override
   public final boolean equals(Object var1) {
      throw new UnsupportedOperationException();
   }

   public int status() {
      throw new UnsupportedOperationException();
   }

   public Map<String, List<String>> headers() {
      throw new UnsupportedOperationException();
   }

   public String body() {
      throw new UnsupportedOperationException();
   }
}
