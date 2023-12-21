package com.crystalneko.lpprefix.qwq;

import com.crystalneko.ctlibPublic.inGame.chatPrefix;
import com.crystalneko.lpprefix.wow.喵;
import com.crystalneko.lpprefix.wow.玩家;
import net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents;
import net.minecraft.server.network.ServerPlayerEntity;

import java.util.List;

public class 再见喵 {
    public 再见喵(){
        ServerPlayConnectionEvents.DISCONNECT.register((handler, server) -> {
            玩家 玩家 = new 玩家 ((ServerPlayerEntity) handler.player);
            //哼哼，让我看看保存了几个前缀
            if(欢迎喵.前缀列表.containsKey(玩家)){
                List<喵> 前缀s= 欢迎喵.前缀列表.get(玩家);
                //转换成数组应该好用点，对吧喵?
                喵[] 前缀 = 前缀s.toArray(new 喵[0]);
                //嘿嘿，让我看看它有多长
                int 长度 = 前缀.length;
                if(长度 != 0){
                    int i = 0;
                    while (长度 < i){
                        //既然都要走了，那前缀就删了喵~
                        chatPrefix.subPrivatePrefix(玩家.真名,前缀[i].绿了);
                        i++;
                    }
                }
                //就当你没来过吧
                欢迎喵.前缀列表.remove(玩家);
            }else {
                //喵？居然没前缀
                //好吧，那我不管了喵~ (=￣ω￣=)
            }
            //真的要走了喵？那，下次再见喵 (｡•́︿•̀｡)
        });
    }
}
