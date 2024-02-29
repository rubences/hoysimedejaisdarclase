package Gestion_habitats;

public class aviario extends habitats {

    public aviario(float temperatura,float humedad,boolean limpieza) {
        super(temperatura, humedad, limpieza);
    }
    public String toString() {
        return "aviario []";
    }
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    protected void finalize() throws Throwable {
        super.finalize();
    }
    public int hashCode() {
        return super.hashCode();
    }
}