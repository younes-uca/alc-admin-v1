package  ma.engflexy.alc.dao.specification.core;

import ma.engflexy.alc.zynerator.specification.AbstractSpecification;
import ma.engflexy.alc.dao.criteria.core.TypeDeQuestionCriteria;
import ma.engflexy.alc.bean.core.TypeDeQuestion;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class TypeDeQuestionSpecification extends  AbstractSpecification<TypeDeQuestionCriteria, TypeDeQuestion>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("ref", criteria.getRef(),criteria.getRefLike());
        addPredicate("lib", criteria.getLib(),criteria.getLibLike());
    }

    public TypeDeQuestionSpecification(TypeDeQuestionCriteria criteria) {
        super(criteria);
    }

    public TypeDeQuestionSpecification(TypeDeQuestionCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
