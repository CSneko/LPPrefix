package com.crystalneko.lpprefix.wow;

import net.minecraft.entity.player.PlayerEntity;

public class 喵喵 {
    //讨厌的mojang,还得让我手动来获取真名，喵~ (๑˘︶˘๑)
    public static String 真名(PlayerEntity player){
        String playerName = player.getName().getString();
        playerName = playerName.replace("literal{", "").replace("}", "");
        return playerName;
    }
}
