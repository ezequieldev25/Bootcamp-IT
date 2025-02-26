import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CarreraDeLaSelva {
    
    static final String categoriaChica = "chica";
    static final String categoriaMedia = "media";
    static final String categoriaAvanzada = "avanzada";

    static final String attrNroParticipante = "N° Participante";
    static final String attrDni = "dni";
    static final String attrNombre = "nombre";
    static final String attrApellido = "apellido";
    static final String attrEdad = "edad";
    static final String attrCelular = "celular";
    static final String attrNroEmergencia = "numero de Emergencia";
    static final String attrGrupoSanguineo = "grupo sanguineo";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Map<String,String>> participantes = initListaVaciaDeParticipantes();
        participantes.add(crearParticipante(
            "1",
            "10222312121",
            "Julian",
            "Perez",
            "15",
            "+59112200033",
            "02320111122",
            "A+"
        ));

        participantes.add(crearParticipante(
            "2",
            "102223132",
            "Jhon",
            "Doe",
            "14",
            "+59112200033",
            "02320111122",
            "A+"
        ));

        participantes.add(crearParticipante(
            "2",
            "1233344",
            "Carlos",
            "Ascencio",
            "20",
            "+59112200033",
            "02320111122",
            "O-"
        ));

        Map<String, List<Map<String, String>>> inscripciones = initInscripcionesVacias(); 
        agregarParticipante(categoriaChica, inscripciones, participantes.get(0));
        agregarParticipante(categoriaMedia, inscripciones, participantes.get(1));
        agregarParticipante(categoriaAvanzada, inscripciones, participantes.get(2));

        mostrarDatosActuales(inscripciones);
        mostrarCostos(inscripciones);

        eliminarParticipante("102223132", inscripciones);

        mostrarDatosActuales(inscripciones);
        mostrarCostos(inscripciones);

        input.close();
    }

    public static Map<String, String> crearParticipante(String numeroDeParticipante, String dni, String nombre, String apellido, String edad, String celular, String celularEmergencia, String grupoSanguineo){
        Map<String, String> nuevo = new HashMap<>();
        nuevo.put(attrNroParticipante, numeroDeParticipante);
        nuevo.put(attrDni, dni);
        nuevo.put(attrNombre, nombre);
        nuevo.put(attrApellido, apellido);
        nuevo.put(attrEdad, edad);
        nuevo.put(attrCelular, celular);
        nuevo.put(attrNroEmergencia, celularEmergencia);
        nuevo.put(attrGrupoSanguineo, grupoSanguineo);
        return nuevo;
    }

    public static void eliminarParticipante(String dni, Map<String, List<Map<String,String>>> inscripciones){
        String inscripcionAlaQuePertenece = "";
        int indiceAux = -1;
        for(Map.Entry<String, List<Map<String, String>>> inscripcion: inscripciones.entrySet()){
            for(Map<String,String> partipante: inscripcion.getValue()){
                if (partipante.get(attrDni).equals(dni)) {
                    inscripcionAlaQuePertenece = inscripcion.getKey();
                    indiceAux = inscripcion.getValue().indexOf(partipante);
                    break;
                }
            }
        }

        List<Map<String, String>> lista = inscripciones.get(inscripcionAlaQuePertenece);
        lista.remove(indiceAux);
        inscripciones.put(inscripcionAlaQuePertenece, lista);
    }

    public static List<Map<String,String>> initListaVaciaDeParticipantes(){
        List<Map<String,String>> nuevaLista = new ArrayList<>();
        return nuevaLista;
    }

    public static Map<String, List<Map<String,String>>> initInscripcionesVacias(){
        Map<String, List<Map<String,String>>> inscripcionesVacias = new HashMap<>();
        inscripcionesVacias.put(categoriaChica, initListaVaciaDeParticipantes());
        inscripcionesVacias.put(categoriaMedia, initListaVaciaDeParticipantes());
        inscripcionesVacias.put(categoriaAvanzada, initListaVaciaDeParticipantes());
        return inscripcionesVacias;
    }

    public static void agregarParticipante(String categoria, Map<String, List<Map<String,String>>> inscripciones, Map<String, String> participante){
        List<Map<String,String>> lista = inscripciones.get(categoria);
        lista.add(participante);
        inscripciones.put(categoria, lista);        
    }

    public static void mostrarDatosActuales(Map<String, List<Map<String,String>>> inscripciones){
        for(Map.Entry<String, List<Map<String, String>>> inscripcion: inscripciones.entrySet()){
            System.out.println("\n-----------------------------\nCATEGORIA: " + inscripcion.getKey().toUpperCase());
            System.out.println("----- PARTICIPANTES ---------");
           
            for(Map<String, String> participante: inscripcion.getValue()){
                System.out.println("\n+++++++++++++++++++++++++++++");
                System.out.println("número de participante: " + participante.get(attrNroParticipante));
                System.out.println("dni: " + participante.get(attrDni));
                System.out.println("nombre: " + participante.get(attrNombre));
                System.out.println("apellido: " + participante.get(attrApellido));
                System.out.println("edad: " + participante.get(attrEdad));
                System.out.println("celular: " + participante.get(attrCelular));
                System.out.println("número de emergencia: " + participante.get(attrNroEmergencia));
                System.out.println("grupo sanguíneo:" + participante.get(attrGrupoSanguineo));
                System.out.println();
            }
        }
    }

    public static void mostrarCostos(Map<String, List<Map<String,String>>> inscripciones){
        double[] costos = new double[3];
        System.out.println("\n------------ COSTOS POR CATEGORIA ------------------\n");
        for(Map.Entry<String, List<Map<String, String>>> inscripcion: inscripciones.entrySet()){
            for(Map<String,String> participante: inscripcion.getValue()){
                Integer edad = Integer.valueOf(participante.get(attrEdad)); // casteo
                
                switch (inscripcion.getKey()) {
                    case categoriaChica:
                        if(edad < 18){
                            costos[0] += 1300; 
                        }else {
                            costos[0] += 1500;
                        }
                        break;
                    case categoriaMedia:
                        if (edad < 18) {
                            costos[1] += 2000;
                        } else {
                            costos[1] += 2300;
                        }
                        break;
                    case categoriaAvanzada:
                        costos[2] += 2800;
                        break;
                    default:
                        break;
                }
            }
        }


        for(int i = 0; i < costos.length; i++){
            String categoria = i == 0 ? categoriaChica : i == 1 ? categoriaMedia : categoriaAvanzada;
            System.out.println("El costo de la categoria " + categoria + " es: " + costos[i]);
        }

        System.out.println();
    }
}
