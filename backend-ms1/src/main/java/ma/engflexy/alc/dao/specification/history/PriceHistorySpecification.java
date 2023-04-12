package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.PriceHistoryCriteria;
import ma.engflexy.alc.bean.history.PriceHistory;


public class PriceHistorySpecification extends AbstractHistorySpecification<PriceHistoryCriteria, PriceHistory> {

    public PriceHistorySpecification(PriceHistoryCriteria criteria) {
        super(criteria);
    }

    public PriceHistorySpecification(PriceHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
