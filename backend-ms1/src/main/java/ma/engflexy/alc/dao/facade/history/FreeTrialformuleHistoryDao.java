package ma.engflexy.alc.dao.facade.history;

import ma.engflexy.alc.zynerator.repository.AbstractHistoryRepository;
import ma.engflexy.alc.bean.history.FreeTrialformuleHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface FreeTrialformuleHistoryDao extends AbstractHistoryRepository<FreeTrialformuleHistory,Long> {

}
