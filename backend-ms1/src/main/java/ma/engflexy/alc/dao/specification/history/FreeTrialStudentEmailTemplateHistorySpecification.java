package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.FreeTrialStudentEmailTemplateHistoryCriteria;
import ma.engflexy.alc.bean.history.FreeTrialStudentEmailTemplateHistory;


public class FreeTrialStudentEmailTemplateHistorySpecification extends AbstractHistorySpecification<FreeTrialStudentEmailTemplateHistoryCriteria, FreeTrialStudentEmailTemplateHistory> {

    public FreeTrialStudentEmailTemplateHistorySpecification(FreeTrialStudentEmailTemplateHistoryCriteria criteria) {
        super(criteria);
    }

    public FreeTrialStudentEmailTemplateHistorySpecification(FreeTrialStudentEmailTemplateHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
