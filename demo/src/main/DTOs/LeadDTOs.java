public record LeadDTO(String nome, String email, 
    String status, 
    String sourceSystem, 
    String externalId, 
    LocalDateTime createdAt,
    LocalDateTime updatedAt){

}

public record UpdateLeadDto(String status, String name) {
    
}

public record CreateLeadDto (String name, String email, String SourceSystem) {
    
}

