package chapter5;
import java.util.Scanner;
public class Arrayinput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]arr;
        arr=new int[5];
        for(int i= 0;i<arr.length;i++){
            System.out.println("Enter a element for index"+i+":");
            arr[i]=sc.nextInt();
        }
        System.out.println("Array element are:");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

}
