package ma.engflexy.alc.dao.facade.history;

import ma.engflexy.alc.zynerator.repository.AbstractHistoryRepository;
import ma.engflexy.alc.bean.history.EtatEtudiantScheduleHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface EtatEtudiantScheduleHistoryDao extends AbstractHistoryRepository<EtatEtudiantScheduleHistory,Long> {

}
