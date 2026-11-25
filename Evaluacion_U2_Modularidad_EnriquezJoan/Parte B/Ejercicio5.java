package Parte B;


    public class Ejercicio5 {

    static int sumaPares(int n) {
        if (n < 2) {
            return 0;
        }
        if (n % 2 == 1) {
            return sumaPares(n - 1);
        }
        return n + sumaPares(n - 2);
    }

    static boolean esCapicua(String s) {
        if (s.length() <= 1) {
            return true;
        }
        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }
        return esCapicua(s.substring(1, s.length() - 1));
    }

    public static void main(String[] args) {
        System.out.println(sumaPares(10));       // 30
        System.out.println(sumaPares(7));        // 12
        System.out.println(esCapicua("12321"));  // true
    }
}
    

