public class four {
    public static void main(String[] args) {

        //  Використання циклу for для обчислення факторіалу
        int n, f;
        f = 1;
        n = 10;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        System.out.println(n + "! = " + f);



    // Використання циклу while для обчислення факторіалу


        int k= 1;
        int m = 10;

        while (m > 0) {
        k *= m;
        m--;
        }

        System.out.println("Факторіал числа 10: " + k);

       }
}

