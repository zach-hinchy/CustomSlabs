package me.bootscreen.customslabs.topslabs;

import me.bootscreen.customslabs.CustomSlabs;

import org.getspout.spoutapi.block.design.GenericCuboidBlockDesign;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.material.MaterialData;
import org.getspout.spoutapi.material.block.GenericCuboidCustomBlock;

public class Wool_orangeTopSlab extends GenericCuboidCustomBlock
{
	
    public Wool_orangeTopSlab(CustomSlabs plugin, Texture texture)
    {
        super(plugin, plugin.getConfig().getString("wool.orange.name.top", "Orange Wool TopSlab"), new GenericCuboidBlockDesign(plugin, texture, new int[] {1,0,0,0,0,1}, 0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F));
        this.setStepSound(MaterialData.orangeWool.getStepSound());
        this.setHardness(MaterialData.orangeWool.getHardness());
        this.setFriction(MaterialData.orangeWool.getFriction());
        this.setLightLevel(MaterialData.orangeWool.getLightLevel());
        this.setItemDrop(new SpoutItemStack(plugin.Wool_orangeSlab));
    }
}