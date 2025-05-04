
public class ExceLSheetColumTitle {
    public static int titleToNumber(String title) {
        int result = 0;
        for (int i = 0; i < title.length(); i++) {
            char c = title.charAt(i);
            result = result * 26 + (c - 'A' + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(titleToNumber("A")); // 1
        System.out.println(titleToNumber("Z")); // 26
        System.out.println(titleToNumber("AA")); // 27
        System.out.println(titleToNumber("AB"));
        System.out.println(titleToNumber("ZZ"));
        System.out.println(titleToNumber("FXSHRXW"));
    }
}
