package ma.engflexy.alc.dao.facade.history;

import ma.engflexy.alc.zynerator.repository.AbstractHistoryRepository;
import ma.engflexy.alc.bean.history.ReclamationProfHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ReclamationProfHistoryDao extends AbstractHistoryRepository<ReclamationProfHistory,Long> {

}
