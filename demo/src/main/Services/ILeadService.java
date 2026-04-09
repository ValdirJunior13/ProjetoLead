public interface ILeadService {

    Lead salvar(Lead lead);
    List<Lead> listarTodos();
}

@Service
public class LeadServiceImpl implements ILeadService{
    private final LeadRepository leadRepository;

    public LeadService(LeadRepository leadRepository){
        this.leadRepository = leadRepository;


    }

    public LeadResponseDto criarLead(CreateLeadDto dto){
        Lead novoLead = new Lead();
        novoLead.setName(dto.name());
        novoLead.setEmail(dto.email());
        novoLead.setSourceSystem(dto.sourceSystem());
        novoLead.setStatus("Novo");
        novoLead.setCreatedAt(LocalDateTime.now());

        Lead leadSalvo = leadRepository.save(novoLead);

        return converterParaResponseDto(leadSalvo);
    }

    public List<LeadResponseDto> listarTodos(){
        List<Lead> leadsDoBanco = leadRepository.findAll();

        return leadsDoBanco.stream().map(this::converterParaResponseDto).collect(Collectors.toList());

    }
    private LeadResponseDto converterParaResponseDto(Lead lead) {
        return new LeadResponseDto(
            lead.getId(),
            lead.getName(),
            lead.getEmail(),
            lead.getStatus(),
            lead.getSourceSystem(),
            lead.getCreatedAt()
        );

    }
}