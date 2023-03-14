package graduate.api.core.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

@MappedSuperclass
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class BaseObject {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(name = "create_date")
    private LocalDateTime createDate;
    private String createBy;
    @Column(name = "modify_date")
    private Date modifyDate;
    @Column(name = "modify_by")
    private String modifyBy;
    @Column(name = "voided")
    private Boolean voided;

    public void setId(UUID id) {
        this.id = id;
    }

    public void setCreateDate() {
        this.createDate = java.time.LocalDateTime.now();
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public void setModifyBy(String modifyBy) {
        this.modifyBy = modifyBy;
    }

    public void setVoided(Boolean voided) {
        this.voided = voided;
    }
}
