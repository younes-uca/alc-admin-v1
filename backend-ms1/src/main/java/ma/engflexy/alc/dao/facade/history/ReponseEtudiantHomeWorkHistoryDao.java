package ma.engflexy.alc.dao.facade.history;

import ma.engflexy.alc.zynerator.repository.AbstractHistoryRepository;
import ma.engflexy.alc.bean.history.ReponseEtudiantHomeWorkHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ReponseEtudiantHomeWorkHistoryDao extends AbstractHistoryRepository<ReponseEtudiantHomeWorkHistory,Long> {

}
