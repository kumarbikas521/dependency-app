import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
class TestClass {
    public static void main(String args[] ) throws Exception {
      
		BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
        int n =Integer.valueOf(s.readLine()); 
           
             String str[] = s.readLine().split(" ");
          int[] arr1 = Arrays.asList(str).stream().mapToInt(Integer::parseInt).toArray();

            int k=Integer.valueOf(s.readLine()); 
            List<Integer> li = new ArrayList<Integer>();
             List<Integer> fl = new ArrayList<Integer>();
        for(int i=0;i<arr1.length-1;i++){
            int count = 0;
        if(!li.contains(Integer.valueOf(arr1[i]))){
           for(int p=i+1;p<arr1.length;p++){
               if(arr1[i]==arr1[p]){
                  // System.out.println(arr1[i]);
                   count++;
               }
                }
                if(count == 1){
                    fl.add(Integer.valueOf(arr1[i]));
                }
                li.add(Integer.valueOf(arr1[i]));
             }
                        
        }
        Collections.sort(fl);
         System.out.println(fl.get(0));
       
      
           
        /*for(int i=0;i<arr1.length;i++){
       
                        
        }
        Arrays.sort(arr1);
    for(int p=0;p<arr1.length;p++){
 }*/
}

    
}
