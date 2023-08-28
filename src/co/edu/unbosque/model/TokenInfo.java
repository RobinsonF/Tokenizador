package co.edu.unbosque.model;

import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tokenizer {

    private LinkedList<TokenInfo> tokenInfos;
    private LinkedList<Token> tokens;

    public Tokenizer() {
        super();
        tokenInfos = new LinkedList<TokenInfo>();
        tokens = new LinkedList<Token>();
    }

    public void add(String regex, int token) {
    	//System.out.println(regex);
        tokenInfos.add(new TokenInfo(Pattern.compile("^(" + regex + ")"), token));
        System.out.println("tpkañ");

    }

    public void tokenize(String str) {
        String s = str.trim();
        int totalLength = s.length();
        tokens.clear();
        while (!s.equals("")) {
            System.out.println(s);
            int remaining = s.length();
            boolean match = false;
            System.out.println("en");
            for (TokenInfo info : tokenInfos) {
                System.out.println("e4n");
            	System.out.println(info.toString()+"i");
                Matcher m = info.regex.matcher(s);
                System.out.println(m+"m");
                if (m.find()) {
                    match = true;
                    String tok = m.group().trim();
                    s = m.replaceFirst("").trim();
                    tokens.add(new Token(info.token, tok, totalLength - remaining));
                    break;
                }
            }
            if (!match) {
                throw new LexerException("Unexpected character in input: " + s);
            }
        }
    }

    public LinkedList<Token> getTokens() {
        return tokens;
    }

	@Override
	public String toString() {
		return "Tokenizer [tokenInfos=" + tokenInfos + ", tokens=" + tokens + "]";
	}
    
    

}
