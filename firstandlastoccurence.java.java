/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
import java.io.*;
public class Main{
    ArrayList<Long> find(int arr[], int n, int x)
    {
        int size=arr.length;
        int low=0;
        int high=size-1;
           
            int ans[]={-1,-1};
            while(low<high){
            int mid=(low+high)/2;
            //to find the first occurence 
            if(x==arr[mid]){
            ans[0]=mid;
            high=mid-1;
            }
           
            else if(x>arr[mid]){
            low=mid+1;
            }
            else{
            high=mid-1;
            }
            }
            //to find the last occurence
            while(low<high){
                if(x==arr[mid]){
                    ans[1]=mid;
                    low=mid+1;
                }
                    else if(x<arr[mid]){
                    high=mid-1;
                    }
                    else{
                    low=mid+1;
                    }
                }
            
            return null;
    }
            public static void main(String args[]){
                Scanner scn=new Scanner(System.in);
                int n=scn.nextInt();
                int[]arr=new int[n];
                for(int i=0;i<n;i++){
                    arr[i]=scn.nextInt();
                }
                int x=scn.nextInt();
                int[]res=find(arr,n,x);
                System.out.println(ans[0]+""+ans[1]);
                }
}


