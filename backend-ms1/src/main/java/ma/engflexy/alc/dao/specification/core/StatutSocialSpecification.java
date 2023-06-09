package  ma.engflexy.alc.dao.specification.core;

import ma.engflexy.alc.zynerator.specification.AbstractSpecification;
import ma.engflexy.alc.dao.criteria.core.StatutSocialCriteria;
import ma.engflexy.alc.bean.core.StatutSocial;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class StatutSocialSpecification extends  AbstractSpecification<StatutSocialCriteria, StatutSocial>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
    }

    public StatutSocialSpecification(StatutSocialCriteria criteria) {
        super(criteria);
    }

    public StatutSocialSpecification(StatutSocialCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
