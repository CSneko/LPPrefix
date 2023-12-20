package com.crystalneko.lpprefix.qwq;

import com.crystalneko.ctlibPublic.inGame.chatPrefix;
import com.crystalneko.lpprefix.wow.喵;
import com.crystalneko.lpprefix.wow.喵喵;
import net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents;
import net.luckperms.api.LuckPerms;
import net.luckperms.api.LuckPermsProvider;
import net.luckperms.api.model.user.User;
import net.luckperms.api.node.Node;
import net.luckperms.api.node.types.PrefixNode;
import net.minecraft.server.network.ServerPlayerEntity;

import java.util.List;
import java.util.stream.Collectors;

public class 再见喵 {
    public 再见喵(){
        ServerPlayConnectionEvents.DISCONNECT.register((handler, server) -> {
            ServerPlayerEntity 玩家 = (ServerPlayerEntity) handler.player;
            喵 真名 = new 喵(喵喵.真名(玩家));
            LuckPerms luckPerms = LuckPermsProvider.get();
            User user = luckPerms.getUserManager().getUser(真名.喵);
            if (user != null) {
                List<Node> prefixNodes = user.getNodes().stream()
                        .filter(node -> node instanceof PrefixNode)
                        .collect(Collectors.toList());

                for (Node node : prefixNodes) {
                    PrefixNode prefixNode = (PrefixNode) node;
                    String prefix = prefixNode.getMetaValue();
                    // 哇哦，我居然得到了玩家所在的权限组前缀，这也太神奇了吧
                    //赶紧写入 (っ＾▿＾)۶
                    chatPrefix.subPrivatePrefix(真名.绿了,prefix);
                }
            }
            //真的要走了喵？那，下次再见喵 (｡•́︿•̀｡)
        });
    }
}
