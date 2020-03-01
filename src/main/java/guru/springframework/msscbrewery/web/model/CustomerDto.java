package guru.springframework.msscbrewery.web.model;

import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerDto {
    private UUID uuid;

    @NotNull
    @Size(min = 3, max = 100)
    private String name;
}
