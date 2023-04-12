package ma.engflexy.alc.dao.facade.history;

import ma.engflexy.alc.zynerator.repository.AbstractHistoryRepository;
import ma.engflexy.alc.bean.history.QuizHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizHistoryDao extends AbstractHistoryRepository<QuizHistory,Long> {

}
