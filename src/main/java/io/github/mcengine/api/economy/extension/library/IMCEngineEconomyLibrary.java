package io.github.mcengine.api.economy.extension.library;

import org.bukkit.plugin.Plugin;

/**
 * Contract for Economy Library modules that can be dynamically loaded
 * and integrated into the MCEngine.
 * <p>
 * Libraries typically provide reusable services, shared logic, or
 * dependencies leveraged by other Economy extensions.
 */
public interface IMCEngineEconomyLibrary {

    /**
     * Invoked when the Economy Library is loaded by the engine.
     *
     * @param plugin the Bukkit {@link Plugin} instance providing context
     */
    void onLoad(Plugin plugin);

    /**
     * Invoked when the Economy Library is unloaded or disabled by the engine.
     * <p>
     * Implementations should release services, cancel tasks,
     * and clean up resources created during {@link #onLoad(Plugin)}.
     *
     * @param plugin the Bukkit {@link Plugin} instance providing context
     */
    void onDisload(Plugin plugin);

    /**
     * Assigns a unique identifier for this Library module.
     *
     * @param id the unique ID assigned by the engine
     */
    void setId(String id);
}
