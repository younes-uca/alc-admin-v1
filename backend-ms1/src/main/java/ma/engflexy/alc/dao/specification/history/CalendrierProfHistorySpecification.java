package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.CalendrierProfHistoryCriteria;
import ma.engflexy.alc.bean.history.CalendrierProfHistory;


public class CalendrierProfHistorySpecification extends AbstractHistorySpecification<CalendrierProfHistoryCriteria, CalendrierProfHistory> {

    public CalendrierProfHistorySpecification(CalendrierProfHistoryCriteria criteria) {
        super(criteria);
    }

    public CalendrierProfHistorySpecification(CalendrierProfHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
