package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.TrancheHoraireProfHistoryCriteria;
import ma.engflexy.alc.bean.history.TrancheHoraireProfHistory;


public class TrancheHoraireProfHistorySpecification extends AbstractHistorySpecification<TrancheHoraireProfHistoryCriteria, TrancheHoraireProfHistory> {

    public TrancheHoraireProfHistorySpecification(TrancheHoraireProfHistoryCriteria criteria) {
        super(criteria);
    }

    public TrancheHoraireProfHistorySpecification(TrancheHoraireProfHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
