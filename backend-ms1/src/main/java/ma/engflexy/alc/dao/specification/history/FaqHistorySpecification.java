package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.FaqHistoryCriteria;
import ma.engflexy.alc.bean.history.FaqHistory;


public class FaqHistorySpecification extends AbstractHistorySpecification<FaqHistoryCriteria, FaqHistory> {

    public FaqHistorySpecification(FaqHistoryCriteria criteria) {
        super(criteria);
    }

    public FaqHistorySpecification(FaqHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
