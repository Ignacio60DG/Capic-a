import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Es tu número capicúa");

        Scanner sc = new Scanner (System.in);


        System.out.println("Escribe la cifra:");
        int cifra1 = sc.nextInt();
        System.out.println("Escribe la siguiente cifra:");
        int cifra2 = sc.nextInt();
        System.out.println("Escribe la siguiente cifra:");
        int cifra3 = sc.nextInt();
        System.out.println("Escribe la siguiente cifra:");
        int cifra4 = sc.nextInt();
        /*
        String numero = sc.nextLine();

        while(numero.length() > 4) {
            numero = sc.next();
        }
        */
        sc.close();



        if(cifra1 == 0 && cifra2 == 0 && cifra3 == 0 && cifra4 == 0) {
            System.out.println("Es cero");
        }else if(cifra1 == 0 && cifra2 == 0 && cifra3 == 0 && cifra4<=9 && cifra4>0) {
            System.out.println("Es de una cifra por lo que es capicúa");
        } if (cifra1 == 0 && cifra2 == 0 && cifra3<=9 && cifra3>0 && cifra3==cifra4) {
            System.out.println("Es capicúa");
        }else if (cifra1 == 0 && cifra2<=9 && cifra2>0 && cifra2==cifra4 && cifra3<=9 && cifra3>0) {
            System.out.println("Es capicúa");
        }else if (cifra1<=9 && cifra1>0 && cifra1==cifra4 && cifra2==cifra3 && cifra2<=9 && cifra2>0 && cifra3<=9 && cifra3>0 && cifra4<=9 && cifra4>0) {
            System.out.println("Es capicúa");
        }else{
            System.out.println("No es capicúa o no has puesto de cifra en cifra");
        }
    }

        /*
        if(numero.length() < 2){
            System.out.println("es capicuo");
        } else if (numero.length() < 3) {
            if (numero.charAt(0) == numero.charAt(1)){
                System.out.println("es capicuo");
            }else{
                System.out.println("no es capicuo");
            }
        } else if (numero.length() <4) {
                if (numero.charAt(0) == numero.charAt(2) || numero.charAt(1) == numero.charAt(3)){
                    System.out.println("es capicuo");
                }else{
                    System.out.println("no es capicuo");
                }
        }else{
                System.out.println("No es un numero entre 0 y 9999");
        }

    }

         */
}