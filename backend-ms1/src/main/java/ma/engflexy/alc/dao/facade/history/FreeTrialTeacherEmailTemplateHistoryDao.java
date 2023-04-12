package ma.engflexy.alc.dao.facade.history;

import ma.engflexy.alc.zynerator.repository.AbstractHistoryRepository;
import ma.engflexy.alc.bean.history.FreeTrialTeacherEmailTemplateHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface FreeTrialTeacherEmailTemplateHistoryDao extends AbstractHistoryRepository<FreeTrialTeacherEmailTemplateHistory,Long> {

}
