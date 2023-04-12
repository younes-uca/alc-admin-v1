package ma.engflexy.alc.dao.facade.history;

import ma.engflexy.alc.zynerator.repository.AbstractHistoryRepository;
import ma.engflexy.alc.bean.history.GroupeEtudeHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupeEtudeHistoryDao extends AbstractHistoryRepository<GroupeEtudeHistory,Long> {

}
