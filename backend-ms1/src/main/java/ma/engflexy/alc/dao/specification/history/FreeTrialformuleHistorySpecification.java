package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.FreeTrialformuleHistoryCriteria;
import ma.engflexy.alc.bean.history.FreeTrialformuleHistory;


public class FreeTrialformuleHistorySpecification extends AbstractHistorySpecification<FreeTrialformuleHistoryCriteria, FreeTrialformuleHistory> {

    public FreeTrialformuleHistorySpecification(FreeTrialformuleHistoryCriteria criteria) {
        super(criteria);
    }

    public FreeTrialformuleHistorySpecification(FreeTrialformuleHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
