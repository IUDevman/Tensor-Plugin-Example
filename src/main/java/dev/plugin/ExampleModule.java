package dev.plugin;

import dev.tensor.misc.imp.Category;
import dev.tensor.misc.imp.Module;
import dev.tensor.misc.imp.settings.BooleanSetting;

@Module.Info(name = "AModShit", category = Category.Combat)
public final class ExampleModule extends Module {

    public final BooleanSetting bigTit = new BooleanSetting("Tits", true);
}
