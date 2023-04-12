package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.FaqTypeHistoryCriteria;
import ma.engflexy.alc.bean.history.FaqTypeHistory;


public class FaqTypeHistorySpecification extends AbstractHistorySpecification<FaqTypeHistoryCriteria, FaqTypeHistory> {

    public FaqTypeHistorySpecification(FaqTypeHistoryCriteria criteria) {
        super(criteria);
    }

    public FaqTypeHistorySpecification(FaqTypeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
