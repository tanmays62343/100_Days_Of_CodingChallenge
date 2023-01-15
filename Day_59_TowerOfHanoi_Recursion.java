import java.util.*;

class Day_58_TowerOfHanoi_Recursion{
    
    public static void main(String [] args){
          TowerOfHanoi(3,'A','B','C');
    }
  
  static void TowerOfHanoi(int n, char A,char B,char C){
    if(n==1){
      System.out.println("Move 1 From "+A+" To "+C);
    }
    TowerOfHanoi(n-1,A,C,B);
    System.out.println("Move "+n+" From "+A+" To "+C);
    TowerOfHanoi(n-1,B,A,C);
  }
  
