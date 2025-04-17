package recursos;

// Clase abstracta base para todos los recursos digitales
public abstract class RecursoDigital {

    // Atributos comunes a todos los recursos digitales
    protected String titulo;
    protected String autor;
    protected int anioPublicacion;
    protected boolean disponible;        // Si el recurso está disponible o prestado

    // Constructor que inicializa los atributos del recurso
    public RecursoDigital(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.disponible = true; // Por defecto, el recurso está disponible
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public boolean isDisponible() {
        return disponible;
    }


    // Setter
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

}