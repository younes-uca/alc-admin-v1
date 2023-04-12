package ma.engflexy.alc.dao.facade.history;

import ma.engflexy.alc.zynerator.repository.AbstractHistoryRepository;
import ma.engflexy.alc.bean.history.DictionaryHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface DictionaryHistoryDao extends AbstractHistoryRepository<DictionaryHistory,Long> {

}
