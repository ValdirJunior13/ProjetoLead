
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Lead {
    public String name;
    public String email;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    public String externalId;
    public String sourceSystem;
    public String status;
    public LocalDateTime createdAt;
    public LocalDateTime updatedAt;

}
