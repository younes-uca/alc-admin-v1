package ma.engflexy.alc.dao.facade.history;

import ma.engflexy.alc.zynerator.repository.AbstractHistoryRepository;
import ma.engflexy.alc.bean.history.ScheduleProfHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ScheduleProfHistoryDao extends AbstractHistoryRepository<ScheduleProfHistory,Long> {

}
