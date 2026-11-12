package pub.astralis.client.module.core;

public enum Category {
   COMBAT("Combat"),
   MOVEMENT("Movement"),
   PLAYER("Player"),
   WORLD("World"),
   VISUAL("Visuals"),
   GHOST("Ghost"),
   MISC("Misc"),
   CLIENT("Client");

   private final String name;

   public String getName() {
      return this.name;
   }

   private Category(final String nullxx) {
      this.name = nullxx;
   }
}
