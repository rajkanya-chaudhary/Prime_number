public class Count_Duplicate_String {
    public static void main(String[] args) {
                String input = "example string with duplicates";
                int length = input.length();
        
                // Convert the string to a character array
                char[] chars = input.toCharArray();
                boolean[] visited = new boolean[length]; // Array to mark visited characters
        
                System.out.println("Duplicate characters in the string:");
        
                // Iterate over each character in the array
                for (int i = 0; i < length; i++) {
                    // Skip already visited characters
                    if (visited[i] || chars[i] == ' ') 
                    continue;
        
                    int count = 1;
                    for (int j = i + 1; j < length; j++) {
                        if (chars[i] == chars[j]) {
                            count++;
                            visited[j] = true; // Mark the character as visited
                        }
                    }
        
                    // If count is greater than 1, it's a duplicate
                    if (count > 1) {
                        System.out.println(chars[i] + ": " + count);
                    }
                }
            
        
        
    }
}
