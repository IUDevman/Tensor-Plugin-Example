package dev.plugin;

import dev.tensor.Tensor;
import dev.tensor.misc.imp.Plugin;

/**
 * @author IUDevman
 * @since 08-10-2021
 */

@Plugin.Info(name = "Example Plugin")
public final class ExamplePlugin extends Plugin {

    @Override
    public void load() {
        Tensor.INSTANCE.LOGGER.info("Sheeet example plugin loaded");
    }
}
