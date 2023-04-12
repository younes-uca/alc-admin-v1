package ma.engflexy.alc.dao.facade.history;

import ma.engflexy.alc.zynerator.repository.AbstractHistoryRepository;
import ma.engflexy.alc.bean.history.InscriptionHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface InscriptionHistoryDao extends AbstractHistoryRepository<InscriptionHistory,Long> {

}
