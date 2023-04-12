package ma.engflexy.alc.dao.facade.history;

import ma.engflexy.alc.zynerator.repository.AbstractHistoryRepository;
import ma.engflexy.alc.bean.history.PaiementHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface PaiementHistoryDao extends AbstractHistoryRepository<PaiementHistory,Long> {

}
