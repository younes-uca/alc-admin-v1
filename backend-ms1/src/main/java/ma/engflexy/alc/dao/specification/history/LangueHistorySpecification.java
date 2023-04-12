package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.LangueHistoryCriteria;
import ma.engflexy.alc.bean.history.LangueHistory;


public class LangueHistorySpecification extends AbstractHistorySpecification<LangueHistoryCriteria, LangueHistory> {

    public LangueHistorySpecification(LangueHistoryCriteria criteria) {
        super(criteria);
    }

    public LangueHistorySpecification(LangueHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
