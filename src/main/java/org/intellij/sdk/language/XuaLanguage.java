package org.intellij.sdk.language;

import com.intellij.lang.Language;

public class XuaLanguage extends Language {

    public static final XuaLanguage INSTANCE = new XuaLanguage();

    private XuaLanguage() {
        super("XUA");
    }

}
