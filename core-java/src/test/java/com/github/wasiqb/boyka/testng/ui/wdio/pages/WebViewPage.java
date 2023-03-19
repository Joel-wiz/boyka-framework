/*
 * MIT License
 *
 * Copyright (c) 2023, Wasiq Bhamla
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 */

package com.github.wasiqb.boyka.testng.ui.wdio.pages;

import static org.openqa.selenium.By.cssSelector;

import com.github.wasiqb.boyka.builders.Locator;
import lombok.Getter;

@Getter
public class WebViewPage {
    private static final WebViewPage WEB_VIEW_PAGE = new WebViewPage ();

    public static WebViewPage webViewPage () {
        return WEB_VIEW_PAGE;
    }

    private final Locator pageTitle = Locator.buildLocator ()
        .name ("Page Title")
        .android (cssSelector ("h1 + p"))
        .ios (cssSelector ("h1 + p"))
        .build ();
}
