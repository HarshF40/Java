public class pattern {
	public static void main(String[] args) {
		pattern1();
		pattern2();
	}

	public static void pattern1() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print('*');
			}
			System.out.println("");
		}
		System.out.println("");
	}

    public static void pattern2() {
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3 * 2 - 1; j++) {
                if (j < 2 - i || j > 2 + i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
}

}
