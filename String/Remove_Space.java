package String;

public class Remove_Space {
    public static void main(String[] args) {
        String str = "Java is very easy";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ') {
                result = result + ch;
            }
        }
        System.out.println(result);
    }
}
