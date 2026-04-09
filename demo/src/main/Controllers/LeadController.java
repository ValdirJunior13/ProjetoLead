import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/leads")
public class LeadController {
    
    private final LeadService leadService;

    public LeadController(LeadService leadService){
        this.leadService = leadService;
    }

    
    @PostMapping
    public Lead criarLead(@RequestBody Lead lead){
        return leadService.salvar(lead);
    }

    @GetMapping
    public List<Lead> listarLeads(){
        return leadService.listarTodos();
    }
    
}
