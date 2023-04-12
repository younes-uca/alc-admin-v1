package ma.engflexy.alc.dao.facade.history;

import ma.engflexy.alc.zynerator.repository.AbstractHistoryRepository;
import ma.engflexy.alc.bean.history.EtudiantHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface EtudiantHistoryDao extends AbstractHistoryRepository<EtudiantHistory,Long> {

}
