package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.ScheduleProfHistoryCriteria;
import ma.engflexy.alc.bean.history.ScheduleProfHistory;


public class ScheduleProfHistorySpecification extends AbstractHistorySpecification<ScheduleProfHistoryCriteria, ScheduleProfHistory> {

    public ScheduleProfHistorySpecification(ScheduleProfHistoryCriteria criteria) {
        super(criteria);
    }

    public ScheduleProfHistorySpecification(ScheduleProfHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
