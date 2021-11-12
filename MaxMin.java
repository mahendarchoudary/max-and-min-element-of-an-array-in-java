//program to find max and min of an array

import java.io.*;
import java.util.*;

class MaxMin
{
  public static void main(String[] args)
    {
      int max,min;
     // int arry[]={1,20,30,40,10,103};
     int arry[]= new int[5]; 
     int len;
        System.out.println("Please enter the values::");
         Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++)
         {
             int a=sc.nextInt();
             arry[i]=a;     
          }
           len=arry.length;
           Arrays.sort(arry);
      System.out.println("minimun value is "+arry[0]);
      System.out.println("max value is "+arry[len-1]);
         
     }
}