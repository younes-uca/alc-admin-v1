package ma.engflexy.alc.dao.facade.history;

import ma.engflexy.alc.zynerator.repository.AbstractHistoryRepository;
import ma.engflexy.alc.bean.history.StatutFreeTrialHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface StatutFreeTrialHistoryDao extends AbstractHistoryRepository<StatutFreeTrialHistory,Long> {

}
