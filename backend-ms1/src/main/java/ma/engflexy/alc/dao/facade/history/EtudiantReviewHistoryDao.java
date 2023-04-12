package ma.engflexy.alc.dao.facade.history;

import ma.engflexy.alc.zynerator.repository.AbstractHistoryRepository;
import ma.engflexy.alc.bean.history.EtudiantReviewHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface EtudiantReviewHistoryDao extends AbstractHistoryRepository<EtudiantReviewHistory,Long> {

}
