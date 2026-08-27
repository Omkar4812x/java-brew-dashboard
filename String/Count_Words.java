package String;

public class Count_Words {
    public static void main(String[] args) {
        String str = "Java is very easy";
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ' ') {
                count++;
            }
        }
        System.out.println("Word Cound : " + count);

    }
}
