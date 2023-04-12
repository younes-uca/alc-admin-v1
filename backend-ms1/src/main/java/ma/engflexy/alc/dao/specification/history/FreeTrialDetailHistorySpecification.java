package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.FreeTrialDetailHistoryCriteria;
import ma.engflexy.alc.bean.history.FreeTrialDetailHistory;


public class FreeTrialDetailHistorySpecification extends AbstractHistorySpecification<FreeTrialDetailHistoryCriteria, FreeTrialDetailHistory> {

    public FreeTrialDetailHistorySpecification(FreeTrialDetailHistoryCriteria criteria) {
        super(criteria);
    }

    public FreeTrialDetailHistorySpecification(FreeTrialDetailHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
