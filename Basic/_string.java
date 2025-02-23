public class _string {
  public static void main(String[] args) {
    String name = "yuki harsh";

    int length = name.length();
    char letter = name.charAt(0);
    int index = name.indexOf(" ");
    int lastIndex = name.lastIndexOf(" ");

    System.out.println(lastIndex);
    System.out.println(length);
    System.out.println(letter);
    System.out.println(index);
    System.out.println(name.toLowerCase());
    System.out.println(name.toUpperCase());
    System.out.println(name.trim()); //remove the white trailing whitespace
    System.out.println(name.replace("a", "o"));
    System.out.println(name.isEmpty());
    System.out.println(name.contains("h")); //checks if a character passed is present or not
    System.out.println(name.contains("harsh"));
    System.out.println(name.equals("harsh")); //checks if the passed string matches the string
    System.out.println(name.substring(0,4));
    System.out.println(name.substring(name.indexOf(" ")+1));
  }
}
