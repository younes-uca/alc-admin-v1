package ma.engflexy.alc.dao.facade.history;

import ma.engflexy.alc.zynerator.repository.AbstractHistoryRepository;
import ma.engflexy.alc.bean.history.FaqTypeHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface FaqTypeHistoryDao extends AbstractHistoryRepository<FaqTypeHistory,Long> {

}
