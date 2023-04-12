package ma.engflexy.alc.dao.facade.history;

import ma.engflexy.alc.zynerator.repository.AbstractHistoryRepository;
import ma.engflexy.alc.bean.history.EtatCoursHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface EtatCoursHistoryDao extends AbstractHistoryRepository<EtatCoursHistory,Long> {

}
