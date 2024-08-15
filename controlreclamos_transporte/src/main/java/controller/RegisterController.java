package controller;

public class RegisterController {

	@Autowired
    private UserService userService;

    @GetMapping("/registro")
    public String registro(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "registro";
    }

    @PostMapping("/registro")
    public String registroSubmit(@ModelAttribute Usuario usuario) {
        userService.guardarUsuario(usuario);
        return "redirect:/login";
    }
}
