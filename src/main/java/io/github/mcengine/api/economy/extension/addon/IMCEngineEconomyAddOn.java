package io.github.mcengine.api.economy.extension.addon;

import org.bukkit.plugin.Plugin;

/**
 * Contract for Economy AddOn modules that can be dynamically loaded
 * and unloaded at runtime by the MCEngine.
 * <p>
 * AddOns extend the base plugin with new functionality such as
 * custom economic features, commands, or event handlers.
 */
public interface IMCEngineEconomyAddOn {

    /**
     * Invoked when the AddOn is loaded by the MCEngine.
     *
     * @param plugin the Bukkit {@link Plugin} instance providing context
     */
    void onLoad(Plugin plugin);

    /**
     * Invoked when the AddOn is unloaded or disabled by the engine.
     * <p>
     * Implementations should release resources, unregister listeners,
     * and perform any required cleanup logic here.
     *
     * @param plugin the Bukkit {@link Plugin} instance providing context
     */
    void onDisload(Plugin plugin);

    /**
     * Assigns a unique identifier for this Economy AddOn instance.
     *
     * @param id the unique ID assigned by the engine
     */
    void setId(String id);
}
