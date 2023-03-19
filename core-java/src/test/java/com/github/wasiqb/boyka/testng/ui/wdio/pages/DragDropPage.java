package com.github.wasiqb.boyka.testng.ui.wdio.pages;

import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.androidUIAutomator;
import static io.appium.java_client.AppiumBy.iOSNsPredicateString;
import static java.text.MessageFormat.format;

import com.github.wasiqb.boyka.builders.Locator;
import lombok.Getter;

/**
 * Drag and drop page.
 *
 * @author Wasiq Bhamla
 * @since 24-Dec-2022
 */
@Getter
public class DragDropPage {
    private static final DragDropPage DRAG_DROP_PAGE = new DragDropPage ();

    /**
     * Drag and drop page instance.
     *
     * @return {@link DragDropPage}
     */
    public static DragDropPage dragDropPage () {
        return DRAG_DROP_PAGE;
    }

    private final Locator screen      = Locator.buildLocator ()
        .android (accessibilityId ("Drag-drop-screen"))
        .ios (accessibilityId ("Drag-drop-screen"))
        .name ("Drag Drop screen")
        .build ();
    private final Locator retryButton = Locator.buildLocator ()
        .parent (this.screen)
        .name ("Retry Button")
        .android (accessibilityId ("button-Retry"))
        .ios (accessibilityId ("button-Retry"))
        .build ();
    private final Locator description = Locator.buildLocator ()
        .android (androidUIAutomator ("new UiSelector ().textStartsWith (\"You made it\")"))
        .ios (iOSNsPredicateString ("type == 'XCUIElementTypeStaticText' AND label BEGINSWITH 'You made it'"))
        .parent (this.screen)
        .name ("Description")
        .build ();
    private final Locator title       = Locator.buildLocator ()
        .android (androidUIAutomator ("new UiSelector ().text (\"Congratulations\")"))
        .ios (iOSNsPredicateString ("type == 'XCUIElementTypeStaticText' AND label == 'Congratulations'"))
        .parent (this.screen)
        .name ("Title")
        .build ();

    /**
     * Source center tile
     *
     * @param index index of tile
     *
     * @return locator of tile
     */
    public Locator centerSourceTile (final int index) {
        return Locator.buildLocator ()
            .name (format ("Center Source Tile [{0}]", index))
            .android (accessibilityId (format ("drag-c{0}", index)))
            .ios (accessibilityId (format ("drag-c{0}", index)))
            .build ();
    }

    /**
     * Target center tile
     *
     * @param index index of tile
     *
     * @return locator of tile
     */
    public Locator centerTargetTile (final int index) {
        return Locator.buildLocator ()
            .name (format ("Center Target Tile [{0}]", index))
            .android (accessibilityId (format ("drop-c{0}", index)))
            .ios (accessibilityId (format ("drop-c{0}", index)))
            .build ();
    }

    /**
     * Source left tile
     *
     * @param index index of tile
     *
     * @return locator of tile
     */
    public Locator leftSourceTile (final int index) {
        return Locator.buildLocator ()
            .name (format ("Left Source Tile [{0}]", index))
            .android (accessibilityId (format ("drag-l{0}", index)))
            .ios (accessibilityId (format ("drag-l{0}", index)))
            .build ();
    }

    /**
     * Target left tile
     *
     * @param index index of tile
     *
     * @return locator of tile
     */
    public Locator leftTargetTile (final int index) {
        return Locator.buildLocator ()
            .name (format ("Left Target Tile [{0}]", index))
            .android (accessibilityId (format ("drop-l{0}", index)))
            .ios (accessibilityId (format ("drop-l{0}", index)))
            .build ();
    }

    /**
     * Source right tile
     *
     * @param index index of tile
     *
     * @return locator of tile
     */
    public Locator rightSourceTile (final int index) {
        return Locator.buildLocator ()
            .name (format ("Right Source Tile [{0}]", index))
            .android (accessibilityId (format ("drag-r{0}", index)))
            .ios (accessibilityId (format ("drag-r{0}", index)))
            .build ();
    }

    /**
     * Target right tile
     *
     * @param index index of tile
     *
     * @return locator of tile
     */
    public Locator rightTargetTile (final int index) {
        return Locator.buildLocator ()
            .name (format ("Right Target Tile [{0}]", index))
            .android (accessibilityId (format ("drop-r{0}", index)))
            .ios (accessibilityId (format ("drop-r{0}", index)))
            .build ();
    }
}
