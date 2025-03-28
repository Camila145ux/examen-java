import java.util.Scanner;

public class Examen {

    public static void main(String[] args) {
        System.out.println("Resuelve la siguiente ecuación x + 2x (La suma de un número y su doble), solicitando el valor por consola.");
          Scanner entradavalor = new Scanner(System.in);
          System.out.print("Valor de x: ");
            double valor = entradavalor.nextDouble();

          double resultado = valor + 2 * valor;

          //resultado 
          System.out.println("El resultado de la ecuación x + 2x es: " + resultado);

          System.out.println("******************************************************************************");
          System.out.println("Resuelve la siguiente ecuación x2 - 3x (La diferencia entre el cuadrado de un numero y su triple), solicitando el valor de 5 por consola.");
            Scanner entradavalor2 = new Scanner(System.in);
            System.out.print("Valor de x: ");
            double valor2 = entradavalor2.nextDouble();

            double resultado2 = (valor2 * 2) - 3 * valor2;

            //resultado
            System.out.println("El resultado de la ecuación x2 - 3x es: " + resultado2);
            System.out.println("******************************************************************************");	

            System.out.println("Resuelve la siguiente ecucación (a + b + c) / 3 (El promedio de tres números), solicitando los valores por consola.");
            Scanner entradaA = new Scanner(System.in);
            System.out.print("Valor de a: ");
            double a = entradaA.nextDouble();

            Scanner entradaB = new Scanner(System.in);
            System.out.print("Valor de b: ");
            double b = entradaB.nextDouble();

            Scanner entradaC = new Scanner(System.in);
            System.out.print("Valor de c: ");
            double c = entradaC.nextDouble();

            double resultado3 = (a + b + c) / 3;

            //resultado
            System.out.println("El promedio de los tres números es: " + resultado3);

            System.out.println("******************************************************************************");

            System.out.println("Resuelve la siguiente ecuación (x*2) + 2 (x + 1) (La suma de un cuadrado de un número y el doble de su siguiente número), solicitando el valor de x por consola.");
            Scanner entradaX = new Scanner(System.in);
            System.out.print("Valor de x: ");
            double x = entradaX.nextDouble();

            double resultado4 = (x * x) + 2 * (x + 1);

            //resultado
            System.out.println("El resultado de la ecuación (x*2) + 2 (x + 1) es: " + resultado4);

            System.out.println("******************************************************************************");

           //BUCLE
            Scanner entradan = new Scanner(System.in);
            int menu;

            do {
                System.out.println("[1] Calcular la moda");
                System.out.println("[2] La mitad es");
                System.out.println("[3] Dí hola mundo");
                System.out.println("[4] Salir");
                System.out.print("Opcion: ");
                menu = entradan.nextInt();

                //opciones del programa
           

            switch (menu) {
                case 1:
                    System.out.println("Eligio la opción 1");
                    System.out.println("5, 8, 12, 5, 9, 7, 12, 14, 8, 5, 9, 12, 7, 5, 8, 14, 8, 12, 7, 9");
                    int moda[] = {5, 8, 12, 5, 9, 7, 12, 14, 8, 5, 9, 12, 7, 5, 8, 14, 8, 12, 7, 9 };
                    int modaFrecuencia = 0;
                    int modaNumero = 0;

                    for (int i = 0; i < moda.length; i++) {
                        int frecuencia = 0;
                        for (int j = 0; j < moda.length; j++) {
                            if (moda[i] == moda[j]) {
                                frecuencia++;
                            }
                        }
                        if (frecuencia > modaFrecuencia) {
                            modaFrecuencia = frecuencia;
                            modaNumero = moda[i];
                        }
                    }
                    System.out.println("La moda es: " + modaNumero);
                    break;

                case 2:
                    System.out.println("Eligio la opción 2");
                    Scanner entradaMitad = new Scanner(System.in);
                    System.out.print("Ingrese un número: ");
                    int numero = entradaMitad.nextInt();

                    double mitad = numero / 2;
                    System.out.println("La mitad de " + numero + " es: " + mitad);

                    
                case 3:
                    System.out.println("Eligio la opción 3");
                    System.out.println("Hola Mundo");
                    
                    break;
            
                default:
                    break;
            }
        } while (menu != 4);
        System.out.println("Salir");
        }
    }
