package space.yurisi.salute.command;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class SaluteCommand implements CommandExecutor{
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] args){
        if(command.getName().equalsIgnoreCase("k")){
            String[] kArray = {"§a|^・ω・)/ ﾊﾛｰ♪","§aｺﾝﾆﾁ波！( ゜o）＜≡≡((((☆ｶﾞｺﾞｰﾝ☆）>o<)ノ ｵｩｰ","§a＝＝((( (/* ^^)/ ﾊﾛｰｰｰ!!","§aｺﾝﾁｬｯ(/∀＼*)ｷｬｯｷｬｯ","§a(｡･ω･)ﾉ こんてぃわー","§a(*´_｀)ﾉ ﾔﾎﾟｰ♪","§aこん(/・ω・)/にゃちゎ","§a(。･o･｡)ﾉ こんにちゎぁ♪","§a(*◎Ｕ∀Ｕp)q♪ﾁﾜｧ♪","§a(√･ω･) ちーっす"};
            Random rand = new Random();
            int num = rand.nextInt(kArray.length);
            Bukkit.broadcastMessage(kArray[num]);
        } else if (command.getName().equalsIgnoreCase("oti")) {
            String[] otiArray = {"§b(@＾皿＾@)ゞ『ォチﾏｽ!!』*｡+ﾟ★","§b(○´∇｀)ﾉ☆ﾟ+.退室ｲﾀｼﾏｽ.+ﾟ☆","§b★ﾟ+o｡(☆´･ω･)σ《ぉちます》a(･ω･｀★)｡o+ﾟ☆","§bp【+ﾟ*退室ｼﾁｬｳｮ:ﾟ+】qД｀｡)｡o.ﾟ｡","§bヾ(´Д｀q･ﾟ･ﾊﾞィﾊﾞィ! おちるﾈェｯ!!*:ﾟ･☆","§bヾ(★´Å｀★)σ【ｵﾁﾙﾈェ～】｡o+☆","§b人･∀･*).o0((ｿﾛｿﾛ☆落ﾁﾏｽ★))","§bｵﾁﾙﾈ～☆εε==≡ヾ(★,,´∀'｀)ﾉ"};
            Random rand = new Random();
            int num = rand.nextInt(otiArray.length);
            Bukkit.broadcastMessage(otiArray[num]);
        } else if (command.getName().equalsIgnoreCase("otu")) {
            String[] otuArray = {"§6(≧∇≦) ｵﾂｶﾚｻﾏー♪","§6お疲れ様(*･ω･*)ゞﾃﾞｼ!!","§6ｵﾂｶﾚｰ！Σd(ゝ∀･)","§6ヾ(*´I｀)ﾉ ｡ﾟ･+:.おつかれさま･.:+･ﾟ｡","§6(。っ・Д・)っ 【お疲れさまぁ♪】","§6ヽ(。ゝω・)ノﾎﾟｨｯ⌒【☆:*:･ｵﾂｶﾚｻﾏ･:*ﾟ☆】","§6ｼｭｯ!!(´･ω･｀)ﾉ≡【☆:*:･おつかれさま･:*ﾟ☆】","§6ｵﾂｶﾚｰ ヾ(=ﾟωﾟ)ゞ","§6おつかれー！(*´Ｉ ｀*)ﾉｼ","§6((*´ゝз･)ﾉﾞお疲れ様♪"};
            Random rand = new Random();
            int num = rand.nextInt(otuArray.length);
            Bukkit.broadcastMessage(otuArray[num]);
        }
        return true;
    }
}
