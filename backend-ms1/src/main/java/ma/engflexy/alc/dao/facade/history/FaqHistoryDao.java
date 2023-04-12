package ma.engflexy.alc.dao.facade.history;

import ma.engflexy.alc.zynerator.repository.AbstractHistoryRepository;
import ma.engflexy.alc.bean.history.FaqHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface FaqHistoryDao extends AbstractHistoryRepository<FaqHistory,Long> {

}
