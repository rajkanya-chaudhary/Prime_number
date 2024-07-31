public class String_compression {
        public static String compressString(String str) {
            int n = str.length();
            if (n == 0) {
                return str;
            }
    
            StringBuilder compressed = new StringBuilder();
            int count = 1;
    
            for (int i = 1; i < n; i++) {
                if (str.charAt(i) == str.charAt(i - 1)) {
                    count++;
                } else {
                    compressed.append(str.charAt(i - 1));
                    compressed.append(count);
                    count = 1;
                }
            }
    
            // Append the last character and its count
            compressed.append(str.charAt(n - 1));
            compressed.append(count);
    
            String compressedStr = compressed.toString();
            return compressedStr.length() < n ? compressedStr : str;
        }
    
        public static void main(String[] args) {
            String str = "aabcccccaaa";
            String compressedStr = compressString(str);
            System.out.println("Original String: " + str);
            System.out.println("Compressed String: " + compressedStr);
        }
    }
    
    

