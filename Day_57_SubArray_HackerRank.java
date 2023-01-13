import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
               Scanner j=new Scanner(System.in);
               int i=j.nextInt();
               ArrayList <Integer> ar=new ArrayList<>();
               for(int y=0;y<i;y++){
                 ar.add(j.nextInt());
                 
               }
               int c=0;
                for(int y=0;y<ar.size();y++){
               for(int n=0;n+y<ar.size();n++){
                
                   ArrayList <Integer> ar2= new ArrayList<>(ar.subList(y,n+y+1));
                   
                 int sum=0;
                 for(int s=0;s<ar2.size();s++){
                    
                   sum=sum+ar2.get(s);
                   
                 }
                 if(sum<0){c++;}
                 
               }
                 
               }
               System.out.println(c);
               
    }
}
