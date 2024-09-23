package entity;

public class Estudiante {
    private String document;
    private String nombre;

    public Estudiante(String document, String nombre) {
        this.document = document;
        this.nombre = nombre;
    }

    public Estudiante() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "document='" + document + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }


}
