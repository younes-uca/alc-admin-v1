package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.CategorieProfHistoryCriteria;
import ma.engflexy.alc.bean.history.CategorieProfHistory;


public class CategorieProfHistorySpecification extends AbstractHistorySpecification<CategorieProfHistoryCriteria, CategorieProfHistory> {

    public CategorieProfHistorySpecification(CategorieProfHistoryCriteria criteria) {
        super(criteria);
    }

    public CategorieProfHistorySpecification(CategorieProfHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
