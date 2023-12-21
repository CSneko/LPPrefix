package com.crystalneko.lpprefix.qwq;

import com.crystalneko.ctlibPublic.inGame.chatPrefix;
import com.crystalneko.lpprefix.wow.喵;
import com.crystalneko.lpprefix.wow.玩家;
import net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents;
import net.luckperms.api.LuckPerms;
import net.luckperms.api.LuckPermsProvider;
import net.luckperms.api.model.user.User;
import net.luckperms.api.node.Node;
import net.luckperms.api.node.types.PrefixNode;
import net.minecraft.server.network.ServerPlayerEntity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class 欢迎喵 {
    public static Map<玩家,List<喵>> 前缀列表 = new HashMap<>();
    public 欢迎喵(){
        ServerPlayConnectionEvents.JOIN.register((handler, sender, server) -> {
            玩家 玩家 = new 玩家 ((ServerPlayerEntity) handler.player);
            LuckPerms luckPerms = LuckPermsProvider.get();
            User user = luckPerms.getUserManager().getUser(玩家.真名);
            if (user != null) {
                List<喵> 列表 = new ArrayList<>();
                List<Node> prefixNodes = user.getNodes().stream()
                        .filter(node -> node instanceof PrefixNode)
                        .collect(Collectors.toList());

                for (Node node : prefixNodes) {
                    PrefixNode prefixNode = (PrefixNode) node;
                    喵 前缀 = new 喵(prefixNode.getMetaValue());
                    // 哇哦，我居然得到了玩家所在的权限组前缀，这也太神奇了吧
                    //赶紧写入 (っ＾▿＾)۶
                    列表.add(前缀);
                    chatPrefix.addPrivatePrefix(玩家.真名,前缀.绿了);
                }
                //最后保存上喵~
                前缀列表.put(玩家,列表);
            }
        //欢迎喵~~ ( ≧ ω ≦ )
        });

    }
}
