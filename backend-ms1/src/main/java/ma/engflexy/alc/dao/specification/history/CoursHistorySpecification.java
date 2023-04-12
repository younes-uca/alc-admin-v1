package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.CoursHistoryCriteria;
import ma.engflexy.alc.bean.history.CoursHistory;


public class CoursHistorySpecification extends AbstractHistorySpecification<CoursHistoryCriteria, CoursHistory> {

    public CoursHistorySpecification(CoursHistoryCriteria criteria) {
        super(criteria);
    }

    public CoursHistorySpecification(CoursHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
