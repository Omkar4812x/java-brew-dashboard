package String;

public class Count_Spaces {
    public static void main(String[] args) {

        String str = "java is easy";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                count++;
            }
        }
        System.out.println("Space Count is : " + count);
    }
}
