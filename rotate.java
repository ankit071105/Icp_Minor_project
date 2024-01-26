import java.util.Arrays;
import java.util.Scanner;
public class rotate {
  public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
    System.out.println("Enter the elements of array");
    int arr[] =new int[4];
    String cc="";
    String cs="";
    for (int i = 0; i < arr.length; i++) {
        arr[i]=sc.nextInt();
    }
int k=3;
    System.out.println("Original Array");
    System.out.println(Arrays.toString(arr));
    System.out.println();
    rotateRightby2bits(arr,k,cc,cs);
    System.out.println();
    System.out.println("After Rotation Array");

    System.out.println(Arrays.toString(arr));
    System.out.println();
  }
  public static void rotateRightby2bits(int[] a, int k, String c, String ck) {
    System.out.println("Original Array");
    for (int i = 0; i < a.length; i++) {
        ck =Integer.toBinaryString(a[i]);
        System.out.print(ck+" ");
        }
        System.out.println();
    if(k==0 || k%a.length==0)
      return;
    k = k%a.length;
    for(int i = 0 ; i<k ; i++) {
      int temp = a[0];
      for(int j = 0 ; j < a.length - 1 ; j++) {
        a[j] = a[j+1];
      }
      a[a.length-1] = temp;
    }
    System.out.println();  
    System.out.println("After Rotation Array");
    for (int i = 0; i < a.length; i++) {
        c =Integer.toBinaryString(a[i]);
        System.out.print(c+" ");
        }
        System.out.println();
    for (int i = 0; i < a.length; i++) {
        a[i] = (a[i] >>> 2) | (a[i] << (32 - 2));
    }
  }
}

