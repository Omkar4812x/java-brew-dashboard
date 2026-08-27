package String;

public class Cound_UpperCase_Letter {
    public static void main(String[] args) {

        String str = "JavaDeveloper2026";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                count++;
            }
        }
        System.out.println("UpperCase Letter Count is : " + count);
    }
}
