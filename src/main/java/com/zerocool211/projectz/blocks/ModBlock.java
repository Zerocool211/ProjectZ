package com.zerocool211.projectz.blocks;

import com.zerocool211.projectz.ProjectZ;
import com.zerocool211.projectz.common.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ModBlock extends Block
{

    public ModBlock(Material materialIn, SoundType soundType, Float hardness, Float resistance, String name)
    {
        super(materialIn);
        this.setUnlocalizedName(name);
        this.setCreativeTab(ProjectZ.tabProjectZ);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setSoundType(soundType);
    }

}
