public class ars {
    public static void main(String args[]){
        int [] arr = {34, 53, 53, 534, 5342, 534, 5343, 5};
int sum = 0;
        for(int element: arr){
            sum += sum + element;
            System.out.println(sum);
        }
       // System.out.println(sum);
    }
}
