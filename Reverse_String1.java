/*public class Reverse_String1 {
    public static void main(String[] args) {
        String str = "dimpal";
        String rev = "";
        for(int i = str.length()-1;i>=0;i--)
        {
            rev = rev + rev.charAt(i);

        }
        System.out.println(rev);
    }
}
    */
    public class Reverse_String1 {
        public static void main(String[] args) {
            String str = "dimpal";
            String rev = "";
            for(int i = str.length() - 1; i >= 0; i--) {
                rev = rev + str.charAt(i);
            }
            System.out.println(rev);
        }
    }
    
