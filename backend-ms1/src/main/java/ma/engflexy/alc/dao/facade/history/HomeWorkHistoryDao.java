package ma.engflexy.alc.dao.facade.history;

import ma.engflexy.alc.zynerator.repository.AbstractHistoryRepository;
import ma.engflexy.alc.bean.history.HomeWorkHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeWorkHistoryDao extends AbstractHistoryRepository<HomeWorkHistory,Long> {

}
