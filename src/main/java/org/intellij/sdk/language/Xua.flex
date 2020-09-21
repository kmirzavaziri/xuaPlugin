package org.intellij.sdk.language;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import org.intellij.sdk.language.psi.XuaTokenType;import org.intellij.sdk.language.psi.XuaTypes;import org.intellij.sdk.language.psi.XuaTypes;
import com.intellij.psi.TokenType;

%%

%class XuaLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

%{
    StringBuffer string = new StringBuffer();

    StringBuffer phpCode = new StringBuffer();

//    private Symbol symbol(int type) {
//        return new Symbol(type, yyline, yycolumn);
//    }
//    private Symbol symbol(int type, Object value) {
//        return new Symbol(type, yyline, yycolumn, value);
//    }
%}

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
              LANGUAGE_CODE = (af-ZA|sq-AL|ar-DZ|ar-BH|ar-EG|ar-IQ|ar-JO|ar-KW|ar-LB|ar-LY|ar-MA|ar-OM|ar-QA|ar-SA|ar-SY|ar-TN|ar-AE|ar-YE|hy-AM|Cy-az-AZ|Lt-az-AZ|eu-ES|be-BY|bg-BG|ca-ES|zh-CN|zh-HK|zh-MO|zh-SG|zh-TW|zh-CHS|zh-CHT|hr-HR|cs-CZ|da-DK|div-MV|nl-BE|nl-NL|en-AU|en-BZ|en-CA|en-CB|en-IE|en-JM|en-NZ|en-PH|en-ZA|en-TT|en-GB|en-US|en-ZW|et-EE|fo-FO|fa-IR|fi-FI|fr-BE|fr-CA|fr-FR|fr-LU|fr-MC|fr-CH|gl-ES|ka-GE|de-AT|de-DE|de-LI|de-LU|de-CH|el-GR|gu-IN|he-IL|hi-IN|hu-HU|is-IS|id-ID|it-IT|it-CH|ja-JP|kn-IN|kk-KZ|kok-IN|ko-KR|ky-KZ|lv-LV|lt-LT|mk-MK|ms-BN|ms-MY|mr-IN|mn-MN|nb-NO|nn-NO|pl-PL|pt-BR|pt-PT|pa-IN|ro-RO|ru-RU|sa-IN|Cy-sr-SP|Lt-sr-SP|sk-SK|sl-SI|es-AR|es-BO|es-CL|es-CO|es-CR|es-DO|es-EC|es-SV|es-GT|es-HN|es-MX|es-NI|es-PA|es-PY|es-PE|es-PR|es-ES|es-UY|es-VE|sw-KE|sv-FI|sv-SE|syr-SY|ta-IN|tt-RU|te-IN|th-TH|tr-TR|uk-UA|ur-PK|Cy-uz-UZ|Lt-uz-UZ|vi-VN)
               BIN_CONSTANT = 0b([0-1]+(\.[0-1]+)?|\.[0-1]+)
               OCT_CONSTANT = 0([0-7]+(\.[0-7]+)?|\.[0-7]+)
               DEC_CONSTANT = ([0-9]+(\.[0-9]+)?|\.[0-9]+)
               HEX_CONSTANT = 0x([0-9a-fA-F]+(\.[0-9a-fA-F]+)?|\.[0-9a-fA-F]+)

                WHITE_SPACE = \s
                       HASH = "#"
               DOUBLE_QOUTE = "\""
               SINGLE_QOUTE = "'"
                      L_PHP = "<?php"
                      R_PHP = "?>"
              L_PHP_COMMENT = "/*"
              R_PHP_COMMENT = "*/"
                PHP_COMMENT = "//"

              L_PARENTHESIS = "("
              R_PARENTHESIS = ")"
                   L_BRACES = "{"
                   R_BRACES = "}"
                 L_BRACKETS = "["
                 R_BRACKETS = "]"
                      COLON = ":"
                  SEMICOLON = ";"
                     EQUALS = "="
                     MAPSTO = "=>"
                      UNION = "|"
               INTERSECTION = "&"
                 COMPLEMENT = "!"
                       PLUS = "+"
                      MINUS = "-"
                      TIMES = "*"
                     DIVIDE = "/"

%state STRING_DOUBLE, STRING_SINGLE, COMMENT, PHP, PHP_STRING_DOUBLE, PHP_STRING_SINGLE, PHP_COMMENT_SINGLE, PHP_COMMENT_MULTI

