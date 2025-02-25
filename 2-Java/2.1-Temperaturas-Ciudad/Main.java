
public class Main{
    public static void main(String[] args){
        String[] ciudades = {
            "Londres",
            "Madrid",
            "Nueva York",
            "Buenos Aires",
            "Asuncion",
            "Sao Paulo",
            "Lima",
            "Santiago de Chile",
            "Lisboa",
            "Tokio"
        };
        int[][] temperaturas = {
            {-2,33},
            {-3, 32}, 
            {-8, 27}, 
            {4, 37}, 
            {6, 42}, 
            {5, 43}, 
            {0, 39}, 
            {-7, 26}, 
            {-1, 31}, 
            {-10, 35}
        };

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