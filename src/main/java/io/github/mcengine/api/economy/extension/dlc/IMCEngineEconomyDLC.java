package io.github.mcengine.api.economy.extension.dlc;

import org.bukkit.plugin.Plugin;

/**
 * Contract for Economy DLC modules that can be dynamically loaded
 * and unloaded at runtime by the MCEngine.
 * <p>
 * DLC modules typically extend the Economy system with additional
 * content or functionality beyond the base implementation.
 */
public interface IMCEngineEconomyDLC {

    /**
     * Invoked when the DLC is loaded by the engine.
     *
     * @param plugin the Bukkit {@link Plugin} instance providing context
     */
    void onLoad(Plugin plugin);

    /**
     * Invoked when the DLC is unloaded or disabled by the engine.
     * <p>
     * Implementations should clean up resources, unregister listeners,
     * and revert transient state here.
     *
     * @param plugin the Bukkit {@link Plugin} instance providing context
     */
    void onDisload(Plugin plugin);

    /**
     * Assigns a unique identifier for this DLC module.
     *
     * @param id the unique ID assigned by the engine
     */
    void setId(String id);
}
