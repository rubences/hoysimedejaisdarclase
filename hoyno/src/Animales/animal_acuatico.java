package Animales;

public class animal_acuatico extends animal{

    boolean aletas;
    boolean branquias;
    boolean escamas;
    String tipo_agua;

    public animal_acuatico(String nombre, String especie, String raza, String color, String sexo, String edad,
        String peso, String altura, String tipo, String habitat, String alimentacion, String reproduccion,
        String cuidados, String enfermedades, String vacunas, int id, boolean aletas, boolean branquias,
        boolean escamas, String tipo_agua) {
        super(nombre, especie, raza, color, sexo, edad, peso, altura, tipo, habitat, alimentacion, reproduccion, cuidados,
            enfermedades, vacunas, id);
        this.aletas = aletas;
        this.branquias = branquias;
        this.escamas = escamas;
        this.tipo_agua = tipo_agua;
    }
    
}
