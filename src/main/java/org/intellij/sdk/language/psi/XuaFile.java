package org.intellij.sdk.language.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.intellij.sdk.language.XuaFileType;
import org.intellij.sdk.language.XuaLanguage;
import org.jetbrains.annotations.NotNull;

public class XuaFile extends PsiFileBase {

    public XuaFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, XuaLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return XuaFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Xua File";
    }

}
