public class Ejericio1 {

    static int f(int x) { return x * x; }
static int g(int x) { return f(x) + f(x + 1); }
public static void main(String[] a) {
 int x = 2;
 System.out.println(g(x) + " " + f(g(1)));
 System.out.println(x);
}

}

//1.Escribir la salida exacta
//g(2) = f(2) + f(3) = 4 + 9 = 13
//g(1) = f(1) + f(2) = 1 + 4 = 5, entonces f(5) = 25
//13, 25, 2
//f(5) = 25



  
