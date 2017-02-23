import java.awt.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        Quicksort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void Quicksort(int[] arr,int low,int high){
        if(low<high) {
            int q = Partition(arr, low, high);
            Quicksort(arr, low, q - 1);
            Quicksort(arr, q + 1, high);
        }
    }
    public static int Partition(int[] arr,int low,int high){
        int x=arr[low];
        int i=low;
        for(int j=low+1;j<=high;j++){
            if(arr[j]<=x){
                i=i+1;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i];
        arr[i]=arr[low];
        arr[low]=temp;
        return i;
    }
}


