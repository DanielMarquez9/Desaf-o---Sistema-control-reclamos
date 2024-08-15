package UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private RolRepository rolRepository;

    @Override
    public void guardarUsuario(Usuario usuario) {
        usuario.setPassword(new BCryptPasswordEncoder().encode(usuario.getPassword()));
        Rol rol = rolRepository.findByNombre("USER");
        usuario.getRoles().add(rol);
        usuarioRepository.save(usuario);
    }

    @Override
    public Usuario encontrarPorUsername(String username) {
        return usuarioRepository.findByUsername(username).orElse(null);
    }
}
