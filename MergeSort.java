import java.util.Scanner;
import java.io.*;
public class MergeSort{
  public static void main(String[] args)throws IOException{
    Scanner in = new Scanner(System.in);
    //String fileName = in.next();Scanner fin = new Scanner(new file(fileName));
    Scanner fin = new Scanner(new File("input1.txt"));//
    int numLines = Integer.parseInt(fin.next());
    int[] arr = new int[numLines];
    for(int x = 0; fin.hasNext(); x++){
      arr[x] = Integer.parseInt(fin.next());
    }
    sort(arr, 0);
    for(int x = 0; x < numLines; x++){
      System.out.print(arr[x]);
      if(x != numLines - 1){
        System.out.print(", ");
      }
    }


  }
  public static void sort(int[] arr, int n){
    int i, less, greater, left, right;
    if(arr.length <= 1){
      return;
    }
    left = arr.length / 2;
    right = arr.length - left;

    for(i = 0; i < left; i++){
      less = arr[i];
    }
    for(i = left; i < right; i ++){
      greater = arr[i + left];
    }
  }
  void sort(int arr, int left);
  void sort(int arr, int right);
}