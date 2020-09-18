// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static org.intellij.sdk.language.psi.XuaTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class XuaParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return XuaFile(b, l + 1);
  }

  /* ********************************************************** */
  // Symbol '=' Expression
  public static boolean ConstantBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstantBlock")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYMBOL);
    r = r && consumeToken(b, "=");
    r = r && Expression(b, l + 1);
    exit_section_(b, m, CONSTANT_BLOCK, r);
    return r;
  }

  /* ********************************************************** */
  // ENTITY '{' FIELDS ':' ParametersBlock ';' ADDITIONAL ':' PhpBlock ';' '}'
  public static boolean EntityBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EntityBlock")) return false;
    if (!nextTokenIs(b, ENTITY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ENTITY);
    r = r && consumeToken(b, "{");
    r = r && consumeToken(b, FIELDS);
    r = r && consumeToken(b, ":");
    r = r && ParametersBlock(b, l + 1);
    r = r && consumeToken(b, ";");
    r = r && consumeToken(b, ADDITIONAL);
    r = r && consumeToken(b, ":");
    r = r && PhpBlock(b, l + 1);
    r = r && consumeToken(b, ";");
    r = r && consumeToken(b, "}");
    exit_section_(b, m, ENTITY_BLOCK, r);
    return r;
  }

  /* ********************************************************** */
  // Symbol MEANS LITERAL '::' Symbol
  public static boolean ErrorBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ErrorBlock")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SYMBOL, MEANS, LITERAL);
    r = r && consumeToken(b, "::");
    r = r && consumeToken(b, SYMBOL);
    exit_section_(b, m, ERROR_BLOCK, r);
    return r;
  }

  /* ********************************************************** */
  // Symbol
  //                             | Symbol '(' (Symbol '=' Expression ';')* ')'
  //                             | '(' Expression ')'
  //                             | Expression '|' Expression
  //                             | Expression '&' Expression
  //                             | '!' Expression
  //                             | NumericConstant
  //                             | Expression '+' Expression
  //                             | Expression '-' Expression
  //                             | Expression '*' Expression
  //                             | Expression '/' Expression
  //                             | '+' Expression
  //                             | '-' Expression
  //                             | StringConstant
  //                             | ListConstant
  //                             | MapConstant
  //                             | ObjectConstant
  //                             | TRUE
  //                             | FALSE
  //                             | NULL
  public static boolean Expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION, "<expression>");
    r = consumeToken(b, SYMBOL);
    if (!r) r = Expression_1(b, l + 1);
    if (!r) r = Expression_2(b, l + 1);
    if (!r) r = Expression_3(b, l + 1);
    if (!r) r = Expression_4(b, l + 1);
    if (!r) r = Expression_5(b, l + 1);
    if (!r) r = NumericConstant(b, l + 1);
    if (!r) r = Expression_7(b, l + 1);
    if (!r) r = Expression_8(b, l + 1);
    if (!r) r = Expression_9(b, l + 1);
    if (!r) r = Expression_10(b, l + 1);
    if (!r) r = Expression_11(b, l + 1);
    if (!r) r = Expression_12(b, l + 1);
    if (!r) r = consumeToken(b, STRINGCONSTANT);
    if (!r) r = ListConstant(b, l + 1);
    if (!r) r = consumeToken(b, MAPCONSTANT);
    if (!r) r = consumeToken(b, OBJECTCONSTANT);
    if (!r) r = consumeToken(b, TRUE);
    if (!r) r = consumeToken(b, FALSE);
    if (!r) r = consumeToken(b, NULL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Symbol '(' (Symbol '=' Expression ';')* ')'
  private static boolean Expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYMBOL);
    r = r && consumeToken(b, "(");
    r = r && Expression_1_2(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // (Symbol '=' Expression ';')*
  private static boolean Expression_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression_1_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Expression_1_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Expression_1_2", c)) break;
    }
    return true;
  }

  // Symbol '=' Expression ';'
  private static boolean Expression_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYMBOL);
    r = r && consumeToken(b, "=");
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' Expression ')'
  private static boolean Expression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // Expression '|' Expression
  private static boolean Expression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression(b, l + 1);
    r = r && consumeToken(b, "|");
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Expression '&' Expression
  private static boolean Expression_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression(b, l + 1);
    r = r && consumeToken(b, "&");
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '!' Expression
  private static boolean Expression_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "!");
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Expression '+' Expression
  private static boolean Expression_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression(b, l + 1);
    r = r && consumeToken(b, "+");
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Expression '-' Expression
  private static boolean Expression_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression_8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression(b, l + 1);
    r = r && consumeToken(b, "-");
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Expression '*' Expression
  private static boolean Expression_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression_9")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression(b, l + 1);
    r = r && consumeToken(b, "*");
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Expression '/' Expression
  private static boolean Expression_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression_10")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression(b, l + 1);
    r = r && consumeToken(b, "/");
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '+' Expression
  private static boolean Expression_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression_11")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "+");
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '-' Expression
  private static boolean Expression_12(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression_12")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "-");
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '[' (Constant ';')* ']'
  public static boolean ListConstant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ListConstant")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LIST_CONSTANT, "<list constant>");
    r = consumeToken(b, "[");
    r = r && ListConstant_1(b, l + 1);
    r = r && consumeToken(b, "]");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (Constant ';')*
  private static boolean ListConstant_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ListConstant_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ListConstant_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ListConstant_1", c)) break;
    }
    return true;
  }

  // Constant ';'
  private static boolean ListConstant_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ListConstant_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CONSTANT);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Symbol '=' LITERAL '{' ( LanguageCode ':' StringConstant ';' )* '}'
  public static boolean LiteralBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LiteralBlock")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYMBOL);
    r = r && consumeToken(b, "=");
    r = r && consumeToken(b, LITERAL);
    r = r && consumeToken(b, "{");
    r = r && LiteralBlock_4(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, LITERAL_BLOCK, r);
    return r;
  }

  // ( LanguageCode ':' StringConstant ';' )*
  private static boolean LiteralBlock_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LiteralBlock_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!LiteralBlock_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "LiteralBlock_4", c)) break;
    }
    return true;
  }

  // LanguageCode ':' StringConstant ';'
  private static boolean LiteralBlock_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LiteralBlock_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LANGUAGECODE);
    r = r && consumeToken(b, ":");
    r = r && consumeToken(b, STRINGCONSTANT);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // METHOD '{' REQUEST ':' ParametersBlock ';' RESPONSE ':' ParametersBlock ';' [ BODY ':' PhpBlock ';'] '}'
  public static boolean MethodBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodBlock")) return false;
    if (!nextTokenIs(b, METHOD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, METHOD);
    r = r && consumeToken(b, "{");
    r = r && consumeToken(b, REQUEST);
    r = r && consumeToken(b, ":");
    r = r && ParametersBlock(b, l + 1);
    r = r && consumeToken(b, ";");
    r = r && consumeToken(b, RESPONSE);
    r = r && consumeToken(b, ":");
    r = r && ParametersBlock(b, l + 1);
    r = r && consumeToken(b, ";");
    r = r && MethodBlock_10(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, METHOD_BLOCK, r);
    return r;
  }

  // [ BODY ':' PhpBlock ';']
  private static boolean MethodBlock_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodBlock_10")) return false;
    MethodBlock_10_0(b, l + 1);
    return true;
  }

  // BODY ':' PhpBlock ';'
  private static boolean MethodBlock_10_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodBlock_10_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BODY);
    r = r && consumeToken(b, ":");
    r = r && PhpBlock(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // BinConstant
  //                             | OctConstant
  //                             | DecConstant
  //                             | HexConstant
  public static boolean NumericConstant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NumericConstant")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NUMERIC_CONSTANT, "<numeric constant>");
    r = consumeToken(b, BINCONSTANT);
    if (!r) r = consumeToken(b, OCTCONSTANT);
    if (!r) r = consumeToken(b, DECCONSTANT);
    if (!r) r = consumeToken(b, HEXCONSTANT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // PARAMETERS '{' (Symbol ':' Constant ['=' Constant] ';')* '}'
  public static boolean ParametersBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParametersBlock")) return false;
    if (!nextTokenIs(b, PARAMETERS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PARAMETERS);
    r = r && consumeToken(b, "{");
    r = r && ParametersBlock_2(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, PARAMETERS_BLOCK, r);
    return r;
  }

  // (Symbol ':' Constant ['=' Constant] ';')*
  private static boolean ParametersBlock_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParametersBlock_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ParametersBlock_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ParametersBlock_2", c)) break;
    }
    return true;
  }

  // Symbol ':' Constant ['=' Constant] ';'
  private static boolean ParametersBlock_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParametersBlock_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYMBOL);
    r = r && consumeToken(b, ":");
    r = r && consumeToken(b, CONSTANT);
    r = r && ParametersBlock_2_0_3(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // ['=' Constant]
  private static boolean ParametersBlock_2_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParametersBlock_2_0_3")) return false;
    ParametersBlock_2_0_3_0(b, l + 1);
    return true;
  }

  // '=' Constant
  private static boolean ParametersBlock_2_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParametersBlock_2_0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "=");
    r = r && consumeToken(b, CONSTANT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // PHP '{?' PhpCode '?}'
  public static boolean PhpBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PhpBlock")) return false;
    if (!nextTokenIs(b, PHP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PHP);
    r = r && consumeToken(b, "{?");
    r = r && consumeToken(b, PHPCODE);
    r = r && consumeToken(b, "?}");
    exit_section_(b, m, PHP_BLOCK, r);
    return r;
  }

  /* ********************************************************** */
  // TYPE '(' ( Symbol ':' Expression ['=' Expression] ';')* ')' '{' CRITERIA ':' PhpBlock ';' '}'
  public static boolean TypeBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeBlock")) return false;
    if (!nextTokenIs(b, TYPE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TYPE);
    r = r && consumeToken(b, "(");
    r = r && TypeBlock_2(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && consumeToken(b, "{");
    r = r && consumeToken(b, CRITERIA);
    r = r && consumeToken(b, ":");
    r = r && PhpBlock(b, l + 1);
    r = r && consumeToken(b, ";");
    r = r && consumeToken(b, "}");
    exit_section_(b, m, TYPE_BLOCK, r);
    return r;
  }

  // ( Symbol ':' Expression ['=' Expression] ';')*
  private static boolean TypeBlock_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeBlock_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!TypeBlock_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TypeBlock_2", c)) break;
    }
    return true;
  }

  // Symbol ':' Expression ['=' Expression] ';'
  private static boolean TypeBlock_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeBlock_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYMBOL);
    r = r && consumeToken(b, ":");
    r = r && Expression(b, l + 1);
    r = r && TypeBlock_2_0_3(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // ['=' Expression]
  private static boolean TypeBlock_2_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeBlock_2_0_3")) return false;
    TypeBlock_2_0_3_0(b, l + 1);
    return true;
  }

  // '=' Expression
  private static boolean TypeBlock_2_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeBlock_2_0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "=");
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TypeBlock
  //                             | EntityBlock
  //                             | MethodBlock
  //                             | LiteralBlock+
  //                             | ErrorBlock+
  //                             | ConstantBlock+
  static boolean XuaFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XuaFile")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TypeBlock(b, l + 1);
    if (!r) r = EntityBlock(b, l + 1);
    if (!r) r = MethodBlock(b, l + 1);
    if (!r) r = XuaFile_3(b, l + 1);
    if (!r) r = XuaFile_4(b, l + 1);
    if (!r) r = XuaFile_5(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LiteralBlock+
  private static boolean XuaFile_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XuaFile_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = LiteralBlock(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!LiteralBlock(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "XuaFile_3", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ErrorBlock+
  private static boolean XuaFile_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XuaFile_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ErrorBlock(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!ErrorBlock(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "XuaFile_4", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ConstantBlock+
  private static boolean XuaFile_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XuaFile_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ConstantBlock(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!ConstantBlock(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "XuaFile_5", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

}
