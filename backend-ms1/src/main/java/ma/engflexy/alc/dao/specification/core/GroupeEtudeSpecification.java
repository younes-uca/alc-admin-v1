package  ma.engflexy.alc.dao.specification.core;

import ma.engflexy.alc.zynerator.specification.AbstractSpecification;
import ma.engflexy.alc.dao.criteria.core.GroupeEtudeCriteria;
import ma.engflexy.alc.bean.core.GroupeEtude;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class GroupeEtudeSpecification extends  AbstractSpecification<GroupeEtudeCriteria, GroupeEtude>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicateLong("nombreEtudiant", criteria.getNombreEtudiant(), criteria.getNombreEtudiantMin(), criteria.getNombreEtudiantMax());
    }

    public GroupeEtudeSpecification(GroupeEtudeCriteria criteria) {
        super(criteria);
    }

    public GroupeEtudeSpecification(GroupeEtudeCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
