package reborncore.test;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.model.IBakedModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import reborncore.api.IBlockTextureProvider;
import reborncore.common.BaseBlock;

import java.util.List;

public class TestBlock extends BaseBlock implements IBlockTextureProvider {

    public PropertyInteger METADATA;

    int maxMetdata = 3;

    public TestBlock() {
        super(Material.cake);
        setUnlocalizedName("testBlock");
        setCreativeTab(CreativeTabs.tabBlock);

     //   this.setDefaultState(this.blockState.getBaseState().withProperty(METADATA, 0));
    }

//    @Override
//    public int amoutOfVariants() {
//        return maxMetdata;
//    }
//
//    @Override
//    public IBlockState getStateFromMeta(int meta) {
//        return this.getDefaultState().withProperty(METADATA, meta);
//    }
//
//    @Override
//    public int getMetaFromState(IBlockState state) {
//        return (Integer) state.getValue(METADATA);
//    }
//
//    protected BlockState createBlockState() {
//
//        METADATA = PropertyInteger.create("Type", 0, maxMetdata);
//        return new BlockState(this, METADATA);
//    }

//    @SuppressWarnings("unchecked")
//    @SideOnly(Side.CLIENT)
//    @Override
//    public void getSubBlocks(Item item, CreativeTabs tab, List list) {
//        for (int i = 0; i < maxMetdata; i++)
//                list.add(new ItemStack(item, 1, i));
//
//    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return null;
    }

    @Override
    public String getTextureName(IBlockState blockState, EnumFacing facing) {
        return "test";
    }


    @Override
    public int amoutOfVariants() {
        return 3 ;
    }


}