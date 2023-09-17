package space.yurisi.salute.command;

import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class otuCommand extends SaluteBaseCommand implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        setMessages(
                new Component[]{
                        Component.text("§6(≧∇≦) ｵﾂｶﾚｻﾏー♪"),
                        Component.text("§6お疲れ様(*･ω･*)ゞﾃﾞｼ!!"),
                        Component.text("§6ｵﾂｶﾚｰ！Σd(ゝ∀･)"),
                        Component.text("§6ヾ(*´I｀)ﾉ ｡ﾟ･+:.おつかれさま･.:+･ﾟ｡"),
                        Component.text("§6(。っ・Д・)っ 【お疲れさまぁ♪】"),
                        Component.text("§6ヽ(。ゝω・)ノﾎﾟｨｯ⌒【☆:*:･ｵﾂｶﾚｻﾏ･:*ﾟ☆】"),
                        Component.text("§6ｼｭｯ!!(´･ω･｀)ﾉ≡【☆:*:･おつかれさま･:*ﾟ☆】"),
                        Component.text("§6ｵﾂｶﾚｰ ヾ(=ﾟωﾟ)ゞ"),
                        Component.text("§6おつかれー！(*´Ｉ ｀*)ﾉｼ"),
                        Component.text("§6((*´ゝз･)ﾉﾞお疲れ様♪")
                }
        );

        Bukkit.broadcast(getMessage());
        return true;
    }
}
