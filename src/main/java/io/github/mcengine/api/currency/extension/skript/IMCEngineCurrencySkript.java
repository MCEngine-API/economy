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
}
