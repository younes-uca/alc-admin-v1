package ma.engflexy.alc.dao.facade.history;

import ma.engflexy.alc.zynerator.repository.AbstractHistoryRepository;
import ma.engflexy.alc.bean.history.WorkloadBonusHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkloadBonusHistoryDao extends AbstractHistoryRepository<WorkloadBonusHistory,Long> {

}
