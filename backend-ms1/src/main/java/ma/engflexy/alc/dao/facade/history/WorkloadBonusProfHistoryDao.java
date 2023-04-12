package ma.engflexy.alc.dao.facade.history;

import ma.engflexy.alc.zynerator.repository.AbstractHistoryRepository;
import ma.engflexy.alc.bean.history.WorkloadBonusProfHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkloadBonusProfHistoryDao extends AbstractHistoryRepository<WorkloadBonusProfHistory,Long> {

}
