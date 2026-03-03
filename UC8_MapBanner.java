import java.util.HashMap;
import java.util.Map;

public class UC8_MapBanner {

    // Centralized storage using HashMap
    static Map<Character, String[]> characterMap = new HashMap<>();

    // Initialize all character patterns
    static void initializePatterns() {

        // Letter O
        characterMap.put('O', new String[]{
                "*****",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*****"
        });

        // Letter P
        characterMap.put('P', new String[]{
                "*****",
                "*   *",
                "*   *",
                "*****",
                "*    ",
                "*    ",
                "*    "
        });

        // Letter S (Corrected Alignment)
        characterMap.put('S', new String[]{
                "*****",
                "*    ",
                "*    ",
                "*****",
                "    *",
                "    *",
                "*****"
        });
    }

    // Render banner using Map lookup
    static void renderBanner(String word) {

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {

                String[] pattern = characterMap.get(ch);

                if (pattern != null) {
                    line.append(pattern[row]).append("  ");
                }
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        initializePatterns();

        String word = "OOPS";

        renderBanner(word);
    }
}