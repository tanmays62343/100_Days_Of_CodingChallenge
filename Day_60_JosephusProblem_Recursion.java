class Day_60_JosephusProblem_Recursion{
  
  public static void main(String [] args){
    Josephus(5,3);
  }
   static int Josephus(int n,int k){           //Josephus Problem of Killing kth Person
        if(n==1)
            return 0;
        else
            return (Josephus(n-1,k)+k)%n;
    }
