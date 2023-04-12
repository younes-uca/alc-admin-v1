package ma.engflexy.alc.dao.facade.history;

import ma.engflexy.alc.zynerator.repository.AbstractHistoryRepository;
import ma.engflexy.alc.bean.history.EtatEtudiantHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface EtatEtudiantHistoryDao extends AbstractHistoryRepository<EtatEtudiantHistory,Long> {

}
