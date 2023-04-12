package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.StatutFreeTrialHistoryCriteria;
import ma.engflexy.alc.bean.history.StatutFreeTrialHistory;


public class StatutFreeTrialHistorySpecification extends AbstractHistorySpecification<StatutFreeTrialHistoryCriteria, StatutFreeTrialHistory> {

    public StatutFreeTrialHistorySpecification(StatutFreeTrialHistoryCriteria criteria) {
        super(criteria);
    }

    public StatutFreeTrialHistorySpecification(StatutFreeTrialHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
