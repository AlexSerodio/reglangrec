/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package furb;

/**
 *
 * @author Bruna
 */
public enum SpecialSymbol {

    COMMA(","), SEMICOLON(";"), EQUALS("=");

    private final String description;

    SpecialSymbol(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
    
    public static boolean containsSymbol(String str) {
        return (checkSymbol(str) != null);
    }

    public static SpecialSymbol checkSymbol(String str) {
        
        for (SpecialSymbol s : SpecialSymbol.values()) {
            if (str.equalsIgnoreCase(s.getDescription())) {
                return s;
            }
        }

        return null;
    }

}