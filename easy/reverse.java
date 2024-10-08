public class reverse {
    public static void main(String[] args) {
        String str = "Hello World";
        String reversed = reverseString(str);
        System.out.println("Reversed string: " + reversed);
    }

    public static String reverseString(String str) {
        String reversed = "";
        for(int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }
        return reversed;
    }
}