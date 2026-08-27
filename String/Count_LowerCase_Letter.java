package String;

public class Count_LowerCase_Letter {
    public static void main(String[] args) {
        String str = "JavaDeveloper2026";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                count++;
            }
        }
        System.out.println("Count is : " + count);
    }
}
