package Parte B;
import java.util.Scanner;

public class Ejercicio4{

    static int leerMinutos(Scanner sc) {
        System.out.print("Minutos (1-1440): ");
        int m = sc.nextInt();
        while (m < 1 || m > 1440) {
            System.out.print("Inválido, ingrese de nuevo: ");
            m = sc.nextInt();
        }
        return m;
    }

    static int horasCobradas(int minutos) {
        int horas = minutos / 60;
        if (minutos % 60 != 0) {
            horas = horas + 1;
        }
        return horas;
    }

    static double tarifa(int horas, char tipo) {
        double total;
        if (tipo == 'a') {
            total = horas * 1.00;
        } else {
            total = horas * 0.50;
        }
        if (horas > 8) {
            total = total * 0.80;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int minutos = leerMinutos(sc);
        System.out.print("Tipo (a = auto, m = moto): ");
        char tipo = sc.next().charAt(0);

        int horas = horasCobradas(minutos);
        double total = tarifa(horas, tipo);

        System.out.println("Horas: " + horas);
        System.out.println("Total: $" + total);
    }
}