package ma.engflexy.alc.dao.facade.history;

import ma.engflexy.alc.zynerator.repository.AbstractHistoryRepository;
import ma.engflexy.alc.bean.history.CoursHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursHistoryDao extends AbstractHistoryRepository<CoursHistory,Long> {

}
