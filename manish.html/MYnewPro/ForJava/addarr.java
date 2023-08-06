import java.util.Scanner;
public class addarr {
    //for reverse
    public static void main(String args[]){
        System.out.println("Enter array number :");
        int []a = new int [5];
        Scanner sc = new Scanner(System.in);

        for(int i=0 ;i<a.length; i++){
            a[i] =sc.nextInt();
        }
        System.out.println("array element: ");
        for(int i=0; i<a.length; i++){
         System.out.println(a[i]+ " ");
        }
        System.out.println("array in reverse order: ");
        for(int i= a.length-1; i>=0 ; i--){
            System.out.println(a[i]+ " ");
        }
    }
}
