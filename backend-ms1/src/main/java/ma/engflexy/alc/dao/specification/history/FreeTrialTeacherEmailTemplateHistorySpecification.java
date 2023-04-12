package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.FreeTrialTeacherEmailTemplateHistoryCriteria;
import ma.engflexy.alc.bean.history.FreeTrialTeacherEmailTemplateHistory;


public class FreeTrialTeacherEmailTemplateHistorySpecification extends AbstractHistorySpecification<FreeTrialTeacherEmailTemplateHistoryCriteria, FreeTrialTeacherEmailTemplateHistory> {

    public FreeTrialTeacherEmailTemplateHistorySpecification(FreeTrialTeacherEmailTemplateHistoryCriteria criteria) {
        super(criteria);
    }

    public FreeTrialTeacherEmailTemplateHistorySpecification(FreeTrialTeacherEmailTemplateHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
