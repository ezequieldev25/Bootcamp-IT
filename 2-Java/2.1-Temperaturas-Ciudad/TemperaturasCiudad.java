import java.util.Scanner;

public class TemperaturasCiudad {    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int cantidadDeCiudades;
        String[] ciudades = new String[10];
        int[][] temperaturas = new int[10][2];

        System.out.println("--------------------------------------------------------");
        System.out.println(" Programa que muestra la meno y mayor temperatura ");
        System.out.println("--------------------------------------------------------");
        System.out.println("Ingrese la cantidad de ciudades que desea ingresar: ");
        cantidadDeCiudades = input.nextInt();
        System.out.println("La cantidad de ciudades a ingresar: " + cantidadDeCiudades);
        System.out.println("--------------------------------------------------------");

        for(int i = 0; i < cantidadDeCiudades; i++){
            System.out.println("Ingrese a continuación la ciudad y las temperaturas: ");
            System.out.println("ciudad: ");
            ciudades[i] = input.nextLine();
            input.next();
            System.out.println("temperatura menor: ");
            temperaturas[i][0] = input.nextInt();
            input.nextLine();
            System.out.println("temperatura maxima: ");
            temperaturas[i][1] = input.nextInt();
            input.next();
        }
        
        mostrarTemperaturas(ciudades, temperaturas);
    }

    private static void mostrarTemperaturas(String[] ciudades, int[][] temperaturas){
        int[] menor = new int[2];
        int[] mayor = new int[2];
        
        for(int i=0; i < ciudades.length; i++){
            if(temperaturas[i][0] < menor[0]){
                menor[0] = temperaturas[i][0]; 
                menor[1] = i;
            }

            if(temperaturas[i][1] > mayor[0]){
                mayor[0] = temperaturas[i][1];
                mayor[1] = i;
            }
        }

        System.out.println("La ciudad con la menor temperatura fue: " + ciudades[menor[1]] + " " + menor[0]);
        System.out.println("La ciudad con la mayor temperatura fue: " + ciudades[mayor[1]] + " " + mayor[0] );
    }
}
