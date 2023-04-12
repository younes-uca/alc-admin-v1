package ma.engflexy.alc.dao.facade.history;

import ma.engflexy.alc.zynerator.repository.AbstractHistoryRepository;
import ma.engflexy.alc.bean.history.EtatInscriptionHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface EtatInscriptionHistoryDao extends AbstractHistoryRepository<EtatInscriptionHistory,Long> {

}
