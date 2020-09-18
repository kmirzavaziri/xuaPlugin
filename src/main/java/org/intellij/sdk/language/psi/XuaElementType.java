
package org.intellij.sdk.language.psi;

import com.intellij.psi.tree.IElementType;
import org.intellij.sdk.language.XuaLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class XuaElementType extends IElementType {

    public XuaElementType(@NotNull @NonNls String debugName) {
        super(debugName, XuaLanguage.INSTANCE);
    }

}
