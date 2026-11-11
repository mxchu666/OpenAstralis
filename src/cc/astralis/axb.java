package cc.astralis;

import com.google.common.base.Suppliers;
import java.util.function.Supplier;

public class axb<T> {
   private final Supplier<T> gkk;

   public axb(Supplier<T> delegate) {
      a.gkk = Suppliers.memoize(a::get);
   }

   public T ehu() {
      return a.gkk.get();
   }

   public static <T> axb<T> afp(Supplier<T> delegate) {
      return new axb<>(a);
   }
}
