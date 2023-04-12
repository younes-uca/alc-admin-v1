package ma.engflexy.alc.dao.facade.history;

import ma.engflexy.alc.zynerator.repository.AbstractHistoryRepository;
import ma.engflexy.alc.bean.history.SectionItemHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface SectionItemHistoryDao extends AbstractHistoryRepository<SectionItemHistory,Long> {

}
