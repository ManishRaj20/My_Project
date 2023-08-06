
import java.util.Scanner;
public class arr {
    /**
     * @param args
     */
    public static void main(String args[]){
        System.out.println("Enter array number: ");
        int arr[] = new int [5];
       Scanner sc= new Scanner(System.in);
        for(int i= 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Your array number is : ");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+ " ");
        }
        System.out.println("array in reverse order : ");
        for(int i=arr.length-1;  i<=0; i--){
            System.out.println(arr[i]+" ");
        }
    }
}
