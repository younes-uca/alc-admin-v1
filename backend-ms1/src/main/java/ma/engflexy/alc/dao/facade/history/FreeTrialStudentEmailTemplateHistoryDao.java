package ma.engflexy.alc.dao.facade.history;

import ma.engflexy.alc.zynerator.repository.AbstractHistoryRepository;
import ma.engflexy.alc.bean.history.FreeTrialStudentEmailTemplateHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface FreeTrialStudentEmailTemplateHistoryDao extends AbstractHistoryRepository<FreeTrialStudentEmailTemplateHistory,Long> {

}