%%
<YYINITIAL> {
    {SUPER}                                           { return XuaTypes.SUPER; }

    {VALIDATION}                                      { return XuaTypes.VALIDATION; }

    {CRITERIA}                                        { return XuaTypes.CRITERIA; }

    {METHOD}                                          { return XuaTypes.METHOD; }

    {REQUEST}                                         { return XuaTypes.REQUEST; }

    {RESPONSE}                                        { return XuaTypes.RESPONSE; }

    {BODY}                                            { return XuaTypes.BODY; }

    {LITERAL}                                         { return XuaTypes.LITERAL; }

    {TRUE}                                            { return XuaTypes.TRUE; }

    {FALSE}                                           { return XuaTypes.FALSE; }

    {NULL}                                            { return XuaTypes.NULL; }

    {SYMBOL}                                          { return XuaTypes.SYMBOL; }

    {LANGUAGE_CODE}                                   { return XuaTypes.LANGUAGE_CODE; }

    {BIN_CONSTANT}                                    { return XuaTypes.BIN_CONSTANT; }

    {OCT_CONSTANT}                                    { return XuaTypes.OCT_CONSTANT; }

    {DEC_CONSTANT}                                    { return XuaTypes.DEC_CONSTANT; }

    {HEX_CONSTANT}                                    { return XuaTypes.HEX_CONSTANT; }

    {WHITE_SPACE}                                     { return TokenType.WHITE_SPACE; }

    {L_PHP}                                           { phpCode.setLength(0); yybegin(PHP); }

    {DOUBLE_QOUTE}                                    { string.setLength(0); yybegin(STRING_DOUBLE); }

    {SINGLE_QOUTE}                                    { string.setLength(0); yybegin(STRING_SINGLE); }

    {HASH}                                            { yybegin(COMMENT); }

    [^]                                               { return TokenType.BAD_CHARACTER; }
}

<STRING_DOUBLE> {
    \\[^]                                             { string.append(yytext().charAt(1)); /* TODO */ }

    {DOUBLE_QOUTE}                                    { yybegin(YYINITIAL); return XuaTypes.STRING_CONSTANT; /* string.toString() */ }

    [^]                                               { string.append(yytext()); }
}

<STRING_SINGLE> {
    \\[^]                                             { string.append(yytext().charAt(1)); /* TODO */ }

    {SINGLE_QOUTE}                                    { yybegin(YYINITIAL); return XuaTypes.STRING_CONSTANT; /* string.toString() */ }

    [^]                                               { string.append(yytext()); }
}

<COMMENT> {
    \R                                                { yybegin(YYINITIAL); return XuaTypes.COMMENT; }

    [^]                                               { }
}

<PHP> {
    {R_PHP}                                           { yybegin(YYINITIAL); return XuaTypes.PHP_BLOCK; /* phpCode.toString() */ }

    {DOUBLE_QOUTE}                                    { phpCode.append(yytext()); string.setLength(0); yybegin(PHP_STRING_DOUBLE); }

    {SINGLE_QOUTE}                                    { phpCode.append(yytext()); string.setLength(0); yybegin(PHP_STRING_SINGLE); }

    {HASH}                                            { phpCode.append(yytext()); yybegin(PHP_COMMENT_SINGLE); }

    {PHP_COMMENT}                                     { phpCode.append(yytext()); yybegin(PHP_COMMENT_SINGLE); }

    {L_PHP_COMMENT}                                   { phpCode.append(yytext()); yybegin(PHP_COMMENT_MULTI); }

    [^]                                               { phpCode.append(yytext()); }
}

<PHP_STRING_DOUBLE> {
    \\[^]                                             { phpCode.append(yytext()); }

    {DOUBLE_QOUTE}                                    { phpCode.append(yytext()); yybegin(PHP); }

    [^]                                               { phpCode.append(yytext()); }
}

<PHP_STRING_SINGLE> {
    \\[^]                                             { phpCode.append(yytext()); }

    {SINGLE_QOUTE}                                    { phpCode.append(yytext()); yybegin(PHP); }

    [^]                                               { phpCode.append(yytext()); }
}

<PHP_COMMENT_SINGLE> {
    {R_PHP}                                           { yybegin(YYINITIAL); return XuaTypes.PHP_BLOCK; /* phpCode.toString() */ }

    \R                                                { phpCode.append(yytext()); yybegin(PHP); }

    [^]                                               { phpCode.append(yytext()); }
}

<PHP_COMMENT_MULTI> {
    {R_PHP_COMMENT}                                   { phpCode.append(yytext()); yybegin(PHP); }

    [^]                                               { phpCode.append(yytext()); }
}

