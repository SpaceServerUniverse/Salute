package space.yurisi.salute.command;

import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class otiCommand extends SaluteBaseCommand implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        setMessages(
                new Component[]{
                        Component.text("§b(@＾皿＾@)ゞ『ォチﾏｽ!!』*｡+ﾟ★"),
                        Component.text("§b(○´∇｀)ﾉ☆ﾟ+.退室ｲﾀｼﾏｽ.+ﾟ☆"),
                        Component.text("§b★ﾟ+o｡(☆´･ω･)σ《ぉちます》a(･ω･｀★)｡o+ﾟ☆"),
                        Component.text("§bp【+ﾟ*退室ｼﾁｬｳｮ:ﾟ+】qД｀｡)｡o.ﾟ｡"),
                        Component.text("§bヾ(´Д｀q･ﾟ･ﾊﾞィﾊﾞィ! おちるﾈェｯ!!*:ﾟ･☆"),
                        Component.text("§bヾ(★´Å｀★)σ【ｵﾁﾙﾈェ～】｡o+☆"),
                        Component.text("§b人･∀･*).o0((ｿﾛｿﾛ☆落ﾁﾏｽ★))"),
                        Component.text("§bｵﾁﾙﾈ～☆εε==≡ヾ(★,,´∀'｀)ﾉ")

                }
        );

        Bukkit.broadcast(getMessage());
        return true;
    }
}
