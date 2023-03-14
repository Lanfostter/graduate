package graduate.api.user.dto.search;

import lombok.Data;

@Data
public class SearchUser extends SearchDto{
    private  String userName;
    private Integer Age;
}
