package ma.engflexy.alc.dao.facade.history;

import ma.engflexy.alc.zynerator.repository.AbstractHistoryRepository;
import ma.engflexy.alc.bean.history.FreeTrialDetailHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface FreeTrialDetailHistoryDao extends AbstractHistoryRepository<FreeTrialDetailHistory,Long> {

}
