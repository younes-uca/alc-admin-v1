package  ma.engflexy.alc.dao.specification.core;

import ma.engflexy.alc.zynerator.specification.AbstractSpecification;
import ma.engflexy.alc.dao.criteria.core.TypeTeacherCriteria;
import ma.engflexy.alc.bean.core.TypeTeacher;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class TypeTeacherSpecification extends  AbstractSpecification<TypeTeacherCriteria, TypeTeacher>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
    }

    public TypeTeacherSpecification(TypeTeacherCriteria criteria) {
        super(criteria);
    }

    public TypeTeacherSpecification(TypeTeacherCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
