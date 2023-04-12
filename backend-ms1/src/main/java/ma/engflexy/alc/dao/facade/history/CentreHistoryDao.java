package ma.engflexy.alc.dao.facade.history;

import ma.engflexy.alc.zynerator.repository.AbstractHistoryRepository;
import ma.engflexy.alc.bean.history.CentreHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface CentreHistoryDao extends AbstractHistoryRepository<CentreHistory,Long> {

}
