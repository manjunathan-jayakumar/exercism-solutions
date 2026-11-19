class IsogramChecker {

    boolean isIsogram(String phrase) {
        int[] counter = new int[36];
        for(int i = 0; i < phrase.length(); i++) {
            char c = phrase.charAt(i);
            if (Character.isLetterOrDigit(c)){
                if (Character.isDigit(c)){
                    int index = ((int) Character.toUpperCase(c)) - 48;
                    if (counter[index] > 0) { return false; }
                    counter[index]++;
                    continue;
                }
                int index = ((int) Character.toUpperCase(c)) - 55;
                if (counter[index] > 0) { return false; }
                    counter[index]++;
            }
        }
        return true;
    }

}
