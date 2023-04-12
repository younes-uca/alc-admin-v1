package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.EtatCoursHistoryCriteria;
import ma.engflexy.alc.bean.history.EtatCoursHistory;


public class EtatCoursHistorySpecification extends AbstractHistorySpecification<EtatCoursHistoryCriteria, EtatCoursHistory> {

    public EtatCoursHistorySpecification(EtatCoursHistoryCriteria criteria) {
        super(criteria);
    }

    public EtatCoursHistorySpecification(EtatCoursHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
