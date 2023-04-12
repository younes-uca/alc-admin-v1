package ma.engflexy.alc.service.impl.admin;

import ma.engflexy.alc.bean.core.FreeTrialStudentWhatsTemplate;
import ma.engflexy.alc.bean.history.FreeTrialStudentWhatsTemplateHistory;
import ma.engflexy.alc.dao.criteria.core.FreeTrialStudentWhatsTemplateCriteria;
import ma.engflexy.alc.dao.criteria.history.FreeTrialStudentWhatsTemplateHistoryCriteria;
import ma.engflexy.alc.dao.facade.core.FreeTrialStudentWhatsTemplateDao;
import ma.engflexy.alc.dao.facade.history.FreeTrialStudentWhatsTemplateHistoryDao;
import ma.engflexy.alc.dao.specification.core.FreeTrialStudentWhatsTemplateSpecification;
import ma.engflexy.alc.service.facade.admin.FreeTrialStudentWhatsTemplateAdminService;
import ma.engflexy.alc.zynerator.service.AbstractServiceImpl;
import ma.engflexy.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class FreeTrialStudentWhatsTemplateAdminServiceImpl extends AbstractServiceImpl<FreeTrialStudentWhatsTemplate,FreeTrialStudentWhatsTemplateHistory, FreeTrialStudentWhatsTemplateCriteria, FreeTrialStudentWhatsTemplateHistoryCriteria, FreeTrialStudentWhatsTemplateDao,
FreeTrialStudentWhatsTemplateHistoryDao> implements FreeTrialStudentWhatsTemplateAdminService {




    public void configure() {
        super.configure(FreeTrialStudentWhatsTemplate.class,FreeTrialStudentWhatsTemplateHistory.class, FreeTrialStudentWhatsTemplateHistoryCriteria.class, FreeTrialStudentWhatsTemplateSpecification.class);
    }

    public FreeTrialStudentWhatsTemplateAdminServiceImpl(FreeTrialStudentWhatsTemplateDao dao, FreeTrialStudentWhatsTemplateHistoryDao historyDao) {
        super(dao, historyDao);
    }

}