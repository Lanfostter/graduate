package graduate.api.user.services;

import graduate.api.user.domain.AccountUser;
import graduate.api.user.dto.UserDto;
import graduate.api.user.dto.search.SearchDto;
import graduate.api.user.dto.search.SearchUser;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public interface UserServices  {
    AccountUser create(UserDto dto);
    Boolean remove(UUID id);
    Page<AccountUser> paging(SearchUser searchUser);

}
