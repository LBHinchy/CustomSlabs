package me.bootscreen.customslabs.slabs;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCuboidBlockDesign;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.material.MaterialData;
import org.getspout.spoutapi.material.block.GenericCuboidCustomBlock;

public class SandSlab extends GenericCuboidCustomBlock
{
    public SandSlab(Plugin plugin, Texture texture)
    {
        super(plugin, plugin.getConfig().getString("sand.name.normal", "Sand Slab"), 44, new GenericCuboidBlockDesign(plugin, texture, new int[] {1,0,0,0,0,1}, 0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F));
        this.setStepSound(MaterialData.sand.getStepSound());
        this.setHardness(MaterialData.sand.getHardness());
        this.setFriction(MaterialData.sand.getFriction());
        this.setLightLevel(MaterialData.sand.getLightLevel());
    }
}