package chapter5;
import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[];
        arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter a element for index" + i + ":");
            arr[i] = sc.nextInt();
        }
        System.out.println("Average");
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            int average = sum/5;
            System.out.println("average"+average);

            }
        }
}
