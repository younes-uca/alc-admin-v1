package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.ClassAverageBonusHistoryCriteria;
import ma.engflexy.alc.bean.history.ClassAverageBonusHistory;


public class ClassAverageBonusHistorySpecification extends AbstractHistorySpecification<ClassAverageBonusHistoryCriteria, ClassAverageBonusHistory> {

    public ClassAverageBonusHistorySpecification(ClassAverageBonusHistoryCriteria criteria) {
        super(criteria);
    }

    public ClassAverageBonusHistorySpecification(ClassAverageBonusHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
