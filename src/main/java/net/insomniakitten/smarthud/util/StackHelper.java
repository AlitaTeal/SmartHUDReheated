package net.insomniakitten.smarthud.util;

/*
 *  Copyright 2017 InsomniaKitten
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public final class StackHelper {

    private StackHelper() {}

    /**
     * Abbreviates a number with a suffix after a certain length, e.g. 1500 -> 1.5k
     * @param value The number you want to abbreviate
     * @return The abbreviated number
     */
    public static String getAbbreviatedValue(int value) {
        StringBuilder abbr = new StringBuilder();
        int magnitude = (int) Math.floor(Math.log(value) / Math.log(1000.0D));
        int num = (int) (value / Math.pow(1000.0D, magnitude) * 10.0D);
        int integer = num / 10;
        int fractional = num % 10;
        abbr.append(integer);
        if (integer < 10 && fractional > 0) {
            abbr.append('.').append(fractional);
        }
        if (magnitude > 0) {
            abbr.append("kmbtpe".charAt(magnitude - 1));
        }
        return abbr.toString();
    }

    /**
     * Used to query the Item registry for a resource name
     * @param modid The modid used to create a ResourceLocation from
     * @param name  The resource name to create a ResourceLocation from
     * @param meta  The metadata of the item to create an ItemStack for
     * @return An ItemStack matching the resource name. If one isn't found, returns an empty stack
     */
    public static ItemStack getStackFromResourceName(String modid, String name, int meta) {
        Item item = Item.REGISTRY.getObject(new ResourceLocation(modid, name));
        return item != null ? new ItemStack(item, 1, meta) : ItemStack.EMPTY;
    }

}
