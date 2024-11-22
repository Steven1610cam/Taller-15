public class UsuarioSRP {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("admin", "1234");
        
        ValidacionService validacionService = new ValidacionService();
        if (validacionService.validarContrasena(usuario.getContrasena())) {
            AutenticacionService autenticacionService = new AutenticacionService();
            boolean autenticado = autenticacionService.autenticar(usuario, usuario.getContrasena());
            
            if (autenticado) {
                System.out.println("Usuario autenticado exitosamente.");
            } else {
                System.out.println("Autenticación fallida.");
            }
        } else {
            System.out.println("La contraseña no cumple con los requisitos de seguridad.");
        }
    }
}