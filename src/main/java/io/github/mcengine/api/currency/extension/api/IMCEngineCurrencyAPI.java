package io.github.mcengine.api.currency.extension.api;

import org.bukkit.plugin.Plugin;

/**
 * Interface for AI DLC modules that can be dynamically loaded.
 */
public interface IMCEngineCurrencyAPI {

    /**
     * Called when the DLC is loaded by the AI engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onLoad(Plugin plugin);

    /**
     * Called when the API module is unloaded or disabled by the engine.
     * <p>
     * Use this method to deregister any resources, cancel tasks,
     * or clean up systems related to this module.
     *
     * @param plugin The {@link Plugin} instance providing the context.
     */
    void onDisload(Plugin plugin);

    /**
     * Sets a unique ID for this AI API module.
     *
     * @param id The unique ID assigned by the engine.
     */
    void setId(String id);
}
