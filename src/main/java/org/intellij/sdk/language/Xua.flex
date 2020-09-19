package org.intellij.sdk.language;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import org.intellij.sdk.language.psi.XuaTypes;import org.intellij.sdk.language.psi.XuaTypes;
import com.intellij.psi.TokenType;

%%

%class XuaLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

                WHITE_SPACE = \s
                    COMMENT = "#"[^\r\n]*
                      SUPER = "Super"
                 VALIDATION = "Validation"
                   CRITERIA = "Criteria"
//                     ENTITY = "Entity"
//                     FIELDS = "Fields"
                     METHOD = "Method"
                    REQUEST = "Request"
                   RESPONSE = "Response"
                       BODY = "Body"
                    LITERAL = "Literal"
                       TRUE = "TRUE"
                      FALSE = "FALSE"
                       NULL = "NULL"
                     SYMBOL = [a-zA-Z_][a-zA-Z0-9_]*
//                   PHP_CODE = (?:(?!\%\})(.|\s))*
                   PHP_CODE = "PHPCODE"
            STRING_CONSTANT = ('([^'\\]|\\.)*'|\"([^\"\\]|\\\"|\\\'|\\)*\")
              LANGUAGE_CODE = (af-ZA|sq-AL|ar-DZ|ar-BH|ar-EG|ar-IQ|ar-JO|ar-KW|ar-LB|ar-LY|ar-MA|ar-OM|ar-QA|ar-SA|ar-SY|ar-TN|ar-AE|ar-YE|hy-AM|Cy-az-AZ|Lt-az-AZ|eu-ES|be-BY|bg-BG|ca-ES|zh-CN|zh-HK|zh-MO|zh-SG|zh-TW|zh-CHS|zh-CHT|hr-HR|cs-CZ|da-DK|div-MV|nl-BE|nl-NL|en-AU|en-BZ|en-CA|en-CB|en-IE|en-JM|en-NZ|en-PH|en-ZA|en-TT|en-GB|en-US|en-ZW|et-EE|fo-FO|fa-IR|fi-FI|fr-BE|fr-CA|fr-FR|fr-LU|fr-MC|fr-CH|gl-ES|ka-GE|de-AT|de-DE|de-LI|de-LU|de-CH|el-GR|gu-IN|he-IL|hi-IN|hu-HU|is-IS|id-ID|it-IT|it-CH|ja-JP|kn-IN|kk-KZ|kok-IN|ko-KR|ky-KZ|lv-LV|lt-LT|mk-MK|ms-BN|ms-MY|mr-IN|mn-MN|nb-NO|nn-NO|pl-PL|pt-BR|pt-PT|pa-IN|ro-RO|ru-RU|sa-IN|Cy-sr-SP|Lt-sr-SP|sk-SK|sl-SI|es-AR|es-BO|es-CL|es-CO|es-CR|es-DO|es-EC|es-SV|es-GT|es-HN|es-MX|es-NI|es-PA|es-PY|es-PE|es-PR|es-ES|es-UY|es-VE|sw-KE|sv-FI|sv-SE|syr-SY|ta-IN|tt-RU|te-IN|th-TH|tr-TR|uk-UA|ur-PK|Cy-uz-UZ|Lt-uz-UZ|vi-VN)
               BIN_CONSTANT = 0b([0-1]+(\.[0-1]+)?|\.[0-1]+)
               OCT_CONSTANT = 0([0-7]+(\.[0-7]+)?|\.[0-7]+)
               DEC_CONSTANT = ([0-9]+(\.[0-9]+)?|\.[0-9]+)
               HEX_CONSTANT = 0x([0-9a-fA-F]+(\.[0-9a-fA-F]+)?|\.[0-9a-fA-F]+)

%state WAITING_VALUE

%%

{COMMENT}                                                   { yybegin(YYINITIAL); }

{SUPER}                                                     { yybegin(YYINITIAL); return XuaTypes.SUPER; }

{VALIDATION}                                                { yybegin(YYINITIAL); return XuaTypes.VALIDATION; }

{CRITERIA}                                                  { yybegin(YYINITIAL); return XuaTypes.CRITERIA; }

{METHOD}                                                    { yybegin(YYINITIAL); return XuaTypes.METHOD; }

{REQUEST}                                                   { yybegin(YYINITIAL); return XuaTypes.REQUEST; }

{RESPONSE}                                                  { yybegin(YYINITIAL); return XuaTypes.RESPONSE; }

{BODY}                                                      { yybegin(YYINITIAL); return XuaTypes.BODY; }

{LITERAL}                                                   { yybegin(YYINITIAL); return XuaTypes.LITERAL; }

{TRUE}                                                      { yybegin(YYINITIAL); return XuaTypes.TRUE; }

{FALSE}                                                     { yybegin(YYINITIAL); return XuaTypes.FALSE; }

{NULL}                                                      { yybegin(YYINITIAL); return XuaTypes.NULL; }

{SYMBOL}                                                    { yybegin(YYINITIAL); return XuaTypes.SYMBOL; }

{PHP_CODE}                                                  { yybegin(YYINITIAL); return XuaTypes.PHP_CODE; }

{STRING_CONSTANT}                                           { yybegin(YYINITIAL); return XuaTypes.STRING_CONSTANT; }

{LANGUAGE_CODE}                                             { yybegin(YYINITIAL); return XuaTypes.LANGUAGE_CODE; }

{BIN_CONSTANT}                                              { yybegin(YYINITIAL); return XuaTypes.BIN_CONSTANT; }

{OCT_CONSTANT}                                              { yybegin(YYINITIAL); return XuaTypes.OCT_CONSTANT; }

{DEC_CONSTANT}                                              { yybegin(YYINITIAL); return XuaTypes.DEC_CONSTANT; }

{HEX_CONSTANT}                                              { yybegin(YYINITIAL); return XuaTypes.HEX_CONSTANT; }

({WHITE_SPACE})+                                            { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

[^]                                                         { return TokenType.BAD_CHARACTER; }
