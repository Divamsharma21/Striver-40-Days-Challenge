class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>>res=new ArrayList<>();
        part(res,new ArrayList<String>(),s,0);
        return res;
    }
    
    public void part( List<List<String>>res ,ArrayList<String>ans,String s,int idx ){
        if(idx==s.length()){
           
                res.add(new ArrayList<>(ans));
                return;
            }
      for(int i=idx;i<s.length();i++){
          if(isPalindrome(s,idx,i)){
              ans.add(s.substring(idx, i + 1));
               part(res,ans,s,i+1);
              ans.remove(ans.size()-1);
          }
      }
        
        
    }
    
    
     static boolean isPalindrome(String s, int start, int end) {
        while (start <= end) {
            if (s.charAt(start++) != s.charAt(end--))
                return false;
        }
        return true;
    }
}