public class UC7_CharacterPattern {

    // Static Inner Class
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter
        public String[] getPattern() {
            return pattern;
        }

        public char getCharacter() {
            return character;
        }
    }

    public static void main(String[] args) {

        // Create Character Objects

        CharacterPatternMap O =
                new CharacterPatternMap('O', new String[]{
                        "*****",
                        "*   *",
                        "*   *",
                        "*   *",
                        "*   *",
                        "*   *",
                        "*****"
                });

        CharacterPatternMap P =
                new CharacterPatternMap('P', new String[]{
                        "*****",
                        "*   *",
                        "*   *",
                        "*****",
                        "*",
                        "*",
                        "*"
                });

        CharacterPatternMap S =
                new CharacterPatternMap('S', new String[]{
                        "*****",
                        "*",
                        "*",
                        "*****",
                        "    *",
                        "    *",
                        "*****"
                });

        // Store Word OOPS
        CharacterPatternMap[] word = {O, O, P, S};

        // Print Banner
        for (int i = 0; i < 7; i++) {

            StringBuilder line = new StringBuilder();

            for (CharacterPatternMap cp : word) {
                line.append(cp.getPattern()[i]).append("  ");
            }

            System.out.println(line);
        }
    }
}