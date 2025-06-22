package io.github.mcengine.api.artifact;

import org.bukkit.plugin.Plugin;

public class MCEngineArtifactApi {

    /**
     * Singleton instance of the API.
     */
    private static MCEngineArtifactApi instance;

    /**
     * The Bukkit plugin instance associated with this AI API.
     */
    private Plugin plugin;

    /**
     * Constructs the currency API instance and initializes the appropriate database connection.
     *
     * @param plugin  The Bukkit plugin instance.
     */
    public MCEngineArtifactApi(Plugin plugin) {
        instance = this;
        this.plugin = plugin;
    }

    /**
     * Gets the global API singleton instance.
     *
     * @return The {@link MCEngineArtifactApi} instance.
     */
    public static MCEngineArtifactApi getApi() {
        return instance;
    }

    /**
     * Gets the Bukkit plugin instance linked to this API.
     *
     * @return The plugin instance.
     */
    public Plugin getPlugin() {
        return plugin;
    }
}
