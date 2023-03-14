package graduate.api.core.dto;

import graduate.api.core.domain.BaseObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseObjectDto {
    private UUID id;
    private LocalDateTime createDate;
    private String createBy;
    private Date modifyDate;
    private String modifyBy;
    private Boolean voided;
    public BaseObjectDto(BaseObject entity){
        this.id = entity.getId();
        this.createDate = entity.getCreateDate();
        this.createBy = entity.getCreateBy();
        this.modifyBy = entity.getModifyBy();
        this.modifyDate = entity.getModifyDate();
    }
}
