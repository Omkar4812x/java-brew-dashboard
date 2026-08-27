package String;

public class Remove_Duplicate_Characters {
    public static void main(String[] args) {
        String str = "programming";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            boolean isduplicate = false;
            for (int j = 0; j < i; j++) {
                if (ch == str.charAt(j)) {
                    isduplicate = true;
                    break;

                }
            }
            if (!isduplicate) {
                System.out.print(ch);
            }
        }
    }
}
