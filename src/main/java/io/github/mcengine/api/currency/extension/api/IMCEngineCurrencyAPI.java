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
}
