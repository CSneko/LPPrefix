package com.crystalneko.lpprefix;

import com.crystalneko.lpprefix.qwq.喵喵喵;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;

import static com.crystalneko.lpprefix.wow.喵个声.喵一声;

public class LPPrefix implements ModInitializer {

     // 启动喵~ (≧ω≦)
    @Override
    public void onInitialize() {
        喵一声("喵喵喵~ ");
        ServerLifecycleEvents.SERVER_STARTED.register(server -> {
            //喵喵喵~~
            new 喵喵喵();
        });
    }

}
