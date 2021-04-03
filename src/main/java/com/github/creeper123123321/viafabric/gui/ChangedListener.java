package com.github.creeper123123321.viafabric.gui;

import net.minecraft.client.gui.widget.PagedEntryListWidget;

import java.util.function.Consumer;

public class ChangedListener implements PagedEntryListWidget.Listener {
    private Consumer<String> consumer;

    public ChangedListener(Consumer<String> consumer) {
        this.consumer = consumer;
    }

    @Override
    public void setBooleanValue(int id, boolean value) {
    }

    @Override
    public void setFloatValue(int id, float value) {
    }

    @Override
    public void setStringValue(int id, String text) {
        consumer.accept(text);
    }
}
