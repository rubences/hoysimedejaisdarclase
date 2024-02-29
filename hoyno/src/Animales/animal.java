package Animales;

public class animal {

    
    String nombre;
    String especie;
    String raza;
    String color;
    String sexo;
    String edad;
    String peso;
    String altura;
    String tipo;
    String habitat;
    String alimentacion;
    String reproduccion;
    String cuidados;
    String enfermedades;
    String vacunas;
    int id;


    public animal(String nombre, String especie, String raza, String color, String sexo, String edad, String peso, String altura, String tipo, String habitat, String alimentacion, String reproduccion, String cuidados, String enfermedades, String vacunas, int id) {
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.color = color;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.tipo = tipo;
        this.habitat = habitat;
        this.alimentacion = alimentacion;
        this.reproduccion = reproduccion;
        this.cuidados = cuidados;
        this.enfermedades = enfermedades;
        this.vacunas = vacunas;
        this.id = id;
    }


    @Override
    public String toString() {
        return "animal []";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        super.finalize();
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getEspecie() {
        return especie;
    }


    public void setEspecie(String especie) {
        this.especie = especie;
    }


    public String getRaza() {
        return raza;
    }


    public void setRaza(String raza) {
        this.raza = raza;
    }


    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }


    public String getSexo() {
        return sexo;
    }


    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    public String getEdad() {
        return edad;
    }


    public void setEdad(String edad) {
        this.edad = edad;
    }


    public String getPeso() {
        return peso;
    }


    public void setPeso(String peso) {
        this.peso = peso;
    }


    public String getAltura() {
        return altura;
    }


    public void setAltura(String altura) {
        this.altura = altura;
    }


    public String getTipo() {
        return tipo;
    }


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public String getHabitat() {
        return habitat;
    }


    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }


    public String getAlimentacion() {
        return alimentacion;
    }


    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }


    public String getReproduccion() {
        return reproduccion;
    }


    public void setReproduccion(String reproduccion) {
        this.reproduccion = reproduccion;
    }


    public String getCuidados() {
        return cuidados;
    }


    public void setCuidados(String cuidados) {
        this.cuidados = cuidados;
    }


    public String getEnfermedades() {
        return enfermedades;
    }


    public void setEnfermedades(String enfermedades) {
        this.enfermedades = enfermedades;
    }


    public String getVacunas() {
        return vacunas;
    }


    public void setVacunas(String vacunas) {
        this.vacunas = vacunas;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    

 
}
