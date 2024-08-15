package UserService;

public interface UserService {
    void guardarUsuario(Usuario usuario);
    Usuario encontrarPorUsername(String username);
}
