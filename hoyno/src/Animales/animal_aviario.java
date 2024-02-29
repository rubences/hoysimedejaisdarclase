public class animal_aviario extends animal {
    // Add your modifications here

    boolean vuela;
    boolean pico;
    boolean plumaje;
    String tipo_aviario;

    public animal_aviario(String nombre, String especie, String raza, String color, String sexo, String edad,
        String peso, String altura, String tipo, String habitat, String alimentacion, String reproduccion,
        String cuidados, String enfermedades, String vacunas, int id, boolean vuela, boolean pico,
        boolean plumaje, String tipo_aviario) {
        super(nombre, especie, raza, color, sexo, edad, peso, altura, tipo, habitat, alimentacion, reproduccion, cuidados,
            enfermedades, vacunas, id);
        this.vuela = vuela;
        this.pico = pico;
        this.plumaje = plumaje;
        this.tipo_aviario = tipo_aviario;
    }

}