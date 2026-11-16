package https.github.com.trabwlg.Patri.git.Patrimonio.controller;
import https.github.com.trabwlg.Patri.git.Patrimonio.model.Patrimonio;
import https.github.com.trabwlg.Patri.git.Patrimonio.service.PatrimonioService;
import java.util.Optional;

@Controller
@RequestMapping("/patrimonios")
public class PatrimonioController {
  @Autowired
private PatrimonioService service;

//listar  todos osw patrimonios
@GetMapping
public String listar(Model model){
  model.addAtribute("listarPatrimonios",service.listarTodos());
  return "lista";
}


//formulário para novo patrimonio
    @GetMapping("/novo")
    public String novoFormulario(Model model){
    model.addAttribute("patrimonio",new Patrimonio());
    return "formulario";
    }

    //formualário para editar patrimonio existente
    @GetMapping("/editar/{id}")
    public String editarFormulario(@PathVariable("id") Long id, Model model){
        Optional<Patrimonio> patrimonio = service.BuscarPorId(id);
            if (patrimonio.isPresent()){
                model.addAtribute("patrimonio",patrimonio.get());
                return "formulario";
            }
    return "redirect:/patrimonios";
    }

    //Salvar/atualizar patrimonio
    @PostMapping("/salvar")
    public String salvar(@ModelAttribute("patrimonio") Patrimonio patrimonio){
    service.Salvar(patrimonio);
    return "redirect:/patrimonios";
    }

    //Excluir patrimonio
    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable("id") Long id){
    service.Deletar(id);
        return "redirect:/patrimonios";
    }


}
