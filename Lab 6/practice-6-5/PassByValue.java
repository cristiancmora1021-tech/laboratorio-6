public class PassByValue {

    public static void main(String[] args) {
        int diasPrestamo = 7;
        Libro miLibro = new Libro("1984", "George Orwell");

        System.out.println("--- ANTES DEL MÉTODO ---");
        System.out.println("Días de préstamo: " + diasPrestamo);
        System.out.println("¿Libro prestado?: " + miLibro.prestado);

       
        modificarDatos(diasPrestamo, miLibro);

        System.out.println("\n--- DESPUÉS DEL MÉTODO ---");
        System.out.println("Días de préstamo: " + diasPrestamo);
        System.out.println("¿Libro prestado?: " + miLibro.prestado);
    }

    static void modificarDatos(int dias, Libro libroParam) {
       
        dias = 14; 
        
        
        libroParam.prestado = true; 
        
       
        libroParam = new Libro("El Principito", "Antoine de Saint-Exupéry");
    }
}