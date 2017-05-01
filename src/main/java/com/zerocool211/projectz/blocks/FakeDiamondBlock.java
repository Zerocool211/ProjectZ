package com.zerocool211.projectz.blocks;

import com.zerocool211.projectz.ProjectZ;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class FakeDiamondBlock extends Block
{

    public FakeDiamondBlock(Material materialIn, String name)
    {
        super(materialIn);
        this.setUnlocalizedName(name);
        this.setCreativeTab(ProjectZ.tabProjectZ);
        this.setHardness(5.0F);
        this.setResistance(10.0F);
        this.setSoundType(SoundType.METAL);
    }

}
