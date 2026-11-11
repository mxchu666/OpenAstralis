package cc.astralis;

import org.joml.Vector3d;

public class dda {
   public Vector3d bnj = new Vector3d(0.0, 0.0, 0.0);
   public Vector3d gdf = new Vector3d(0.0, 0.0, 0.0);
   public Vector3d cyd = new Vector3d(0.0, 0.0, 0.0);
   public Vector3d fkr = new Vector3d(0.0, -10.0, 0.0);
   public double csi = 2.0;
   public final double glu = 1.0;
   private final double cui = 0.03333333333333333;

   public Vector3d bnv() {
      double a = 1.0;
      a.gdf.mul(a);
      a.gdf.add(a.fkr);
      a.gdf.mul(a.csi);
      a.bnj.mul(a);
      a.gdf.mul(0.03333333333333333);
      a.bnj.add(a.gdf);
      a.cyd.add(a.bnj);
      a.gdf.set(0.0, 0.0, 0.0);
      a.bnj.set(0.0, 0.0, 0.0);
      return a.cyd;
   }
}
