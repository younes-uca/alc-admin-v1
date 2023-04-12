package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.SectionHistoryCriteria;
import ma.engflexy.alc.bean.history.SectionHistory;


public class SectionHistorySpecification extends AbstractHistorySpecification<SectionHistoryCriteria, SectionHistory> {

    public SectionHistorySpecification(SectionHistoryCriteria criteria) {
        super(criteria);
    }

    public SectionHistorySpecification(SectionHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
