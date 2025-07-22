package io.github.mcengine.api.currency.extension.skript;

import org.bukkit.plugin.Plugin;

/**
 * Interface for Skript modules that can be dynamically loaded
 * as part of the Currency system in MCEngine.
 */
public interface IMCEngineCurrencySkript {

    /**
     * Called when the Skript is loaded by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onLoad(Plugin plugin);

    /**
     * Called when the DLC skript is unloaded or disabled by the engine.
     * <p>
     * This method should be used to clean up event handlers, memory, or tasks
     * created during {@link #onLoad(Plugin)}.
     *
     * @param plugin The {@link Plugin} instance providing context for this DLC module.
     */
    void onDisload(Plugin plugin);

    /**
     * Sets a unique ID for this AI skript module.
     *
     * @param id The unique ID assigned by the engine.
     */
    void setId(String id);
}
