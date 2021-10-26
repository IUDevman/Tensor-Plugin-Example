package dev.plugin;

import dev.tensor.Tensor;
import dev.tensor.misc.plugin.Plugin;

/**
 * @author IUDevman
 * @since 08-10-2021
 */

@Plugin.Info(name = "Example Plugin", version = "0.1.0")
public final class ExamplePlugin extends Plugin {

    @Override
    public void load() {
        Tensor.INSTANCE.LOGGER.info("Sheeet example plugin loaded");

        Tensor.INSTANCE.MODULE_MANAGER.addModule(new ExampleModule());
    }
}
