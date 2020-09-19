// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface XuaExpression extends PsiElement {

  @NotNull
  List<XuaExpression> getExpressionList();

  @Nullable
  XuaListConstant getListConstant();

  @Nullable
  XuaMapConstant getMapConstant();

  @Nullable
  XuaNumericConstant getNumericConstant();

  @Nullable
  XuaObjectConstant getObjectConstant();

}
