package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.ClassAverageBonusProfHistoryCriteria;
import ma.engflexy.alc.bean.history.ClassAverageBonusProfHistory;


public class ClassAverageBonusProfHistorySpecification extends AbstractHistorySpecification<ClassAverageBonusProfHistoryCriteria, ClassAverageBonusProfHistory> {

    public ClassAverageBonusProfHistorySpecification(ClassAverageBonusProfHistoryCriteria criteria) {
        super(criteria);
    }

    public ClassAverageBonusProfHistorySpecification(ClassAverageBonusProfHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
