package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.ProfHistoryCriteria;
import ma.engflexy.alc.bean.history.ProfHistory;


public class ProfHistorySpecification extends AbstractHistorySpecification<ProfHistoryCriteria, ProfHistory> {

    public ProfHistorySpecification(ProfHistoryCriteria criteria) {
        super(criteria);
    }

    public ProfHistorySpecification(ProfHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
