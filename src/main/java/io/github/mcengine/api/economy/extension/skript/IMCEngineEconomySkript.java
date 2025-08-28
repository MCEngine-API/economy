package io.github.mcengine.api.economy.extension.skript;

import org.bukkit.plugin.Plugin;

/**
 * Contract for Economy Skript modules that can be dynamically loaded
 * into the MCEngine.
 * <p>
 * Skript modules typically encapsulate custom scripting logic that
 * extends or automates aspects of the Economy system.
 */
public interface IMCEngineEconomySkript {

    /**
     * Invoked when the Skript module is loaded by the engine.
     *
     * @param plugin the Bukkit {@link Plugin} instance providing context
     */
    void onLoad(Plugin plugin);

    /**
     * Invoked when the Skript module is unloaded or disabled by the engine.
     * <p>
     * Implementations should clean up event handlers, release memory,
     * and cancel tasks created during {@link #onLoad(Plugin)}.
     *
     * @param plugin the Bukkit {@link Plugin} instance providing context
     */
    void onDisload(Plugin plugin);

    /**
     * Assigns a unique identifier for this Skript module.
     *
     * @param id the unique ID assigned by the engine
     */
    void setId(String id);
}
