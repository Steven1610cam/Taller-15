public class LibroSRP {
    public static void main(String[] args) {
        Libro libro = new Libro("El Principito", "Antoine de Saint-Exupéry", "978-3-16-148410-0");
        
        ReporteService reporteService = new ReporteService();
        reporteService.generarReporte(libro);
        
        PersistenciaService persistenciaService = new PersistenciaService();
        persistenciaService.guardarEnBaseDeDatos(libro);
    }
}