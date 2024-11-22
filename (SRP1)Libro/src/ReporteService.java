public class ReporteService {
    public void generarReporte(Libro libro) {
        System.out.println("Reporte del libro:");
        System.out.println("Título: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("ISBN: " + libro.getIsbn());
    }
}