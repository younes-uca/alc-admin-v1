package ma.engflexy.alc.dao.facade.history;

import ma.engflexy.alc.zynerator.repository.AbstractHistoryRepository;
import ma.engflexy.alc.bean.history.AdminHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminHistoryDao extends AbstractHistoryRepository<AdminHistory,Long> {

}
