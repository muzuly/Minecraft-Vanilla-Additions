package io.github.muzuly.bunchostuff.common.items.FoodList;

import net.minecraft.item.Food;

public class FoodList { 
   public static final Food PEA_SOUP = buildStew(4);

   private static Food buildStew(int hunger) {
      return (new Food.Builder()).hunger(hunger).saturation(0.6F).build();
   }
}
