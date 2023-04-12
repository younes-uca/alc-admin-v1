package ma.engflexy.alc.dao.facade.history;

import ma.engflexy.alc.zynerator.repository.AbstractHistoryRepository;
import ma.engflexy.alc.bean.history.TypeDeQuestionHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeDeQuestionHistoryDao extends AbstractHistoryRepository<TypeDeQuestionHistory,Long> {

}
