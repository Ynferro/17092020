public class Main6 {
    public static void main(String[] args) {
        /*if else

         */
        int a = 3;
        int b = 8;
        int c = b;

        if (a < b) {
            System.out.println("a is less than b");
        } else {
            System.out.println("b is less than a");
        }

        if ((a < b) || (a > c)) { // логическое или
            System.out.println("b is less than a");
        } else {
            System.out.println("b is less than a");
        }

        if ((a < b) && (a > c)) { // логическое и
            System.out.println("b is less than a");
        } else {
            System.out.println("b is less than a");
        }

        if (!(a > c)) { // логическое true or false
            System.out.println("b is less than a");
        } else {
            System.out.println("b is less than a");
        }
// дописать!//

        /* break - выход из цикла при срабатывании условия
        continue -
         */
        int x = 20;
        while (x > 2) {
            System.out.println("variable x = " + x);
            x--;
            if (x == 13) {break};
        }
    }
}