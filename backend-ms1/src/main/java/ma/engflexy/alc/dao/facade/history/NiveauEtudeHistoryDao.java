package ma.engflexy.alc.dao.facade.history;

import ma.engflexy.alc.zynerator.repository.AbstractHistoryRepository;
import ma.engflexy.alc.bean.history.NiveauEtudeHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface NiveauEtudeHistoryDao extends AbstractHistoryRepository<NiveauEtudeHistory,Long> {

}
