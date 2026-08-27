package String;

public class Count_Specific_Character {
    public static void main(String[] args) {
        String str = "banana";
        char target = 'a';
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (target == ch) {
                count++;
            }
        }

        System.out.println("Target Conut is : " + count);
    }
}
