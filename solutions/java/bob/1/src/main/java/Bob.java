class Bob {

    String hey(String input) {
        input = input.trim();
        if(input.isEmpty()) { return "Fine. Be that way!"; }

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean isAQuestion = (input.charAt(input.length()-1) == '?');
        
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) { hasUpperCase = true; }
            if (Character.isLowerCase(c)) { hasLowerCase = true; }
        }

        boolean isYelling = !hasLowerCase && hasUpperCase;
        
        if (isYelling && isAQuestion) {
            return "Calm down, I know what I'm doing!";
        } else if (isYelling) {
            return "Whoa, chill out!";
        } else if (isAQuestion) {
            return "Sure.";
        } else {
            return "Whatever.";
        }
    }

}