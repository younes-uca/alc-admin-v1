package ma.engflexy.alc.dao.facade.history;

import ma.engflexy.alc.zynerator.repository.AbstractHistoryRepository;
import ma.engflexy.alc.bean.history.ProfReviewHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfReviewHistoryDao extends AbstractHistoryRepository<ProfReviewHistory,Long> {

}
