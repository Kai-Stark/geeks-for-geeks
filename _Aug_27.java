package geeks_for_geeks;

public class _Aug_27 {
    public static void main(String[] args) {
        String str = "GitHub";
        System.out.println(reverseWord(str));
    }

    private static String reverseWord(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb.reverse().toString();
    }

}
