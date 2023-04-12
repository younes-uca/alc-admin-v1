package ma.engflexy.alc.dao.facade.history;

import ma.engflexy.alc.zynerator.repository.AbstractHistoryRepository;
import ma.engflexy.alc.bean.history.CategorieProfHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieProfHistoryDao extends AbstractHistoryRepository<CategorieProfHistory,Long> {

}
