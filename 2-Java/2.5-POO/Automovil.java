public class Automovil {
    String marca;
    String color;
    double kilometros;

    public static void main(String[] args) {
    }

    public Automovil(){}
    public Automovil(String marca, String color, double kilometros) {
            this.marca = marca;
            this.color = color;
            this.kilometros = kilometros;
    }

    public void mostrarMarcaYColor() {
            String marcaYColor = "La marca del auto es: " + this.marca + ". El color del auto es: " + this.color;
            System.out.println(marcaYColor);
    }
}