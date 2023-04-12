package ma.engflexy.alc.service.impl.admin;

import ma.engflexy.alc.bean.core.FreeTrialStudentEmailTemplate;
import ma.engflexy.alc.bean.history.FreeTrialStudentEmailTemplateHistory;
import ma.engflexy.alc.dao.criteria.core.FreeTrialStudentEmailTemplateCriteria;
import ma.engflexy.alc.dao.criteria.history.FreeTrialStudentEmailTemplateHistoryCriteria;
import ma.engflexy.alc.dao.facade.core.FreeTrialStudentEmailTemplateDao;
import ma.engflexy.alc.dao.facade.history.FreeTrialStudentEmailTemplateHistoryDao;
import ma.engflexy.alc.dao.specification.core.FreeTrialStudentEmailTemplateSpecification;
import ma.engflexy.alc.service.facade.admin.FreeTrialStudentEmailTemplateAdminService;
import ma.engflexy.alc.zynerator.service.AbstractServiceImpl;
import ma.engflexy.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class FreeTrialStudentEmailTemplateAdminServiceImpl extends AbstractServiceImpl<FreeTrialStudentEmailTemplate,FreeTrialStudentEmailTemplateHistory, FreeTrialStudentEmailTemplateCriteria, FreeTrialStudentEmailTemplateHistoryCriteria, FreeTrialStudentEmailTemplateDao,
FreeTrialStudentEmailTemplateHistoryDao> implements FreeTrialStudentEmailTemplateAdminService {




    public void configure() {
        super.configure(FreeTrialStudentEmailTemplate.class,FreeTrialStudentEmailTemplateHistory.class, FreeTrialStudentEmailTemplateHistoryCriteria.class, FreeTrialStudentEmailTemplateSpecification.class);
    }

    public FreeTrialStudentEmailTemplateAdminServiceImpl(FreeTrialStudentEmailTemplateDao dao, FreeTrialStudentEmailTemplateHistoryDao historyDao) {
        super(dao, historyDao);
    }

}