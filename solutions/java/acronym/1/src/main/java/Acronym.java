class Acronym {

    private final String phrase;

    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
        if (phrase == null || phrase.isEmpty()) { return ""; }
        
        String[] words = phrase.toUpperCase().replaceAll("[^A-Z0-9\\s-]", "").trim().split("[\\s-]+");
        StringBuilder acronym = new StringBuilder();
        for(String word : words) {
            acronym.append(word.charAt(0));
        }
        return acronym.toString();
    }

}
