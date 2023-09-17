package space.yurisi.salute.command;

import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class kCommand extends SaluteBaseCommand implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        setMessages(new Component[]{
                Component.text("§a|^・ω・)/ ﾊﾛｰ♪"),
                Component.text("§aｺﾝﾆﾁ波！( ゜o）＜≡≡((((☆ｶﾞｺﾞｰﾝ☆）>o<)ノ ｵｩｰ"),
                Component.text("§a＝＝((( (/* ^^)/ ﾊﾛｰｰｰ!!"),
                Component.text("§aｺﾝﾁｬｯ(/∀＼*)ｷｬｯｷｬｯ"),
                Component.text("§a(｡･ω･)ﾉ こんてぃわー"),
                Component.text("§a(*´_｀)ﾉ ﾔﾎﾟｰ♪"),
                Component.text("§aこん(/・ω・)/にゃちゎ"),
                Component.text("§a(。･o･｡)ﾉ こんにちゎぁ♪"),
                Component.text("§a(*◎Ｕ∀Ｕp)q♪ﾁﾜｧ♪"),
                Component.text("§a(√･ω･) ちーっす")
        });

        Bukkit.broadcast(getMessage());
        return true;
    }
}
