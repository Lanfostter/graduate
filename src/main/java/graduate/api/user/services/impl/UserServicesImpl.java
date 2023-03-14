package graduate.api.user.services.impl;

import graduate.api.core.services.impl.GenericServiceImpl;
import graduate.api.user.domain.AccountUser;
import graduate.api.user.domain.Role;
import graduate.api.user.dto.UserDto;
import graduate.api.user.dto.search.SearchUser;
import graduate.api.user.repository.RoleRepository;
import graduate.api.user.repository.UserRepository;
import graduate.api.user.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import java.util.ArrayList;
import java.util.UUID;

public class UserServicesImpl extends GenericServiceImpl<AccountUser, UUID> implements UserServices {
    @Autowired
    UserRepository userRepository;
    @Autowired
    RoleRepository roleRepository;

    @Override
    public AccountUser create(UserDto dto) {
        if (dto != null) {
            AccountUser user = null;
            if (dto.getId() != null) {
                user = this.findById(dto.getId());
            } else {
                user = new AccountUser();
            }
            user.setUsername(dto.getUsername());
            user.setPassword(dto.getPassword());
            user.setAddress(dto.getAddress());
            user.setAge(dto.getAge());
            user.setFullName(dto.getFullName());
            user.setRoles(new ArrayList<>());
            if (dto.getRoles() != null && dto.getRoles().size() > 0) {
                for (UUID roleId : dto.getRoles()) {
                    Role role = roleRepository.findById(roleId).orElse(null);
                    if (role != null) {
                        user.getRoles().add(role);
                    }
                }
            }
            return user;
        }
        return null;
    }

    @Override
    public Boolean remove(UUID id) {
        return null;
    }

    @Override
    public Page<AccountUser> paging(SearchUser searchUser) {
        if (searchUser != null) {
            if ((!searchUser.getUserName().isEmpty() && searchUser.getUserName() != null) || searchUser.getAge() != null || (!searchUser.getKeyword().isEmpty() && searchUser.getKeyword() != null)) {
                return null;
            }else {
                return getAll(searchUser);
            }
        }
        return null;
    }
    public Page<AccountUser> getAll(SearchUser searchUser){
        if(searchUser.getPageIndex() <= 0){
            searchUser.setPageIndex(1);
        }
        return this.getList(searchUser.getPageIndex(), searchUser.getPageSize());
    }
}
