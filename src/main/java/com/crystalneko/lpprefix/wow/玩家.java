package com.crystalneko.lpprefix.wow;

import net.minecraft.entity.player.PlayerEntity;

public class 玩家 {
    public String 假名;
    public String 真名;
    public PlayerEntity 实体;
    public Boolean 艹了;
    public Boolean 挂了;
    public 玩家(PlayerEntity 实体){
        this.实体 = 实体;
        假名 = 实体.getName().getString();
        真名 = 喵喵.真名(实体);
    }
}
