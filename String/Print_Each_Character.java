package String;

public class Print_Each_Character {
    public static void main(String[] args) {
        String str = "Hello";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.print(ch + " ");
        }
    }
}
