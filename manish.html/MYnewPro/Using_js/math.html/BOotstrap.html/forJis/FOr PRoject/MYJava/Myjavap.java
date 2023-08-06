import java.util.Scanner;
public class Myjavap{
    /**
     * @param args
     */
    public static void main(String[] args){
        System.out.println("Enter Five subjects Marks");
        try (Scanner s = new Scanner (System.in)) {
            int Eng, Hindi, Math, Science, SST;
              Eng=s.nextInt();
              Hindi=s.nextInt();
              Math=s.nextInt();
              Science=s.nextInt();
              SST=s.nextInt();
              float sum =Eng+Hindi+Math+Science+SST;
              System.out.println(sum);
              float avg=sum * 100/500;
              System.out.println(avg);
        }

    }
}