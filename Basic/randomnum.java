import java.util.Random;

public class randomnum {
  public static void main(String[] args) {
   Random random = new Random();
   int number = random.nextInt(1, 7); //This will generate random number from 1 to 6
   double doub = random.nextDouble(); //random number betweem 0 and 1
   boolean bool = random.nextBoolean(); //random true or false
   System.out.println(number);
  }
}
