import java.time.LocalDateTime;

public record CreateLeadDto(
    String name, 
    String email, 
    String sourceSystem
) {}
public record UpdateLeadDto(
    String name, 
    String status
) {}

public record LeadResponseDto(
    int id, 
    String name, 
    String email, 
    String status, 
    String sourceSystem, 
    LocalDateTime createdAt
) {}