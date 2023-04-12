package ma.engflexy.alc.dao.facade.history;

import ma.engflexy.alc.zynerator.repository.AbstractHistoryRepository;
import ma.engflexy.alc.bean.history.FaqProfHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface FaqProfHistoryDao extends AbstractHistoryRepository<FaqProfHistory,Long> {

}
