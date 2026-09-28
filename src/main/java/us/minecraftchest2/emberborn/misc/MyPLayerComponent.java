package us.minecraftchest2.emberborn.misc;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.RegistryByteBuf;
import org.ladysnake.cca.api.v3.component.sync.AutoSyncedComponent;
import org.ladysnake.cca.api.v3.component.tick.ServerTickingComponent;
import org.ladysnake.cca.api.v3.entity.C2SSelfMessagingComponent;

import java.util.List;

public class MyPLayerComponent implements C2SSelfMessagingComponent, AutoSyncedComponent, ServerTickingComponent {
    private final PlayerEntity player;
    private List<String> powers;
    private int cooldown;

    public MyPLayerComponent(PlayerEntity player) {
        this.player = player;
        this.powers = List.of("fire", "water", "air", "earth");
        this.cooldown = 0;
    }

    /** Method to call clientside when a player uses a keybind or clicks in a GUI */
    public void usePower(int chosenPower) {
        sendC2SMessage(buf -> buf.writeVarInt(chosenPower));
    }

    @Override
    public void handleC2SMessage(RegistryByteBuf buf) {
        int chosenPower = buf.readVarInt();

        // ALWAYS MAKE SURE TO VALIDATE THE CLIENT'S INPUT IN THIS METHOD
        // regardless of your clientside checks, a malicious or buggy client can always send a bad packet

        // Obligatory check to avoid crashing the server
        if (chosenPower <0 || chosenPower >= this.powers.size()) return;
        // Arbitrary check, let's assume our powers have a cooldown to avoid spamming them
        if (this.cooldown > 0) return;
        // Arbitrary check, let's assume players can't use fire in water
        if ("fire".equals(this.powers.get(chosenPower)) && this.player.isTouchingWater()) return;

        player.sendMessage("Used power " + powers.get(chosenPower));
        cooldown = 40;
    }
}
