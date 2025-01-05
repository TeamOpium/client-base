package dev.twerklife.client.events;

import dev.twerklife.api.manager.event.EventArgument;
import dev.twerklife.api.manager.event.EventListener;

public class EventKey extends EventArgument {
    private final int keyCode;
    private final int scanCode;

    public EventKey(int keyCode, int scanCode) {
        this.keyCode = keyCode;
        this.scanCode = scanCode;
    }

    public int getKeyCode() {
        return this.keyCode;
    }

    public int getScanCode() {
        return this.scanCode;
    }

    @Override
    public void call(EventListener listener) {
        listener.onKey(this);
    }
}
