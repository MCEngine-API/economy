package io.github.mcengine.api.economy.extension.agent;

import org.bukkit.plugin.Plugin;

/**
 * Represents an Economy Agent module that can be dynamically loaded
 * into the MCEngine.
 * <p>
 * Agents typically encapsulate autonomous logic or behaviors
 * related to the Economy system.
 */
public interface IMCEngineEconomyAgent {

    /**
     * Invoked when the Economy Agent is loaded by the engine.
     *
     * @param plugin the Bukkit {@link Plugin} instance providing runtime context
     */
    void onLoad(Plugin plugin);

    /**
     * Invoked when the Economy Agent is unloaded or disabled by the engine.
     * <p>
     * Implementations should release resources, revert transient state,
     * and clean up registrations here.
     *
     * @param plugin the Bukkit {@link Plugin} instance providing runtime context
     */
    void onDisload(Plugin plugin);

    /**
     * Assigns the unique identifier for this Economy Agent instance.
     *
     * @param id the unique identifier assigned by the engine
     */
    void setId(String id);
}
