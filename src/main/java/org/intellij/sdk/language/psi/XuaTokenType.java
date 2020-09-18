package org.intellij.sdk.language.psi;

import com.intellij.psi.tree.IElementType;
import org.intellij.sdk.language.XuaLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class XuaTokenType extends IElementType {

    public XuaTokenType(@NotNull @NonNls String debugName) {
        super(debugName, XuaLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "XuaTokenType." + super.toString();
    }

}
