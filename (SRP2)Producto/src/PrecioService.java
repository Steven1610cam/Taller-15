public class PrecioService {
    public double calcularPrecioConImpuesto(Producto producto) {
        double impuesto = 0.15; // 15% de impuesto
        return producto.getPrecio() * (1 + impuesto);
    }
}