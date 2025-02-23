import java.util.Scanner;

public class enhanced_switches {
  public static void main(String[] args) {
    //Enhanced switch = A replacement to many else if statements
    //(Java14 feature)
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a day: ");
    String day = scanner.next().toLowerCase();
    switch(day){
      case "monday", "tuesday", "wednesday", "thursday", "friday" -> System.out.println("It is a weekday");
      case "saturday", "sunday" -> System.out.println("Its a weekend");
      default -> System.out.println(day + " is not a day");
    }
    scanner.close();
  }
}
