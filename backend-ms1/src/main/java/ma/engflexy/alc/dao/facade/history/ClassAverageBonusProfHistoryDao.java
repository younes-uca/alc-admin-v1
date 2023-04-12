package ma.engflexy.alc.dao.facade.history;

import ma.engflexy.alc.zynerator.repository.AbstractHistoryRepository;
import ma.engflexy.alc.bean.history.ClassAverageBonusProfHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassAverageBonusProfHistoryDao extends AbstractHistoryRepository<ClassAverageBonusProfHistory,Long> {

}
