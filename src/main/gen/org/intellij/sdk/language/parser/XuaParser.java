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
  // SYMBOL '=' Expression
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
  // ENTITY '{' FIELDS ':' Expression '}'
  public static boolean EntityBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EntityBlock")) return false;
    if (!nextTokenIs(b, ENTITY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ENTITY);
    r = r && consumeToken(b, "{");
    r = r && consumeToken(b, FIELDS);
    r = r && consumeToken(b, ":");
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, ENTITY_BLOCK, r);
    return r;
  }

  /* ********************************************************** */
  // SYMBOL
  //                             | LITERAL '{' ( LANGUAGE_CODE ':' STRING_CONSTANT ';' )* '}'
  //                             | '{%' PHP_CODE '%}'
  //                             | SYMBOL '(' (SYMBOL '=' Expression ';')* ')'
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
  //                             | ObjectConstant
  //                             | MapConstant
  //                             | ListConstant
  //                             | STRING_CONSTANT
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
    if (!r) r = Expression_6(b, l + 1);
    if (!r) r = Expression_7(b, l + 1);
    if (!r) r = NumericConstant(b, l + 1);
    if (!r) r = Expression_9(b, l + 1);
    if (!r) r = Expression_10(b, l + 1);
    if (!r) r = Expression_11(b, l + 1);
    if (!r) r = Expression_12(b, l + 1);
    if (!r) r = Expression_13(b, l + 1);
    if (!r) r = Expression_14(b, l + 1);
    if (!r) r = ObjectConstant(b, l + 1);
    if (!r) r = MapConstant(b, l + 1);
    if (!r) r = ListConstant(b, l + 1);
    if (!r) r = consumeToken(b, STRING_CONSTANT);
    if (!r) r = consumeToken(b, TRUE);
    if (!r) r = consumeToken(b, FALSE);
    if (!r) r = consumeToken(b, NULL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // LITERAL '{' ( LANGUAGE_CODE ':' STRING_CONSTANT ';' )* '}'
  private static boolean Expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LITERAL);
    r = r && consumeToken(b, "{");
    r = r && Expression_1_2(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, null, r);
    return r;
  }

  // ( LANGUAGE_CODE ':' STRING_CONSTANT ';' )*
  private static boolean Expression_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression_1_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Expression_1_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Expression_1_2", c)) break;
    }
    return true;
  }

  // LANGUAGE_CODE ':' STRING_CONSTANT ';'
  private static boolean Expression_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LANGUAGE_CODE);
    r = r && consumeToken(b, ":");
    r = r && consumeToken(b, STRING_CONSTANT);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // '{%' PHP_CODE '%}'
  private static boolean Expression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "{%");
    r = r && consumeToken(b, PHP_CODE);
    r = r && consumeToken(b, "%}");
    exit_section_(b, m, null, r);
    return r;
  }

  // SYMBOL '(' (SYMBOL '=' Expression ';')* ')'
  private static boolean Expression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYMBOL);
    r = r && consumeToken(b, "(");
    r = r && Expression_3_2(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // (SYMBOL '=' Expression ';')*
  private static boolean Expression_3_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression_3_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Expression_3_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Expression_3_2", c)) break;
    }
    return true;
  }

  // SYMBOL '=' Expression ';'
  private static boolean Expression_3_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression_3_2_0")) return false;
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
  private static boolean Expression_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // Expression '|' Expression
  private static boolean Expression_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression(b, l + 1);
    r = r && consumeToken(b, "|");
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Expression '&' Expression
  private static boolean Expression_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression(b, l + 1);
    r = r && consumeToken(b, "&");
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '!' Expression
  private static boolean Expression_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "!");
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Expression '+' Expression
  private static boolean Expression_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression_9")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression(b, l + 1);
    r = r && consumeToken(b, "+");
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Expression '-' Expression
  private static boolean Expression_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression_10")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression(b, l + 1);
    r = r && consumeToken(b, "-");
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Expression '*' Expression
  private static boolean Expression_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression_11")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression(b, l + 1);
    r = r && consumeToken(b, "*");
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Expression '/' Expression
  private static boolean Expression_12(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression_12")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression(b, l + 1);
    r = r && consumeToken(b, "/");
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '+' Expression
  private static boolean Expression_13(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression_13")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "+");
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '-' Expression
  private static boolean Expression_14(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression_14")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "-");
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '[' (Expression ';')* ']'
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

  // (Expression ';')*
  private static boolean ListConstant_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ListConstant_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ListConstant_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ListConstant_1", c)) break;
    }
    return true;
  }

  // Expression ';'
  private static boolean ListConstant_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ListConstant_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '[' (Expression '=>' Expression ';')* ']'
  public static boolean MapConstant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapConstant")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MAP_CONSTANT, "<map constant>");
    r = consumeToken(b, "[");
    r = r && MapConstant_1(b, l + 1);
    r = r && consumeToken(b, "]");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (Expression '=>' Expression ';')*
  private static boolean MapConstant_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapConstant_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!MapConstant_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MapConstant_1", c)) break;
    }
    return true;
  }

  // Expression '=>' Expression ';'
  private static boolean MapConstant_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapConstant_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression(b, l + 1);
    r = r && consumeToken(b, "=>");
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // METHOD '{' REQUEST ':' Expression RESPONSE ':' Expression BODY ':' Expression '}'
  public static boolean MethodBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodBlock")) return false;
    if (!nextTokenIs(b, METHOD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, METHOD);
    r = r && consumeToken(b, "{");
    r = r && consumeToken(b, REQUEST);
    r = r && consumeToken(b, ":");
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, RESPONSE);
    r = r && consumeToken(b, ":");
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, BODY);
    r = r && consumeToken(b, ":");
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, METHOD_BLOCK, r);
    return r;
  }

  /* ********************************************************** */
  // BIN_CONSTANT
  //                             | OCT_CONSTANT
  //                             | DEC_CONSTANT
  //                             | HEX_CONSTANT
  public static boolean NumericConstant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NumericConstant")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NUMERIC_CONSTANT, "<numeric constant>");
    r = consumeToken(b, BIN_CONSTANT);
    if (!r) r = consumeToken(b, OCT_CONSTANT);
    if (!r) r = consumeToken(b, DEC_CONSTANT);
    if (!r) r = consumeToken(b, HEX_CONSTANT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '{' (Expression '=>' Expression ';')* '}'
  public static boolean ObjectConstant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectConstant")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OBJECT_CONSTANT, "<object constant>");
    r = consumeToken(b, "{");
    r = r && ObjectConstant_1(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (Expression '=>' Expression ';')*
  private static boolean ObjectConstant_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectConstant_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ObjectConstant_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ObjectConstant_1", c)) break;
    }
    return true;
  }

  // Expression '=>' Expression ';'
  private static boolean ObjectConstant_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectConstant_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression(b, l + 1);
    r = r && consumeToken(b, "=>");
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SUPER '(' ( SYMBOL ':' Expression ['=' Expression] ';')* ')' '{' VALIDATION ':' Expression CRITERIA ':' Expression '}'
  public static boolean SuperBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SuperBlock")) return false;
    if (!nextTokenIs(b, SUPER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SUPER);
    r = r && consumeToken(b, "(");
    r = r && SuperBlock_2(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && consumeToken(b, "{");
    r = r && consumeToken(b, VALIDATION);
    r = r && consumeToken(b, ":");
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, CRITERIA);
    r = r && consumeToken(b, ":");
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, SUPER_BLOCK, r);
    return r;
  }

  // ( SYMBOL ':' Expression ['=' Expression] ';')*
  private static boolean SuperBlock_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SuperBlock_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!SuperBlock_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "SuperBlock_2", c)) break;
    }
    return true;
  }

  // SYMBOL ':' Expression ['=' Expression] ';'
  private static boolean SuperBlock_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SuperBlock_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYMBOL);
    r = r && consumeToken(b, ":");
    r = r && Expression(b, l + 1);
    r = r && SuperBlock_2_0_3(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // ['=' Expression]
  private static boolean SuperBlock_2_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SuperBlock_2_0_3")) return false;
    SuperBlock_2_0_3_0(b, l + 1);
    return true;
  }

  // '=' Expression
  private static boolean SuperBlock_2_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SuperBlock_2_0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "=");
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ConstantBlock+
  //                             | SuperBlock
  //                             | MethodBlock
  //                             | EntityBlock
  static boolean XuaFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XuaFile")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = XuaFile_0(b, l + 1);
    if (!r) r = SuperBlock(b, l + 1);
    if (!r) r = MethodBlock(b, l + 1);
    if (!r) r = EntityBlock(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ConstantBlock+
  private static boolean XuaFile_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XuaFile_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ConstantBlock(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!ConstantBlock(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "XuaFile_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

}
