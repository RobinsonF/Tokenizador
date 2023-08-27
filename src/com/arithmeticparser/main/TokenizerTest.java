package com.arithmeticparser.main;

import com.arithmeticparser.gui.IDE;
import com.arithmeticparser.tokens.LexerException;
import com.arithmeticparser.tokens.Token;
import com.arithmeticparser.tokens.Tokenizer;

public class TokenizerTest {

    public static void main(String[] args) {
        Tokenizer tokenizer = new Tokenizer();        
        tokenizer.add("ClassRoom|Begin|End|ln|sqrt", Token.FUNCTION); // function
        tokenizer.add("\\(", Token.OPEN_BRACKET); // open bracket
        tokenizer.add("\\)", Token.CLOSE_BRACKET); // close bracket
        tokenizer.add("[+-]", Token.PLUSMINUS); // plus or minus
        tokenizer.add("[*/]", Token.MULTDIV); // mult or divide
        tokenizer.add("\\^", Token.RAISED); // raised
        tokenizer.add("[0-9]+", Token.NUMBER); // integer number
        tokenizer.add("[a-zA-Z][a-zA-Z0-9_]*", Token.VARIABLE); // variable

        try {
            tokenizer.tokenize("(6+(8^2/ln(5)");
            
            IDE ide = new IDE();
            
            System.out.println("\n=========TOKEN LIST==========\n");

            for (Token tok : tokenizer.getTokens()) {
                System.out.println("[Token:" + tok.token + " Lexema:" + tok.lexeme + " Posicion:" + tok.pos + "]");
            }
        } catch (LexerException e) {
            System.out.println(e.getMessage());
        }
        
    }

}
