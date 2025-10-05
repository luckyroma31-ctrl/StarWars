package com.starwarsrashad;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = StarWarsRashad.MODID, name = StarWarsRashad.NAME, version = StarWarsRashad.VERSION)
public class StarWarsRashad {
    public static final String MODID = "starwarsrashad";
    public static final String NAME = "StarWars Rashad";
    public static final String VERSION = "1.0";

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println(NAME + " загружен!");
    }
}

