package com.astralis.scripting.api;

import com.astralis.scripting.api.entity.ScriptEntity;
import com.astralis.scripting.api.entity.ScriptNetworkPlayer;
import com.astralis.scripting.api.entity.ScriptPlayer;
import com.astralis.scripting.api.math.ScriptVector3;
import com.astralis.scripting.api.world.ScriptBlockState;
import com.astralis.scripting.api.world.ScriptScoreboardEntry;
import java.util.List;

public class World {
   public List<ScriptEntity> getEntities() {
      throw new UnsupportedOperationException();
   }

   public List<ScriptPlayer> getPlayers() {
      throw new UnsupportedOperationException();
   }

   public List<ScriptEntity> getPlayerEntities() {
      throw new UnsupportedOperationException();
   }

   public boolean exists() {
      throw new UnsupportedOperationException();
   }

   public List<ScriptNetworkPlayer> getNetworkPlayers() {
      throw new UnsupportedOperationException();
   }

   public List<ScriptEntity> getEntitiesInRadius(double var1) {
      throw new UnsupportedOperationException();
   }

   public List<ScriptEntity> getEntitiesInRadius(ScriptVector3 var1, double var2) {
      throw new UnsupportedOperationException();
   }

   public ScriptEntity getEntityById(int var1) {
      throw new UnsupportedOperationException();
   }

   public ScriptEntity getEntityByName(String var1) {
      throw new UnsupportedOperationException();
   }

   public ScriptPlayer getPlayerByName(String var1) {
      throw new UnsupportedOperationException();
   }

   public ScriptPlayer getClosestPlayer() {
      throw new UnsupportedOperationException();
   }

   public ScriptEntity getClosestEntity(double var1) {
      throw new UnsupportedOperationException();
   }

   public String getBlockName(int var1, int var2, int var3) {
      throw new UnsupportedOperationException();
   }

   public ScriptBlockState getBlockState(int var1, int var2, int var3) {
      throw new UnsupportedOperationException();
   }

   public ScriptBlockState getBlockAt(int var1, int var2, int var3) {
      throw new UnsupportedOperationException();
   }

   public ScriptBlockState getBlockState(ScriptVector3 var1) {
      throw new UnsupportedOperationException();
   }

   public ScriptBlockState getBlockAt(ScriptVector3 var1) {
      throw new UnsupportedOperationException();
   }

   public String getBlockName(ScriptVector3 var1) {
      throw new UnsupportedOperationException();
   }

   public float getBlockHardness(int var1, int var2, int var3) {
      throw new UnsupportedOperationException();
   }

   public boolean isAir(int var1, int var2, int var3) {
      throw new UnsupportedOperationException();
   }

   public boolean isBlockLoaded(int var1, int var2, int var3) {
      throw new UnsupportedOperationException();
   }

   public boolean isBlockReplaceable(int var1, int var2, int var3) {
      throw new UnsupportedOperationException();
   }

   public boolean isBlockSolid(int var1, int var2, int var3) {
      throw new UnsupportedOperationException();
   }

   public boolean isBlockInteractable(int var1, int var2, int var3) {
      throw new UnsupportedOperationException();
   }

   public boolean containsFluid(int var1, int var2, int var3) {
      throw new UnsupportedOperationException();
   }

   public String getFluidName(int var1, int var2, int var3) {
      throw new UnsupportedOperationException();
   }

   public int getLightLevel(int var1, int var2, int var3) {
      throw new UnsupportedOperationException();
   }

   public int getRedstonePower(int var1, int var2, int var3) {
      throw new UnsupportedOperationException();
   }

   public String getBiome(int var1, int var2, int var3) {
      throw new UnsupportedOperationException();
   }

   public long getTime() {
      throw new UnsupportedOperationException();
   }

   public long getDayTime() {
      throw new UnsupportedOperationException();
   }

   public String getDimension() {
      throw new UnsupportedOperationException();
   }

   public boolean isRaining() {
      throw new UnsupportedOperationException();
   }

   public float getRainLevel() {
      throw new UnsupportedOperationException();
   }

   public int getEntityCount() {
      throw new UnsupportedOperationException();
   }

   public String getSidebarTitle() {
      throw new UnsupportedOperationException();
   }

   public List<ScriptScoreboardEntry> getSidebarScores() {
      throw new UnsupportedOperationException();
   }
}
