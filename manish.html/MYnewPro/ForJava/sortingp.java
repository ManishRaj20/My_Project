import java.util.Scanner;
public class sortingp {

    public static void main(String args[]){

        System.out.println("Enter number: ");
        int a[]=new int [5];
    Scanner sc= new Scanner(System.in);

    for(int i=0; i<a.length; i++){
        a[i]=sc.nextInt();
    }
    for(int i=0; i<a.length; i++){

        for(int j=0 ;j<i+1; j++){
            if(a[i]<a[j]){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
            }
            
            }


        }
        System.out.println("Sorted array:");
        for(int i=0;i<a.length;i++){
            
          
            
            System.out.println(a[i]+" ");

    }
      }
    
    }