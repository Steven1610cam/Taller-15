public class ProductoSRP {
    public static void main(String[] args) {
        Producto producto = new Producto("Laptop", 1000.00);
        
        EtiquetaService etiquetaService = new EtiquetaService();
        etiquetaService.generarEtiqueta(producto);
        
        PrecioService precioService = new PrecioService();
        double precioFinal = precioService.calcularPrecioConImpuesto(producto);
        System.out.println("Precio final con impuestos: $" + precioFinal);
    }
}