package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.TypeTeacherHistoryCriteria;
import ma.engflexy.alc.bean.history.TypeTeacherHistory;


public class TypeTeacherHistorySpecification extends AbstractHistorySpecification<TypeTeacherHistoryCriteria, TypeTeacherHistory> {

    public TypeTeacherHistorySpecification(TypeTeacherHistoryCriteria criteria) {
        super(criteria);
    }

    public TypeTeacherHistorySpecification(TypeTeacherHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
