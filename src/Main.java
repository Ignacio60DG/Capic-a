import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca 1");

        int numero, original;
        int iUnidades, iDecenas, iCentenas, iUnidadesMillar;
        numero = sc.nextInt();
        original = numero;
        boolean bCapicua = false;
        sc.close();

        if (numero >= 1 && numero <=9999) {
            iUnidades = numero % 10;//Para sacar el desto de la dividión de diez como 129/10 =12 con resto 9
            numero = numero / 10; //Ahora tenemos 12

            iDecenas = numero % 10;
            numero = numero / 10;

            iCentenas = numero % 10;
            numero = numero / 10;

            iUnidadesMillar = numero % 10;

            if (original < 10) {
                bCapicua = true;

            } else if (original < 100) {
                if (iUnidades == iDecenas) {
                    bCapicua = true;//mejor un sout
                }
            } else if (original < 1000) {
                if (iUnidades == iCentenas) {
                    bCapicua = true;
                }
            } else if (original < 10000) {
                if ((iUnidades == iUnidadesMillar) && (iDecenas == iCentenas)) ;
            }

            if (bCapicua) {
                System.out.println("Capicua");
            } else {
                System.out.println("No es capicua");
            }
        }
    }
        /*
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
        /*
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