package jp.co.tyotto.tetsushi.helloworld;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable(){
        //Fired when the server enables the plugin
        System.out.println("プラグイン起動！");
    }
}