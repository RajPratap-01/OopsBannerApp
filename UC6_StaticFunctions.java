public class UC6_StaticFunctions {

    // Letter O
    static String[] createO() {
        return new String[] {
            "*****",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*****"
        };
    }

    // Letter P
    static String[] createP() {
        return new String[] {
            "*****",
            "*   *",
            "*   *",
            "*****",
            "*",
            "*",
            "*"
        };
    }

    // Letter S (Correct Shape)
    static String[] createS() {
        return new String[] {
            "*****",
            "*    ",
            "*    ",
            "*****",
            "    *",
            "    *",
            "*****"
        };
    }

    public static void main(String[] args) {

        String[] O1 = createO();
        String[] O2 = createO();
        String[] P = createP();
        String[] S = createS();

        // Print Banner using loop
        for(int i = 0; i < 7; i++) {

            System.out.println(
                O1[i] + "  " +
                O2[i] + "  " +
                P[i] + "  " +
                S[i]
            );
        }
    }
}