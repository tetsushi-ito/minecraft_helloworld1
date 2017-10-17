package jp.co.tyotto.tetsushi.helloworld;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.BlockBreakEvent;

public class Main extends JavaPlugin implements Listener {
    @Override
    public void onEnable(){
        //Fired when the server enables the plugin
        System.out.println("プラグイン起動！");

        getServer().getPluginManager().registerEvents(this, this);
        //getConfig().options().copyDefaults(true);
        //saveDefaultConfig();

        //bukkitRunnable(this);
    }

    @EventHandler
    public void onPlayerBreakBlock(BlockBreakEvent event) {
        System.out.println("ブロック壊したな！！！！");
        /*
        Player player = event.getPlayer();
        Block block = event.getBlock();
        Material roto = block.getType();
        setBlock.put(1, block.getWorld().getBlockAt(block.getX(), block.getY(), block.getZ()));
        block.getWorld().getBlockAt(block.getX(), block.getY(), block.getZ()).setType(roto);
        if(roto == Material.WOOD){
            rotos.add(player.getName());
        }
        */
    }
}