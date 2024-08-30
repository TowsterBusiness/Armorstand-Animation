package me.towster.crpanimations.Animations;

import me.towster.crpanimations.AnimStands;
import me.towster.crpanimations.KeyFrame;
import me.towster.crpanimations.LimbType;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.util.EulerAngle;

public class WaveAnimation extends AnimStands {
    public WaveAnimation(World world, Location loc, Player player) {
        super(world, loc, player);

        keyFrames.add(new KeyFrame(0, 300, new EulerAngle(0, 0, 0), new EulerAngle(0, 0, 3.14), LimbType.RIGHT_ARM));
        keyFrames.add(new KeyFrame(300, 600, new EulerAngle(0, 0, 3.14), new EulerAngle(0, 0, 0), LimbType.RIGHT_ARM));
    }
}
