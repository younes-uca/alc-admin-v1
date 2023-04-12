package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.FreeTrialTeacherWhatsTemplateHistoryCriteria;
import ma.engflexy.alc.bean.history.FreeTrialTeacherWhatsTemplateHistory;


public class FreeTrialTeacherWhatsTemplateHistorySpecification extends AbstractHistorySpecification<FreeTrialTeacherWhatsTemplateHistoryCriteria, FreeTrialTeacherWhatsTemplateHistory> {

    public FreeTrialTeacherWhatsTemplateHistorySpecification(FreeTrialTeacherWhatsTemplateHistoryCriteria criteria) {
        super(criteria);
    }

    public FreeTrialTeacherWhatsTemplateHistorySpecification(FreeTrialTeacherWhatsTemplateHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
