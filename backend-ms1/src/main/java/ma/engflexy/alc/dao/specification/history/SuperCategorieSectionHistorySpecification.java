package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.SuperCategorieSectionHistoryCriteria;
import ma.engflexy.alc.bean.history.SuperCategorieSectionHistory;


public class SuperCategorieSectionHistorySpecification extends AbstractHistorySpecification<SuperCategorieSectionHistoryCriteria, SuperCategorieSectionHistory> {

    public SuperCategorieSectionHistorySpecification(SuperCategorieSectionHistoryCriteria criteria) {
        super(criteria);
    }

    public SuperCategorieSectionHistorySpecification(SuperCategorieSectionHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
