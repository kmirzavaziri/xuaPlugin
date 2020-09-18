package org.intellij.sdk.language;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class XuaFileType extends LanguageFileType {

    public static final XuaFileType INSTANCE = new XuaFileType();

    private XuaFileType() {
        super(XuaLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "XUA File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "XUA language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "xua";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return XuaIcons.FILE;
    }

}
