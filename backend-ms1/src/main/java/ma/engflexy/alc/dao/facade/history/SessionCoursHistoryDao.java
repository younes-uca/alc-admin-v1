package ma.engflexy.alc.dao.facade.history;

import ma.engflexy.alc.zynerator.repository.AbstractHistoryRepository;
import ma.engflexy.alc.bean.history.SessionCoursHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionCoursHistoryDao extends AbstractHistoryRepository<SessionCoursHistory,Long> {

}
