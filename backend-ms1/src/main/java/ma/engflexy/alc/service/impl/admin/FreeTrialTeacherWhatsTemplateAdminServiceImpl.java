package ma.engflexy.alc.service.impl.admin;

import ma.engflexy.alc.bean.core.FreeTrialTeacherWhatsTemplate;
import ma.engflexy.alc.bean.history.FreeTrialTeacherWhatsTemplateHistory;
import ma.engflexy.alc.dao.criteria.core.FreeTrialTeacherWhatsTemplateCriteria;
import ma.engflexy.alc.dao.criteria.history.FreeTrialTeacherWhatsTemplateHistoryCriteria;
import ma.engflexy.alc.dao.facade.core.FreeTrialTeacherWhatsTemplateDao;
import ma.engflexy.alc.dao.facade.history.FreeTrialTeacherWhatsTemplateHistoryDao;
import ma.engflexy.alc.dao.specification.core.FreeTrialTeacherWhatsTemplateSpecification;
import ma.engflexy.alc.service.facade.admin.FreeTrialTeacherWhatsTemplateAdminService;
import ma.engflexy.alc.zynerator.service.AbstractServiceImpl;
import ma.engflexy.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class FreeTrialTeacherWhatsTemplateAdminServiceImpl extends AbstractServiceImpl<FreeTrialTeacherWhatsTemplate,FreeTrialTeacherWhatsTemplateHistory, FreeTrialTeacherWhatsTemplateCriteria, FreeTrialTeacherWhatsTemplateHistoryCriteria, FreeTrialTeacherWhatsTemplateDao,
FreeTrialTeacherWhatsTemplateHistoryDao> implements FreeTrialTeacherWhatsTemplateAdminService {




    public void configure() {
        super.configure(FreeTrialTeacherWhatsTemplate.class,FreeTrialTeacherWhatsTemplateHistory.class, FreeTrialTeacherWhatsTemplateHistoryCriteria.class, FreeTrialTeacherWhatsTemplateSpecification.class);
    }

    public FreeTrialTeacherWhatsTemplateAdminServiceImpl(FreeTrialTeacherWhatsTemplateDao dao, FreeTrialTeacherWhatsTemplateHistoryDao historyDao) {
        super(dao, historyDao);
    }

}