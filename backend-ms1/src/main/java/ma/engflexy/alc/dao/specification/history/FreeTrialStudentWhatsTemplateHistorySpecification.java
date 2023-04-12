package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.FreeTrialStudentWhatsTemplateHistoryCriteria;
import ma.engflexy.alc.bean.history.FreeTrialStudentWhatsTemplateHistory;


public class FreeTrialStudentWhatsTemplateHistorySpecification extends AbstractHistorySpecification<FreeTrialStudentWhatsTemplateHistoryCriteria, FreeTrialStudentWhatsTemplateHistory> {

    public FreeTrialStudentWhatsTemplateHistorySpecification(FreeTrialStudentWhatsTemplateHistoryCriteria criteria) {
        super(criteria);
    }

    public FreeTrialStudentWhatsTemplateHistorySpecification(FreeTrialStudentWhatsTemplateHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
