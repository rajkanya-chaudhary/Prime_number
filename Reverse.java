public class Reverse {
    public static void main(String[] args) {
     String str = "dimpal";
     String rev = revStr(str);
     System.out.println("the rev string "  +rev);
    }
    public static String revStr(String str){
        if(str.isEmpty()){
            return str;
        }
        return revStr(str.substring(1))+str.charAt(0);
    }
}
