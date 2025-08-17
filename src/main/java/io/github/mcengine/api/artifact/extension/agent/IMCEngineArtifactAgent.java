package io.github.mcengine.api.artifact.extension.agent;

import org.bukkit.plugin.Plugin;

/**
 * Represents an Artifact-based Agent module that can be dynamically loaded into the MCEngine.
 * <p>
 * Implement this interface to integrate artifact-related agents into the system.
 */
public interface IMCEngineArtifactAgent {

    /**
     * Called when the Artifact Agent is loaded by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onLoad(Plugin plugin);

    /**
     * Called when the Artifact Agent is unloaded or disabled by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onDisload(Plugin plugin);

    /**
     * Sets a unique ID for this Artifact Agent instance.
     *
     * @param id The unique ID assigned by the engine.
     */
    void setId(String id);
}
