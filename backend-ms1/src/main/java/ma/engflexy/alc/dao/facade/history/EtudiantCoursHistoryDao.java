package ma.engflexy.alc.dao.facade.history;

import ma.engflexy.alc.zynerator.repository.AbstractHistoryRepository;
import ma.engflexy.alc.bean.history.EtudiantCoursHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface EtudiantCoursHistoryDao extends AbstractHistoryRepository<EtudiantCoursHistory,Long> {

}
