package ma.engflexy.alc.dao.facade.history;

import ma.engflexy.alc.zynerator.repository.AbstractHistoryRepository;
import ma.engflexy.alc.bean.history.ConfirmationTokenHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfirmationTokenHistoryDao extends AbstractHistoryRepository<ConfirmationTokenHistory,Long> {

}
