package ma.engflexy.alc.service.impl.admin;

import ma.engflexy.alc.bean.core.FreeTrialTeacherEmailTemplate;
import ma.engflexy.alc.bean.history.FreeTrialTeacherEmailTemplateHistory;
import ma.engflexy.alc.dao.criteria.core.FreeTrialTeacherEmailTemplateCriteria;
import ma.engflexy.alc.dao.criteria.history.FreeTrialTeacherEmailTemplateHistoryCriteria;
import ma.engflexy.alc.dao.facade.core.FreeTrialTeacherEmailTemplateDao;
import ma.engflexy.alc.dao.facade.history.FreeTrialTeacherEmailTemplateHistoryDao;
import ma.engflexy.alc.dao.specification.core.FreeTrialTeacherEmailTemplateSpecification;
import ma.engflexy.alc.service.facade.admin.FreeTrialTeacherEmailTemplateAdminService;
import ma.engflexy.alc.zynerator.service.AbstractServiceImpl;
import ma.engflexy.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class FreeTrialTeacherEmailTemplateAdminServiceImpl extends AbstractServiceImpl<FreeTrialTeacherEmailTemplate,FreeTrialTeacherEmailTemplateHistory, FreeTrialTeacherEmailTemplateCriteria, FreeTrialTeacherEmailTemplateHistoryCriteria, FreeTrialTeacherEmailTemplateDao,
FreeTrialTeacherEmailTemplateHistoryDao> implements FreeTrialTeacherEmailTemplateAdminService {




    public void configure() {
        super.configure(FreeTrialTeacherEmailTemplate.class,FreeTrialTeacherEmailTemplateHistory.class, FreeTrialTeacherEmailTemplateHistoryCriteria.class, FreeTrialTeacherEmailTemplateSpecification.class);
    }

    public FreeTrialTeacherEmailTemplateAdminServiceImpl(FreeTrialTeacherEmailTemplateDao dao, FreeTrialTeacherEmailTemplateHistoryDao historyDao) {
        super(dao, historyDao);
    }

}