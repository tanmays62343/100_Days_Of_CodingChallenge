import java.util.*;

class Day_61_PrintAllSubStringsOfGivenString{
  
  public static void main(String [] args){
    SubSetString("ABC","",0);
  }


static void SubSetString(String str,String curr,int index){         //Print all sub strings of String
        if(index == str.length()) {
            System.out.print(curr + " ");
            return;
        }
        SubSetString(str,curr,index+1);
        SubSetString(str,curr+str.charAt(index),index+1);
    }
}
