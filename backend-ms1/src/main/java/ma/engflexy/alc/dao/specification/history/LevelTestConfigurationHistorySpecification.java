package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.LevelTestConfigurationHistoryCriteria;
import ma.engflexy.alc.bean.history.LevelTestConfigurationHistory;


public class LevelTestConfigurationHistorySpecification extends AbstractHistorySpecification<LevelTestConfigurationHistoryCriteria, LevelTestConfigurationHistory> {

    public LevelTestConfigurationHistorySpecification(LevelTestConfigurationHistoryCriteria criteria) {
        super(criteria);
    }

    public LevelTestConfigurationHistorySpecification(LevelTestConfigurationHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
