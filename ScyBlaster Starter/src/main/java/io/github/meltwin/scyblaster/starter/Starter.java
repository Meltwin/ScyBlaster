package io.github.meltwin.scyblaster.starter;

import io.github.meltwin.scyblaster.starter.gui.GUILoader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Starter App
 * @author meltwin
 * @since 0.1-SNAPSHOT
 */
public class Starter {
    private final GUILoader gui_loader = new GUILoader();
    static public final Logger log = LogManager.getRootLogger();

    public Starter() {
        log.info("Starting Scyblaster 0.1-SNAPSHOT");
        getGuiLoader().makeGUI();
    }

    public GUILoader getGuiLoader() { return gui_loader; }

    // Starting function
    public static void main(String[] args) {
        new Starter();
    }

}