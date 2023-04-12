package ma.engflexy.alc.dao.facade.history;

import ma.engflexy.alc.zynerator.repository.AbstractHistoryRepository;
import ma.engflexy.alc.bean.history.TrancheHoraireProfHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface TrancheHoraireProfHistoryDao extends AbstractHistoryRepository<TrancheHoraireProfHistory,Long> {

}
