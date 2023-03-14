package graduate.api.user.domain;

import graduate.api.core.domain.BaseObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Table(name = "tbl_account")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class AccountUser extends BaseObject {
    @Column(name = "user_name")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "address")
    private String address;
    @Column(name = "full_name")
    private String fullName;
    @Column(name = "age")
    private Integer age;
    @OneToMany
    private List<Role> roles;

}
