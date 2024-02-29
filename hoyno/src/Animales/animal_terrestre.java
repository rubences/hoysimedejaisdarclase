package Animales;

public class animal_terrestre {

    boolean patas;
    boolean cola;
    boolean pelaje;
    String tipo_terrestre;

    public animal_terrestre(String nombre, String especie, String raza, String color, String sexo, String edad,
        String peso, String altura, String tipo, String habitat, String alimentacion, String reproduccion,
        String cuidados, String enfermedades, String vacunas, int id, boolean patas, boolean cola,
        boolean pelaje, String tipo_terrestre) {
        super(nombre, especie, raza, color, sexo, edad, peso, altura, tipo, habitat, alimentacion, reproduccion, cuidados,
            enfermedades, vacunas, id);
        this.patas = patas;
        this.cola = cola;
        this.pelaje = pelaje;
        this.tipo_terrestre = tipo_terrestre;
    }
    
}
