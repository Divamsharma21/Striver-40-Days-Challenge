class Solution {
    
//     public int  nCr(int n,int r){
//         long res=1;
//         for(int i=0;i<=r;i++){
//             res=res*(n-i);
//             res=res/(i+1);
              
//         }
//          return (int) res;
//     }
    public List<Integer> getRow(int k) {
//         List<Integer> ans=new ArrayList<>();
        
//           for(int j=1;j<=rowIndex;j++){
//               ans.add(nCr(rowIndex,j-1));
//           }
        
//         return ans;
        
        
        Integer[] arr = new Integer[k + 1];
        Arrays.fill(arr, 0);
        arr[0] = 1;
        
        for (int i = 1; i <= k; i++) 
            for (int j = i; j > 0; j--) 
                arr[j] = arr[j] + arr[j - 1];
        
        return Arrays.asList(arr);
    }
    }
