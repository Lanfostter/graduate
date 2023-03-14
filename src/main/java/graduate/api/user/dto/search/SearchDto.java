package graduate.api.user.dto.search;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;
@Data
public class SearchDto {
    private String keyword;
    private Integer pageIndex;
    private Integer pageSize;
    private Boolean isVoided;
}
