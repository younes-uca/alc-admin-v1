package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.FaqProfHistoryCriteria;
import ma.engflexy.alc.bean.history.FaqProfHistory;


public class FaqProfHistorySpecification extends AbstractHistorySpecification<FaqProfHistoryCriteria, FaqProfHistory> {

    public FaqProfHistorySpecification(FaqProfHistoryCriteria criteria) {
        super(criteria);
    }

    public FaqProfHistorySpecification(FaqProfHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
