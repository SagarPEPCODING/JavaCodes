package calculations;

class Mypatt {

    // method without parameter
    public void display() {
        // for (int i = 0; i < 10; i++) {
        // System.out.print("*");
        // }
        System.out.println("********************** pattern 1 from display 1 **********************");
        System.out.println();
        int n = 10;
        int row = 1;
        int star = n;
        int space = 0;

        while (row <= n) {

            int i = 1;
            while (i <= space) {
                System.out.print("	");
                i++;
            }

            int j = 1;
            while (j <= star) {

                if (j > 1 && j < star && row > 1 && row <= n / 2) {
                    System.out.print("	");
                }
                // } else if(i==j&&i+j==n+1){
                // System.out.print("* ");
                else {
                    System.out.print("1	");
                }
                j++;
            }

            System.out.println();

            if (row <= n / 2) {
                star = star - 2;
                space++;
            } else {
                space--;
                star = star + 2;
            }

            row++;
        }

    }

    // method with single parameter
    public void display(char symbol) {
        System.out.println("********************** pattern 2 from display 2 **********************");
        System.out.println();
        int n = 10;
        int row = 1;
        int star = n;
        int space = 0;

        while (row <= n) {

            int i = 1;
            while (i <= space) {
                System.out.print("	");
                i++;
            }

            int j = 1;
            while (j <= star) {

                if (j > 1 && j < star && row > 1 && row <= n / 2) {
                    System.out.print("	");
                }
                // } else if(i==j&&i+j==n+1){
                // System.out.print("* ");
                else {
                    System.out.print("2	");
                }
                j++;
            }

            System.out.println();

            if (row <= n / 2) {
                star = star - 2;
                space++;
            } else {
                space--;
                star = star + 2;
            }

            row++;
        }
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Mypatt d1 = new Mypatt();

        // call method without any argument
        d1.display();
        System.out.println("\n");

        // call method with a single argument
        d1.display('#');
    }
}
