package chapter5;
import java.util.Scanner;
public class SearchValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[];
        arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter a element for index" + i + ":");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter value to search");
        int searchValue=sc.nextInt();
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            if(searchValue==arr[i]){
                flag=true;
                break;
            }
        }
        if (flag)
            System.out.println("found");
        else
            System.out.println("not found");
    }
}
