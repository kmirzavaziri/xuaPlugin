// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.intellij.sdk.language.psi.XuaTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.intellij.sdk.language.psi.*;

public class XuaExpressionImpl extends ASTWrapperPsiElement implements XuaExpression {

  public XuaExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull XuaVisitor visitor) {
    visitor.visitExpression(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof XuaVisitor) accept((XuaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<XuaExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, XuaExpression.class);
  }

  @Override
  @Nullable
  public XuaListConstant getListConstant() {
    return findChildByClass(XuaListConstant.class);
  }

  @Override
  @Nullable
  public XuaNumericConstant getNumericConstant() {
    return findChildByClass(XuaNumericConstant.class);
  }

  @Override
  @Nullable
  public PsiElement getStringConstant() {
    return findChildByType(STRINGCONSTANT);
  }

  @Override
  @Nullable
  public PsiElement getSymbol() {
    return findChildByType(SYMBOL);
  }

}
