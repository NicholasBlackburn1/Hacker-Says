package space.nicholasblackburn.minigames.simonsays;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    java.util.logging.Logger logger = Bukkit.getLogger();

    File ymlFile = new File("config.yml");
    FileConfiguration config = this.getConfig();

    @Override
    public void onLoad() {
        createConfig();
        

    }

    @Override
    public void onEnable() {
        dumpConfig();

        
    }

    @Override
    public void onDisable() {

    }

    /**
     * This Section IS where i define all the
     * 
     * @implNote spawns x,y,z
     * @return read random bool
     */

    public void createConfig() {
        if (!config.getBoolean("created")) {
            config.addDefault("created", true);
        }

        if (config.getBoolean("created")) {
            System.out.println("Config.yml created");
            saveConfig();
        }
    }

    public void dumpConfig(){
        
        logger.warning("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        logger.warning("Config random order\n" + readRandom());
        logger.warning("Spawn\n" + "X"+readSpawnPosX()+"\n"+"Y"+ readSpawnPosY()+"\n"+"Z"+ readSpawnPosZ()+"\n");
        logger.warning("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }
    public Boolean readRandom(){
        return config.getBoolean("Random");
    }

    public Integer readSpawnPosX(){
        return config.getInt("Spawn.PosX");
    }
    public Integer readSpawnPosY(){
        return config.getInt("Spawn.PosY");
    }

    public Integer readSpawnPosZ(){
        return config.getInt("Spawn.PosZ");
    }
}