package ma.engflexy.alc.dao.facade.history;

import ma.engflexy.alc.zynerator.repository.AbstractHistoryRepository;
import ma.engflexy.alc.bean.history.ProfHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfHistoryDao extends AbstractHistoryRepository<ProfHistory,Long> {

}
