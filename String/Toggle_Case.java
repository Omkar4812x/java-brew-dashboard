package String;

public class Toggle_Case {
    public static void main(String[] args) {
        String str = "JavaDeVeLoPeR";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);

            } else if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);

            }
            System.out.print(ch);
        }

    }
}
