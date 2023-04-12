package ma.engflexy.alc.dao.facade.history;

import ma.engflexy.alc.zynerator.repository.AbstractHistoryRepository;
import ma.engflexy.alc.bean.history.TypeTeacherHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeTeacherHistoryDao extends AbstractHistoryRepository<TypeTeacherHistory,Long> {

}
