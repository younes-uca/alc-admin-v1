package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.ParcoursHistoryCriteria;
import ma.engflexy.alc.bean.history.ParcoursHistory;


public class ParcoursHistorySpecification extends AbstractHistorySpecification<ParcoursHistoryCriteria, ParcoursHistory> {

    public ParcoursHistorySpecification(ParcoursHistoryCriteria criteria) {
        super(criteria);
    }

    public ParcoursHistorySpecification(ParcoursHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
