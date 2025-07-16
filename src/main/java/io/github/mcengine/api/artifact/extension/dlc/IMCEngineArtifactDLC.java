package io.github.mcengine.api.artifact.extension.dlc;

import org.bukkit.plugin.Plugin;

/**
 * Interface for DLC modules that can be dynamically loaded
 * as part of the Artifact system in MCEngine.
 */
public interface IMCEngineArtifactDLC {

    /**
     * Called when the DLC is loaded by the AI engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onLoad(Plugin plugin);
}
