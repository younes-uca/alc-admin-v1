package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.SectionItemHistoryCriteria;
import ma.engflexy.alc.bean.history.SectionItemHistory;


public class SectionItemHistorySpecification extends AbstractHistorySpecification<SectionItemHistoryCriteria, SectionItemHistory> {

    public SectionItemHistorySpecification(SectionItemHistoryCriteria criteria) {
        super(criteria);
    }

    public SectionItemHistorySpecification(SectionItemHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
