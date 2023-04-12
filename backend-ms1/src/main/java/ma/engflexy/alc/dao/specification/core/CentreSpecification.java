package  ma.engflexy.alc.dao.specification.core;

import ma.engflexy.alc.zynerator.specification.AbstractSpecification;
import ma.engflexy.alc.dao.criteria.core.CentreCriteria;
import ma.engflexy.alc.bean.core.Centre;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class CentreSpecification extends  AbstractSpecification<CentreCriteria, Centre>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("ref", criteria.getRef(),criteria.getRefLike());
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicate("description", criteria.getDescription(),criteria.getDescriptionLike());
        addPredicate("log", criteria.getLog(),criteria.getLogLike());
        addPredicate("password", criteria.getPassword(),criteria.getPasswordLike());
    }

    public CentreSpecification(CentreCriteria criteria) {
        super(criteria);
    }

    public CentreSpecification(CentreCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
