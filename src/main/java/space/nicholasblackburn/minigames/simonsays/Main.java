package space.nicholasblackburn.minigames.simonsays;

import org.bukkit.plugin.java.JavaPlugin;



public class Main extends JavaPlugin {

    @Override
    public void onLoad(){
        this.getConfig().options().copyDefaults(true);
        
        // saves config on run
        this.getConfig().options().copyDefaults();
        saveConfig();

        System.out.println("Config random order/n"+readRandom());
        System.out.println("Spawn"+readSpawnPosX()+readSpawnPosY()+readSpawnPosZ());


    }

    @Override 
    public void onEnable(){

    }

    @Override
    public void onDisable(){

    }


    /**
     * This Section IS where i define all the 
     * @implNote spawns x,y,z
     * @return read random bool
     */

    public Boolean readRandom(){
        return this.getConfig().getBoolean("Random");
    }

    public Integer readSpawnPosX(){
        return this.getConfig().getInt("Spawn.x");
    }
    
    public Integer readSpawnPosY(){
        return this.getConfig().getInt("Spawn.y");
    }

    public Integer readSpawnPosZ(){
        return this.getConfig().getInt("Spawn.z");
    }
}