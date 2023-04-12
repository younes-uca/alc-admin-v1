package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.StatutSocialHistoryCriteria;
import ma.engflexy.alc.bean.history.StatutSocialHistory;


public class StatutSocialHistorySpecification extends AbstractHistorySpecification<StatutSocialHistoryCriteria, StatutSocialHistory> {

    public StatutSocialHistorySpecification(StatutSocialHistoryCriteria criteria) {
        super(criteria);
    }

    public StatutSocialHistorySpecification(StatutSocialHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
