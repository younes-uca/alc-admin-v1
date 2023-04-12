package ma.engflexy.alc.dao.facade.history;

import ma.engflexy.alc.zynerator.repository.AbstractHistoryRepository;
import ma.engflexy.alc.bean.history.StatutSocialHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface StatutSocialHistoryDao extends AbstractHistoryRepository<StatutSocialHistory,Long> {

}
