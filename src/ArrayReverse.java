import java.lang.reflect.Array;
import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] myArray = new int[10];
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("enter myarr " + i);
            myArray[i] = input.nextInt();
        }
        printArr(myArray);
        reserse(myArray);
        printArr(myArray);
    }

    public static int[] reserse(int[] arr) {
        for (int i = 0; i < arr.length/2; i++) {
            int tempt;
            tempt=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=tempt;
        }
        return arr;
    }
    public static void printArr(int[] arr){
        System.out.printf("%-20s","Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
}
