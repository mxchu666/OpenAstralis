package com.astralis.scripting.api.http;

public record HttpFailure(HttpFailure.Code code, String message) {
   public HttpFailure(HttpFailure.Code code, String message) {
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

   public HttpFailure.Code code() {
      throw new UnsupportedOperationException();
   }

   public String message() {
      throw new UnsupportedOperationException();
   }

   public static enum Code {
      CANCELLED,
      DENIED,
      INVALID_REQUEST,
      RATE_LIMITED,
      TIMEOUT,
      CONNECTION_FAILED,
      INVALID_RESPONSE,
      RESPONSE_TOO_LARGE;
   }
}
