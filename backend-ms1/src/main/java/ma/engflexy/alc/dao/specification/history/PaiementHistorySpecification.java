package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.PaiementHistoryCriteria;
import ma.engflexy.alc.bean.history.PaiementHistory;


public class PaiementHistorySpecification extends AbstractHistorySpecification<PaiementHistoryCriteria, PaiementHistory> {

    public PaiementHistorySpecification(PaiementHistoryCriteria criteria) {
        super(criteria);
    }

    public PaiementHistorySpecification(PaiementHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
