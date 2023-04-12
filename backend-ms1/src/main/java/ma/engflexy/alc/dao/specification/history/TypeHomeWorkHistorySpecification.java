package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.TypeHomeWorkHistoryCriteria;
import ma.engflexy.alc.bean.history.TypeHomeWorkHistory;


public class TypeHomeWorkHistorySpecification extends AbstractHistorySpecification<TypeHomeWorkHistoryCriteria, TypeHomeWorkHistory> {

    public TypeHomeWorkHistorySpecification(TypeHomeWorkHistoryCriteria criteria) {
        super(criteria);
    }

    public TypeHomeWorkHistorySpecification(TypeHomeWorkHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
