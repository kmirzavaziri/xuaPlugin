// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.intellij.sdk.language.psi.impl.*;

public interface XuaTypes {

  IElementType CONSTANT_BLOCK = new XuaElementType("CONSTANT_BLOCK");
  IElementType ENTITY_BLOCK = new XuaElementType("ENTITY_BLOCK");
  IElementType ERROR_BLOCK = new XuaElementType("ERROR_BLOCK");
  IElementType EXPRESSION = new XuaElementType("EXPRESSION");
  IElementType LIST_CONSTANT = new XuaElementType("LIST_CONSTANT");
  IElementType LITERAL_BLOCK = new XuaElementType("LITERAL_BLOCK");
  IElementType METHOD_BLOCK = new XuaElementType("METHOD_BLOCK");
  IElementType NUMERIC_CONSTANT = new XuaElementType("NUMERIC_CONSTANT");
  IElementType PARAMETERS_BLOCK = new XuaElementType("PARAMETERS_BLOCK");
  IElementType PHP_BLOCK = new XuaElementType("PHP_BLOCK");
  IElementType TYPE_BLOCK = new XuaElementType("TYPE_BLOCK");

  IElementType ADDITIONAL = new XuaTokenType("Additional");
  IElementType BINCONSTANT = new XuaTokenType("BinConstant");
  IElementType BODY = new XuaTokenType("Body");
  IElementType CONSTANT = new XuaTokenType("Constant");
  IElementType CRITERIA = new XuaTokenType("Criteria");
  IElementType DECCONSTANT = new XuaTokenType("DecConstant");
  IElementType ENTITY = new XuaTokenType("Entity");
  IElementType FALSE = new XuaTokenType("FALSE");
  IElementType FIELDS = new XuaTokenType("Fields");
  IElementType HEXCONSTANT = new XuaTokenType("HexConstant");
  IElementType LANGUAGECODE = new XuaTokenType("LanguageCode");
  IElementType LITERAL = new XuaTokenType("Literal");
  IElementType MAPCONSTANT = new XuaTokenType("MapConstant");
  IElementType MEANS = new XuaTokenType("Means");
  IElementType METHOD = new XuaTokenType("Method");
  IElementType NULL = new XuaTokenType("NULL");
  IElementType NUMBERSIGN = new XuaTokenType("NumberSign");
  IElementType OBJECTCONSTANT = new XuaTokenType("ObjectConstant");
  IElementType OCTCONSTANT = new XuaTokenType("OctConstant");
  IElementType PARAMETERS = new XuaTokenType("Parameters");
  IElementType PHP = new XuaTokenType("Php");
  IElementType PHPCODE = new XuaTokenType("PhpCode");
  IElementType REQUEST = new XuaTokenType("Request");
  IElementType RESPONSE = new XuaTokenType("Response");
  IElementType STRINGCONSTANT = new XuaTokenType("StringConstant");
  IElementType SYMBOL = new XuaTokenType("Symbol");
  IElementType TRUE = new XuaTokenType("TRUE");
  IElementType TYPE = new XuaTokenType("Type");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == CONSTANT_BLOCK) {
        return new XuaConstantBlockImpl(node);
      }
      else if (type == ENTITY_BLOCK) {
        return new XuaEntityBlockImpl(node);
      }
      else if (type == ERROR_BLOCK) {
        return new XuaErrorBlockImpl(node);
      }
      else if (type == EXPRESSION) {
        return new XuaExpressionImpl(node);
      }
      else if (type == LIST_CONSTANT) {
        return new XuaListConstantImpl(node);
      }
      else if (type == LITERAL_BLOCK) {
        return new XuaLiteralBlockImpl(node);
      }
      else if (type == METHOD_BLOCK) {
        return new XuaMethodBlockImpl(node);
      }
      else if (type == NUMERIC_CONSTANT) {
        return new XuaNumericConstantImpl(node);
      }
      else if (type == PARAMETERS_BLOCK) {
        return new XuaParametersBlockImpl(node);
      }
      else if (type == PHP_BLOCK) {
        return new XuaPhpBlockImpl(node);
      }
      else if (type == TYPE_BLOCK) {
        return new XuaTypeBlockImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
