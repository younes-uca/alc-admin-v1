package ma.engflexy.alc.dao.facade.history;

import ma.engflexy.alc.zynerator.repository.AbstractHistoryRepository;
import ma.engflexy.alc.bean.history.ResultatHomeWorkHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultatHomeWorkHistoryDao extends AbstractHistoryRepository<ResultatHomeWorkHistory,Long> {

}
