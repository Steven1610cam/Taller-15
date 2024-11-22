public class ValidacionService {
    public boolean validarContrasena(String contrasena) {
        
        return contrasena.length() >= 6;
    }
}