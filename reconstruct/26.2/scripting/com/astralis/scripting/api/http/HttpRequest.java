package com.astralis.scripting.api.http;

import java.util.Map;

public record HttpRequest(String url, HttpRequest.Method method, Map<String, String> headers, String body, HttpRequest.BodyType bodyType) {
   public HttpRequest(String url, HttpRequest.Method method, Map<String, String> headers, String body, HttpRequest.BodyType bodyType) {
   }

   public static HttpRequest.Builder builder(String var0) {
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

   public String url() {
      throw new UnsupportedOperationException();
   }

   public HttpRequest.Method method() {
      throw new UnsupportedOperationException();
   }

   public Map<String, String> headers() {
      throw new UnsupportedOperationException();
   }

   public String body() {
      throw new UnsupportedOperationException();
   }

   public HttpRequest.BodyType bodyType() {
      throw new UnsupportedOperationException();
   }

   public static enum BodyType {
      NONE,
      TEXT,
      JSON;
   }

   public static final class Builder {
      public HttpRequest.Builder header(String var1, String var2) {
         throw new UnsupportedOperationException();
      }

      public HttpRequest.Builder get() {
         throw new UnsupportedOperationException();
      }

      public HttpRequest.Builder text(String var1) {
         throw new UnsupportedOperationException();
      }

      public HttpRequest.Builder json(String var1) {
         throw new UnsupportedOperationException();
      }

      public HttpRequest build() {
         throw new UnsupportedOperationException();
      }
   }

   public static enum Method {
      GET,
      POST;
   }
}
