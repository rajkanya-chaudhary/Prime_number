public class Count_String {
    public static int countword(String str)
    {
        if(str.length()== 0)
        {
            return 0;
        }
        int count = 0;
        for(int i = 0;i<str.length();i++)
        {
            if(str.charAt(i)== ' ')
            {
                count++;
            }
        }
        return count +1;

    }
    public static void main(String[] args) {
        String str = "i am dimpal chaudhary";
        System.out.println(countword(str));

    }
}
