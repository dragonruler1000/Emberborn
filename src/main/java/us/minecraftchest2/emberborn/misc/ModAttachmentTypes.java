package us.minecraftchest2.emberborn.misc;

import net.fabricmc.fabric.api.attachment.v1.AttachmentRegistry;
import net.fabricmc.fabric.api.attachment.v1.AttachmentSyncPredicate;
import net.minecraft.util.Identifier;
import us.minecraftchest2.emberborn.Emberborn;

public class ModAttachmentTypes {
    public static final AttachmentType<ModCustomAttachedData> ATTACHMENT_TYPE = AttachmentRegistry.create(
            Identifier.of(Emberborn.MOD_ID, "custom_attachment")
            builder -> builder
                    .initializer(()->ModCustomAttachedData.DEFAULT)
                    .persistent(ModCustomAttachedData.CODEC)
                    .syncWith(PACKET_CODEC, AttachmentSyncPredicate.all())

    );

    public static  void  init(){
        // This method is intentionally left blank
    }
}
