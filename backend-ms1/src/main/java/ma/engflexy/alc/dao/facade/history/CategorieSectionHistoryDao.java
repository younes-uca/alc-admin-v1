package ma.engflexy.alc.dao.facade.history;

import ma.engflexy.alc.zynerator.repository.AbstractHistoryRepository;
import ma.engflexy.alc.bean.history.CategorieSectionHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieSectionHistoryDao extends AbstractHistoryRepository<CategorieSectionHistory,Long> {

}
