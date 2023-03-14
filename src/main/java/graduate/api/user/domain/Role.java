package graduate.api.user.domain;

import graduate.api.core.BaseObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_role")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Role extends BaseObject {
    @Column(name = "name")
    private String name;
}
