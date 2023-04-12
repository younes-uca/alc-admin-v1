package ma.engflexy.alc.dao.facade.history;

import ma.engflexy.alc.zynerator.repository.AbstractHistoryRepository;
import ma.engflexy.alc.bean.history.FonctionHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface FonctionHistoryDao extends AbstractHistoryRepository<FonctionHistory,Long> {

}
