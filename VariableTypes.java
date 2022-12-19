package PokeAPI;

public class VariableTypes {
    public static boolean stringIsInt(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
}
