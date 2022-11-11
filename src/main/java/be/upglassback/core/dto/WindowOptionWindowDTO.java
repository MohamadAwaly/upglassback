package be.upglassback.core.dto;

import be.upglassback.core.entities.OptionsWindow;
import be.upglassback.core.entities.Window;


public class WindowOptionWindowDTO {

    private Window window;
    private OptionsWindow optionsWindow;

    public Window getWindow() {
        return window;
    }

    public void setWindow(Window window) {
        this.window = window;
    }

    public OptionsWindow getOptionsWindow() {
        return optionsWindow;
    }

    public void setOptionsWindow(OptionsWindow optionsWindow) {
        this.optionsWindow = optionsWindow;
    }
}
