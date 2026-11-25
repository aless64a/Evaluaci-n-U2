public class Ejercicio2 {

    static int pot(int b, int e) { if (e == 0) return 1; return b * pot(b, e - 1); }

}
//Haz la traza de pot(3, 4) mostrando la pila de llamadas y el valor que devuelve cada una. 

 //pot(3,4) -> pot(3,3)
 //pot(3,3) -> pot(3,2)
 //pot()


