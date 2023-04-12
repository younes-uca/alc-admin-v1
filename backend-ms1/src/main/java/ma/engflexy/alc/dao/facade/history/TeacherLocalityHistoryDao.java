package ma.engflexy.alc.dao.facade.history;

import ma.engflexy.alc.zynerator.repository.AbstractHistoryRepository;
import ma.engflexy.alc.bean.history.TeacherLocalityHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherLocalityHistoryDao extends AbstractHistoryRepository<TeacherLocalityHistory,Long> {

}
