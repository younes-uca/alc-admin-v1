package  ma.engflexy.alc.dao.specification.core;

import ma.engflexy.alc.zynerator.specification.AbstractSpecification;
import ma.engflexy.alc.dao.criteria.core.FaqTypeCriteria;
import ma.engflexy.alc.bean.core.FaqType;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class FaqTypeSpecification extends  AbstractSpecification<FaqTypeCriteria, FaqType>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
    }

    public FaqTypeSpecification(FaqTypeCriteria criteria) {
        super(criteria);
    }

    public FaqTypeSpecification(FaqTypeCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
