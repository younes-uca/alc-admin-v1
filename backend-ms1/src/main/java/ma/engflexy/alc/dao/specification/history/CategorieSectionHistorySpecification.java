package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.CategorieSectionHistoryCriteria;
import ma.engflexy.alc.bean.history.CategorieSectionHistory;


public class CategorieSectionHistorySpecification extends AbstractHistorySpecification<CategorieSectionHistoryCriteria, CategorieSectionHistory> {

    public CategorieSectionHistorySpecification(CategorieSectionHistoryCriteria criteria) {
        super(criteria);
    }

    public CategorieSectionHistorySpecification(CategorieSectionHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
