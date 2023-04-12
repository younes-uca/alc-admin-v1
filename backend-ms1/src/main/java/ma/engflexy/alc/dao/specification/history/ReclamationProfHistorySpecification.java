package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.ReclamationProfHistoryCriteria;
import ma.engflexy.alc.bean.history.ReclamationProfHistory;


public class ReclamationProfHistorySpecification extends AbstractHistorySpecification<ReclamationProfHistoryCriteria, ReclamationProfHistory> {

    public ReclamationProfHistorySpecification(ReclamationProfHistoryCriteria criteria) {
        super(criteria);
    }

    public ReclamationProfHistorySpecification(ReclamationProfHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
