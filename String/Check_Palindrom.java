package String;

public class Check_Palindrom {
    public static void main(String[] args) {
        String str = "madam";
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {

            char ch = str.charAt(i);
            rev = rev + ch;

        }
        boolean x = false;

        for (int i = 0; i < str.length(); i++) {
            if (str.equals(rev)) {
                x = true;
                System.out.println("Palindrom");
                break;
            }
        }
        if (!x) {
            System.out.println("Not palindrom");
        }

    }
}
