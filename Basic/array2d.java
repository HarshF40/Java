public class array2d {
  public static void main(String[] args) {
    String[][] grocerries = {
      {"apple", "orange", "banana"},
      {"potato", "onion", "carrot"},
      {"chicken", "pork", "beef", "fish"},
    };
    for(String[] foods : grocerries){
      System.out.println("");
      for(String food : foods){
        System.out.print(food + " ");
      }
    }
    System.out.println();
  }
}
