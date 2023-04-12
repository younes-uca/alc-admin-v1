package ma.engflexy.alc.dao.facade.history;

import ma.engflexy.alc.zynerator.repository.AbstractHistoryRepository;
import ma.engflexy.alc.bean.history.QuizEtudiantHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizEtudiantHistoryDao extends AbstractHistoryRepository<QuizEtudiantHistory,Long> {

}
