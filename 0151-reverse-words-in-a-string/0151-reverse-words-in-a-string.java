class Solution {
    public String reverseWords(String s) {
//        // Trim the input string to remove leading and trailing spaces
//         String[] str = s.trim().split("\\s+");

//         // Initialize the output string
//         String out = "";

//         // Iterate through the words in reverse order
//         for (int i = str.length - 1; i > 0; i--) {
//             // Append the current word and a space to the output
//             out += str[i] + " ";
//         }

//         // Append the first word to the output (without trailing space)
//         return out + str[0];
        
        
          Stack<String> st = new Stack<String>();
        for (String a : s.trim().split(" ")) {
            if (!a.isEmpty())
                st.push(a);
        }
        
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
            sb.append(" ");            
        }
        
        return sb.toString().trim();
    }
}