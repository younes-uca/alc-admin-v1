package ma.engflexy.alc.dao.facade.history;

import ma.engflexy.alc.zynerator.repository.AbstractHistoryRepository;
import ma.engflexy.alc.bean.history.GroupeEtudiantHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupeEtudiantHistoryDao extends AbstractHistoryRepository<GroupeEtudiantHistory,Long> {

}
