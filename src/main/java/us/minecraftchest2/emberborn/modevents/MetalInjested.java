//package us.minecraftchest2.emberborn.modevents;
//
//import net.fabricmc.fabric.api.event.player.UseItemCallback;
//import net.minecraft.item.ItemStack;
//import net.minecraft.item.PotionItem;
//import us.minecraftchest2.emberborn.misc.ModAttachmentTypes;
//import us.minecraftchest2.emberborn.misc.ModCustomAttachedData;
//
//public class MetalInjested {
//    public static void register() {
//        UseItemCallback.EVENT.register((player, world, hand) -> {
//            ItemStack stack = player.getStackInHand(hand);
//
//            if (stack.getItem() instanceof PotionItem) {
//                if (!world.isClient) {
//                    // Add 10 metal points when a potion is drunk
//                    ModCustomAttachedData current = player.getAttachedOrCreate(ModAttachmentTypes.METALS);
//                    ModCustomAttachedData updated = current.addFloat(10.0f);
//                    player.setAttached(ModAttachmentTypes.METALS, updated);
//                }
//            }
//
//            return ActionResult.pass(stack);
//        });
//    }
//}
//
