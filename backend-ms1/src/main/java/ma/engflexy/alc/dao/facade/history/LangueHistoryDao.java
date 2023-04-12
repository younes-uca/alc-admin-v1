package ma.engflexy.alc.dao.facade.history;

import ma.engflexy.alc.zynerator.repository.AbstractHistoryRepository;
import ma.engflexy.alc.bean.history.LangueHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface LangueHistoryDao extends AbstractHistoryRepository<LangueHistory,Long> {

}
