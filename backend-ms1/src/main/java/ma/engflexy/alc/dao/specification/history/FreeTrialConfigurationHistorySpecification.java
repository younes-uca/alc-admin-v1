package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.FreeTrialConfigurationHistoryCriteria;
import ma.engflexy.alc.bean.history.FreeTrialConfigurationHistory;


public class FreeTrialConfigurationHistorySpecification extends AbstractHistorySpecification<FreeTrialConfigurationHistoryCriteria, FreeTrialConfigurationHistory> {

    public FreeTrialConfigurationHistorySpecification(FreeTrialConfigurationHistoryCriteria criteria) {
        super(criteria);
    }

    public FreeTrialConfigurationHistorySpecification(FreeTrialConfigurationHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
