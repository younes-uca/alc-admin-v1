package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.TypeDeQuestionHistoryCriteria;
import ma.engflexy.alc.bean.history.TypeDeQuestionHistory;


public class TypeDeQuestionHistorySpecification extends AbstractHistorySpecification<TypeDeQuestionHistoryCriteria, TypeDeQuestionHistory> {

    public TypeDeQuestionHistorySpecification(TypeDeQuestionHistoryCriteria criteria) {
        super(criteria);
    }

    public TypeDeQuestionHistorySpecification(TypeDeQuestionHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
