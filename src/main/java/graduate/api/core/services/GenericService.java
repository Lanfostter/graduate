package graduate.api.core.services;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
@Repository
public interface GenericService<T, Idt extends Serializable> {
    T delete(Idt id);

    T save(T t);

    Page<T> getList(int pageIndex, int pageSize);

    T findById(Idt id);
}
