package ma.engflexy.alc.dao.facade.history;

import ma.engflexy.alc.zynerator.repository.AbstractHistoryRepository;
import ma.engflexy.alc.bean.history.FreeTrialConfigurationHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface FreeTrialConfigurationHistoryDao extends AbstractHistoryRepository<FreeTrialConfigurationHistory,Long> {

}
