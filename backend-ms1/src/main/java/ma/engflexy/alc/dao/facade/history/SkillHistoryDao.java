package ma.engflexy.alc.dao.facade.history;

import ma.engflexy.alc.zynerator.repository.AbstractHistoryRepository;
import ma.engflexy.alc.bean.history.SkillHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillHistoryDao extends AbstractHistoryRepository<SkillHistory,Long> {

}
