package ma.engflexy.alc.dao.facade.history;

import ma.engflexy.alc.zynerator.repository.AbstractHistoryRepository;
import ma.engflexy.alc.bean.history.NewsHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsHistoryDao extends AbstractHistoryRepository<NewsHistory,Long> {

}
