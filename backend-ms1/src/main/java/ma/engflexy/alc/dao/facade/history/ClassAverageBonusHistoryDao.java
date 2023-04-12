package ma.engflexy.alc.dao.facade.history;

import ma.engflexy.alc.zynerator.repository.AbstractHistoryRepository;
import ma.engflexy.alc.bean.history.ClassAverageBonusHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassAverageBonusHistoryDao extends AbstractHistoryRepository<ClassAverageBonusHistory,Long> {

}
