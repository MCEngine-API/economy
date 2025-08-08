package io.github.mcengine.api.currency.extension.agent;

import org.bukkit.plugin.Plugin;

/**
 * Represents a currency-based agent module that can be dynamically loaded into the MCEngine.
 * <p>
 * Implement this interface to integrate currency-related agents into the plugin system.
 */
public interface IMCEngineCurrencyAgent {

    /**
     * Invoked when the currency agent is loaded by the engine.
     *
     * @param plugin the plugin instance providing the runtime context; never {@code null}
     */
    void onLoad(Plugin plugin);

    /**
     * Invoked when the currency agent is unloaded or disabled by the engine.
     * <p>
     * Implementations should release resources and revert transient state here.
     *
     * @param plugin the plugin instance providing the runtime context; never {@code null}
     */
    void onDisload(Plugin plugin);

    /**
     * Assigns the unique identifier for this currency agent instance.
     *
     * @param id the unique identifier assigned by the engine; never {@code null} or empty
     */
    void setId(String id);
}
