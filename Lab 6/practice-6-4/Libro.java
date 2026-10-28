public class Libro {
    String titulo;
    String autor;
    boolean prestado;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.prestado = false; // Por defecto, el libro está en la biblioteca
    }
}