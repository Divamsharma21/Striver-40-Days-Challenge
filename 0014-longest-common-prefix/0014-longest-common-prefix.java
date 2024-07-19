class Solution {
    public String longestCommonPrefix(String[] strs) {
//         for(int i=0;i<strs.length;i++){
//             if(strs.Substring[0,i]=strs.Substring[i,i+1]){
//                 return strs.substring(0,i);
//             }
            
//         }
//         return strs;
        
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        int idx = 0;
        while(idx < s1.length() && idx < s2.length()){
            if(s1.charAt(idx) == s2.charAt(idx)){
                idx++;
            } else {
                break;
            }
        }
        return s1.substring(0, idx);
    }
    }
 