package String;

public class First_Repeting_character {
    public static void main(String[] args) {

        String str = "programming";
        boolean found = false;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    count++;
                }
            }

            if (count > 1) {
                System.out.println("First repeating character is : " + ch);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No repeating character found.");
        }
    }
}
