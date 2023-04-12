package ma.engflexy.alc.dao.facade.history;

import ma.engflexy.alc.zynerator.repository.AbstractHistoryRepository;
import ma.engflexy.alc.bean.history.EtatReponseHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface EtatReponseHistoryDao extends AbstractHistoryRepository<EtatReponseHistory,Long> {

}
