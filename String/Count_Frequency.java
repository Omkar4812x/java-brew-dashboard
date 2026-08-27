package String;

public class Count_Frequency {
    public static void main(String[] args) {
        String str = "banana";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            boolean alreadyProcessed = false;

            for (int j = 0; j < i; j++) {
                if (ch == str.charAt(j)) {
                    alreadyProcessed = true;
                    break;
                }
            }

            if (!alreadyProcessed) {
                for (int j = 0; j < str.length(); j++) {
                    if (ch == str.charAt(j)) {
                        count++;
                    }
                }
                System.out.println(ch + " = " + count);
            }
        }
    }
}
