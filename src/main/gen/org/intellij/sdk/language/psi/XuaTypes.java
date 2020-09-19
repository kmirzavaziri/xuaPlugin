// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.intellij.sdk.language.psi.impl.*;

public interface XuaTypes {

  IElementType CONSTANT_BLOCK = new XuaElementType("CONSTANT_BLOCK");
  IElementType ENTITY_BLOCK = new XuaElementType("ENTITY_BLOCK");
  IElementType EXPRESSION = new XuaElementType("EXPRESSION");
  IElementType LIST_CONSTANT = new XuaElementType("LIST_CONSTANT");
  IElementType MAP_CONSTANT = new XuaElementType("MAP_CONSTANT");
  IElementType METHOD_BLOCK = new XuaElementType("METHOD_BLOCK");
  IElementType NUMERIC_CONSTANT = new XuaElementType("NUMERIC_CONSTANT");
  IElementType OBJECT_CONSTANT = new XuaElementType("OBJECT_CONSTANT");
  IElementType SUPER_BLOCK = new XuaElementType("SUPER_BLOCK");

  IElementType BIN_CONSTANT = new XuaTokenType("BIN_CONSTANT");
  IElementType BODY = new XuaTokenType("BODY");
  IElementType CRITERIA = new XuaTokenType("CRITERIA");
  IElementType DEC_CONSTANT = new XuaTokenType("DEC_CONSTANT");
  IElementType ENTITY = new XuaTokenType("ENTITY");
  IElementType FALSE = new XuaTokenType("FALSE");
  IElementType FIELDS = new XuaTokenType("FIELDS");
  IElementType HEX_CONSTANT = new XuaTokenType("HEX_CONSTANT");
  IElementType LANGUAGE_CODE = new XuaTokenType("LANGUAGE_CODE");
  IElementType LITERAL = new XuaTokenType("LITERAL");
  IElementType METHOD = new XuaTokenType("METHOD");
  IElementType NULL = new XuaTokenType("NULL");
  IElementType OCT_CONSTANT = new XuaTokenType("OCT_CONSTANT");
  IElementType PHP_CODE = new XuaTokenType("PHP_CODE");
  IElementType REQUEST = new XuaTokenType("REQUEST");
  IElementType RESPONSE = new XuaTokenType("RESPONSE");
  IElementType STRING_CONSTANT = new XuaTokenType("STRING_CONSTANT");
  IElementType SUPER = new XuaTokenType("SUPER");
  IElementType SYMBOL = new XuaTokenType("SYMBOL");
  IElementType TRUE = new XuaTokenType("TRUE");
  IElementType VALIDATION = new XuaTokenType("VALIDATION");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == CONSTANT_BLOCK) {
        return new XuaConstantBlockImpl(node);
      }
      else if (type == ENTITY_BLOCK) {
        return new XuaEntityBlockImpl(node);
      }
      else if (type == EXPRESSION) {
        return new XuaExpressionImpl(node);
      }
      else if (type == LIST_CONSTANT) {
        return new XuaListConstantImpl(node);
      }
      else if (type == MAP_CONSTANT) {
        return new XuaMapConstantImpl(node);
      }
      else if (type == METHOD_BLOCK) {
        return new XuaMethodBlockImpl(node);
      }
      else if (type == NUMERIC_CONSTANT) {
        return new XuaNumericConstantImpl(node);
      }
      else if (type == OBJECT_CONSTANT) {
        return new XuaObjectConstantImpl(node);
      }
      else if (type == SUPER_BLOCK) {
        return new XuaSuperBlockImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
