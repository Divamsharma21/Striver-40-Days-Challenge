class Solution {
    public int longestCommonSubsequence(String text1, String text2) {

        // for (int rows[] : dp)
        // Arrays.fill(rows, -1);
        // return getSubsequence(text1, text2, text1.length() - 1, text2.length() - 1);

        return getSubsequence(text1, text2);

    }

 public int getSubsequence(String t1, String t2) {
        int n = t1.length();
        int m = t2.length();

        // Create a 2D array to store results of subproblems
        int prev[] = new int[m + 1];
             int curr[] = new int[m + 1];



        
        // Fill the dp array using dynamic programming
        for (int ind1 = 1; ind1 <= n; ind1++) {
            for (int ind2 = 1; ind2 <= m; ind2++) {
                // If the characters at the current indices are the same, increment the LCS
                // length
                if (t1.charAt(ind1 - 1) == t2.charAt(ind2 - 1))
                  curr[ind2] = 1 + prev[ind2 - 1];
                // If the characters are different, choose the maximum LCS length by either
                // excluding a character in s1 or excluding a character in s2
                else
                   curr[ind2] = Math.max(prev[ind2],curr[ind2 - 1]);
            }
            // Update the 'prev' array to the values of 'cur' for the next iteration
            prev = (int[]) (curr.clone());
        }

        return prev[m]; // Return the length of the Longest Common Subsequence (LCS)
    }
    
}
// tabulation code
    // public int getSubsequence(String t1, String t2) {
    //     int n = t1.length();
    //     int m = t2.length();

    //     // Create a 2D array to store results of subproblems
    //     int dp[][] = new int[n + 1][m + 1];

    //     dp[0][0] = 0;

    //     // Initialize the first row and first column with zeros since LCS with an empty
    //     // string is zero
    //     for (int i = 0; i <= n; i++) {
    //         dp[i][0] = 0;
    //     }
    //     for (int i = 0; i <= m; i++) {
    //         dp[0][i] = 0;
    //     }
    //     // Fill the dp array using dynamic programming
    //     for (int ind1 = 1; ind1 <= n; ind1++) {
    //         for (int ind2 = 1; ind2 <= m; ind2++) {
    //             // If the characters at the current indices are the same, increment the LCS
    //             // length
    //             if (t1.charAt(ind1 - 1) == t2.charAt(ind2 - 1))
    //                 dp[ind1][ind2] = 1 + dp[ind1 - 1][ind2 - 1];
    //             // If the characters are different, choose the maximum LCS length by either
    //             // excluding a character in s1 or excluding a character in s2
    //             else
    //                 dp[ind1][ind2] = Math.max(dp[ind1 - 1][ind2], dp[ind1][ind2 - 1]);
    //         }
    //     }

    //     return dp[n][m]; // Return the length of the Longest Common Subsequence (LCS)
// }
    

// memorization
   // public int getSubsequence(String t1, String t2, int idx1, int idx2, int[][]
 // dp) {
 // if (idx1 < 0 || idx2 < 0) {
 // return 0;

  // }

 // if (dp[idx1][idx2] != -1) {
 // return dp[idx1][idx2];
 // }
 // if (t1.charAt(idx1) == t2.charAt(idx2)) {
 // return dp[idx1][idx2] = 1 + getSubsequence(t1, t2, idx1 - 1, idx2 - 1, dp);
 // } else {
 // return dp[idx1][idx2] = 0
 // + Math.max(getSubsequence(t1, t2, idx1, idx2 - 1, dp), getSubsequence(t1, t2,
 // idx1 - 1, idx2, dp));
 // }

// }
