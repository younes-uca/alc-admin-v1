package  ma.engflexy.alc.dao.specification.core;

import ma.engflexy.alc.zynerator.specification.AbstractSpecification;
import ma.engflexy.alc.dao.criteria.core.GroupeEtudiantDetailCriteria;
import ma.engflexy.alc.bean.core.GroupeEtudiantDetail;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class GroupeEtudiantDetailSpecification extends  AbstractSpecification<GroupeEtudiantDetailCriteria, GroupeEtudiantDetail>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicateFk("groupeEtudiant","id", criteria.getGroupeEtudiant()==null?null:criteria.getGroupeEtudiant().getId());
        addPredicateFk("etudiant","id", criteria.getEtudiant()==null?null:criteria.getEtudiant().getId());
        addPredicateFk("etudiant","ref", criteria.getEtudiant()==null?null:criteria.getEtudiant().getRef());
    }

    public GroupeEtudiantDetailSpecification(GroupeEtudiantDetailCriteria criteria) {
        super(criteria);
    }

    public GroupeEtudiantDetailSpecification(GroupeEtudiantDetailCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
