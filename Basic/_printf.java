public class _printf {
  public static void main(String[] args) {
    //printf() = is a method used to format ouput
    //%[flags][width][.precision][specifier-character]
    String name = "Spongebob";
    char firstLetter = 'S';
    int age = 30;
    double height = 60.5;
    boolean isEmployed = true;

    System.out.printf("Hello %s\n", name);
    System.out.printf("First letter is %c\n", firstLetter);
    System.out.printf("Age : %d\n", age);
    System.out.printf("Height: %.2f\n", height);
    System.out.printf("Employed: %b\n", isEmployed);

    //padding
    int id1 = 1;
    int id2 = 234;
    int id3 = 5678;

    System.out.printf("%04d\n", id1);
    System.out.printf("%04d\n", id2);
    System.out.printf("%04d\n", id3);

    System.out.printf("%4d\n", id1);
    System.out.printf("%4d\n", id2);
    System.out.printf("%4d\n", id3);

    System.out.printf("%-4d\n", id1);
    System.out.printf("%-4d\n", id2);
    System.out.printf("%-4d\n", id3);
  }
}
