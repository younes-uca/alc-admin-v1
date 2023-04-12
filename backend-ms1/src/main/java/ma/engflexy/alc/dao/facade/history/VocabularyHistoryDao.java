package ma.engflexy.alc.dao.facade.history;

import ma.engflexy.alc.zynerator.repository.AbstractHistoryRepository;
import ma.engflexy.alc.bean.history.VocabularyHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface VocabularyHistoryDao extends AbstractHistoryRepository<VocabularyHistory,Long> {

}
