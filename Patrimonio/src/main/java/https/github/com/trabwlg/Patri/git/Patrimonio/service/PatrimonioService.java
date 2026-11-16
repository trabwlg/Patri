package https.github.com.trabwlg.Patri.git.Patrimonio.service;

import https.github.com.trabwlg.Patri.git.Patrimonio.model.Patrimonio;
import https.github.com.trabwlg.Patri.git.Patrimonio.repository.PatrimonioRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PatrimonioService {

    @Autowired

    private PatrimonioRepository repository;

    public List<Patrimonio>listarTodos(){
       return repository.findAll();
    }

    public Optional<Patrimonio>BuscarPorId(Long Id){
        return repository.findById(Id);
    }

    public Patrimonio Salvar(Patrimonio patrimonio){
    return repository.save(patrimonio);
    }

    public void Deletar(Long id){
        repository.deleteById(id);
    }









}
