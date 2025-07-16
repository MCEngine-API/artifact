package io.github.mcengine.api.artifact.extension.addon;

import org.bukkit.plugin.Plugin;

/**
 * Interface for AddOn modules that can be dynamically loaded
 * as part of the Artifact system in MCEngine.
 */
public interface IMCEngineArtifactAddOn {

    /**
     * Called when the AddOn is loaded by the AI engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onLoad(Plugin plugin);
}
