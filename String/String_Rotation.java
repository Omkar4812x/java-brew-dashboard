package String;

public class String_Rotation {
    public static void main(String[] args) {

        String str1 = "abcd";
        String str2 = "cdab";

        boolean rotation = false;

        if (str1.length() != str2.length()) {
            rotation = false;
        } else {

            for (int i = 0; i < str1.length(); i++) {

                boolean match = true;

                for (int j = 0; j < str1.length(); j++) {

                    int index = i + j;

                    if (index >= str1.length()) {
                        index = index - str1.length();
                    }

                    if (str1.charAt(index) != str2.charAt(j)) {
                        match = false;
                        break;
                    }
                }

                if (match) {
                    rotation = true;
                    break;
                }
            }
        }

        if (rotation) {
            System.out.println("Rotation");
        } else {
            System.out.println("Not Rotation");
        }
    }
}