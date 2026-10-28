public class HeapReferences {
    public static void main(String[] args) {
        
        Libro libro1 = new Libro("Cien Años de Soledad", "Gabriel García Márquez");
        
        
        Libro libro2 = libro1;
        
        
        libro2.prestado = true;
        
        
        System.out.println("Libro: " + libro1.titulo);
        System.out.println("¿Está prestado? " + libro1.prestado);
    }
}