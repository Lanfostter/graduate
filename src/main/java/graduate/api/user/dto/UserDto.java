package graduate.api.user.dto;

import graduate.api.core.dto.BaseObjectDto;
import graduate.api.user.domain.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto extends BaseObjectDto {
    private String username;
    private String password;
    private String address;
    private String fullName;
    private Integer age;
    private List<UUID> roles;


}
