package io.github.mcengine.api.currency.extension.dlc;

import org.bukkit.plugin.Plugin;

/**
 * Interface for AI DLC modules that can be dynamically loaded.
 */
public interface IMCEngineCurrencyDLC {

    /**
     * Called when the DLC is loaded by the AI engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onLoad(Plugin plugin);

    /**
     * Called when the DLC is unloaded or disabled by the engine.
     * <p>
     * Use this method to clean up resources or state that should not persist after disabling.
     *
     * @param plugin The plugin instance providing context.
     */
    void onDisload(Plugin plugin);

    /**
     * Sets a unique ID for this AI DLC module.
     *
     * @param id The unique ID assigned by the engine.
     */
    void setId(String id);
}
