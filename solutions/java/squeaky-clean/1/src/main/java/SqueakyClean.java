import java.util.HashMap;
import java.util.Map;

class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder cast = new StringBuilder();
        char[] identifierCharArray = identifier.toCharArray();
        boolean kebabFlag = false;
        HashMap<Character, Character> leetCodeDict = new HashMap<>(Map.of(
            '4', 'a',
            '3', 'e',
            '0', 'o',
            '1', 'l',
            '7', 't'));
        
        for(char c : identifierCharArray) {
            //remove special characters
            if (String.valueOf(c).matches("[^A-Za-z0-9\\s-_]")) { continue; }
            
            // Convert leetspeak to normal
            if (leetCodeDict.containsKey(c)) {
                c = leetCodeDict.get(c);
            }
            // convert whitespaces to underscore
            if (Character.isWhitespace(c)) { 
                cast.append('_');
                continue;
            }
            // kebab-to-camel converter
            if (c == '-') {
                kebabFlag = true;
                continue;
            }
            c = (kebabFlag) ? Character.toUpperCase(c) : c;
            
            cast.append(c);
            kebabFlag = false; // resetting kebab Flag
        }
        return cast.toString();
    }
}
