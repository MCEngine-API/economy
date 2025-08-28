package io.github.mcengine.api.economy.extension.api;

import org.bukkit.plugin.Plugin;

/**
 * Contract for Economy API extension modules that can be dynamically loaded
 * and integrated into the MCEngine.
 * <p>
 * API modules typically expose higher-level integration points, services,
 * or protocols related to the Economy system.
 */
public interface IMCEngineEconomyAPI {

    /**
     * Invoked when the Economy API module is loaded by the engine.
     *
     * @param plugin the Bukkit {@link Plugin} instance providing context
     */
    void onLoad(Plugin plugin);

    /**
     * Invoked when the Economy API module is unloaded or disabled by the engine.
     * <p>
     * Implementations should deregister services, cancel tasks,
     * and release any resources here.
     *
     * @param plugin the Bukkit {@link Plugin} instance providing context
     */
    void onDisload(Plugin plugin);

    /**
     * Assigns a unique identifier for this Economy API module.
     *
     * @param id the unique ID assigned by the engine
     */
    void setId(String id);
}
