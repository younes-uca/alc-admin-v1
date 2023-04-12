package ma.engflexy.alc.dao.facade.history;

import ma.engflexy.alc.zynerator.repository.AbstractHistoryRepository;
import ma.engflexy.alc.bean.history.ReponseHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ReponseHistoryDao extends AbstractHistoryRepository<ReponseHistory,Long> {

}
