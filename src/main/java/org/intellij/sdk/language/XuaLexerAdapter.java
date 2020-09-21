package org.intellij.sdk.language;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

public class XuaLexerAdapter extends FlexAdapter {

    public XuaLexerAdapter() {
        super(new XuaLexer(null));
    }

}
