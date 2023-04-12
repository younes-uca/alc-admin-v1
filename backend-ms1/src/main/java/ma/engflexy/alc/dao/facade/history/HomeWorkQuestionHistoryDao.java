package ma.engflexy.alc.dao.facade.history;

import ma.engflexy.alc.zynerator.repository.AbstractHistoryRepository;
import ma.engflexy.alc.bean.history.HomeWorkQuestionHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeWorkQuestionHistoryDao extends AbstractHistoryRepository<HomeWorkQuestionHistory,Long> {

}
