package ma.engflexy.alc.dao.facade.history;

import ma.engflexy.alc.zynerator.repository.AbstractHistoryRepository;
import ma.engflexy.alc.bean.history.QuestionHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionHistoryDao extends AbstractHistoryRepository<QuestionHistory,Long> {

}
