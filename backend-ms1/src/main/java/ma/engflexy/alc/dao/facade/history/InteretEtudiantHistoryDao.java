package ma.engflexy.alc.dao.facade.history;

import ma.engflexy.alc.zynerator.repository.AbstractHistoryRepository;
import ma.engflexy.alc.bean.history.InteretEtudiantHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface InteretEtudiantHistoryDao extends AbstractHistoryRepository<InteretEtudiantHistory,Long> {

}
