public class checkar {
    
public static void main(String args[]){
    float []  arr = { 34, 43, 53, 64, 6, 75, 755};
  int num= 34;
    boolean s = false;
   for(float element: arr) {
if(num==element){
    s = true;
    break;

}
   }
   if(s){
    System.out.println("true");

   }
   else{
    System.out.println("Not in ");
   }
}

}