package graduate.api.user.repository;

import graduate.api.user.domain.AccountUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface UserRepository extends JpaRepository<AccountUser, UUID> {

}
