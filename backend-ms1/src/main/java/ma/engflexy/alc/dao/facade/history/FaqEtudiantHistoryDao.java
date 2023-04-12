package ma.engflexy.alc.dao.facade.history;

import ma.engflexy.alc.zynerator.repository.AbstractHistoryRepository;
import ma.engflexy.alc.bean.history.FaqEtudiantHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface FaqEtudiantHistoryDao extends AbstractHistoryRepository<FaqEtudiantHistory,Long> {

}
