package ma.engflexy.alc.dao.facade.history;

import ma.engflexy.alc.zynerator.repository.AbstractHistoryRepository;
import ma.engflexy.alc.bean.history.ContactHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactHistoryDao extends AbstractHistoryRepository<ContactHistory,Long> {

}
