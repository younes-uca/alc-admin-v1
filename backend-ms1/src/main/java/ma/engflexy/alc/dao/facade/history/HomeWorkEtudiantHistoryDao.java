package ma.engflexy.alc.dao.facade.history;

import ma.engflexy.alc.zynerator.repository.AbstractHistoryRepository;
import ma.engflexy.alc.bean.history.HomeWorkEtudiantHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeWorkEtudiantHistoryDao extends AbstractHistoryRepository<HomeWorkEtudiantHistory,Long> {

}
