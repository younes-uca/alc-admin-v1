package  ma.engflexy.alc.dao.specification.core;

import ma.engflexy.alc.zynerator.specification.AbstractSpecification;
import ma.engflexy.alc.dao.criteria.core.ProfCriteria;
import ma.engflexy.alc.bean.core.Prof;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class ProfSpecification extends  AbstractSpecification<ProfCriteria, Prof>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("ref", criteria.getRef(),criteria.getRefLike());
        addPredicate("about", criteria.getAbout(),criteria.getAboutLike());
        addPredicate("email", criteria.getEmail(),criteria.getEmailLike());
        addPredicateBool("credentialsNonExpired", criteria.getCredentialsNonExpired());
        addPredicateBool("enabled", criteria.getEnabled());
        addPredicateBool("accountNonExpired", criteria.getAccountNonExpired());
        addPredicateBool("accountNonLocked", criteria.getAccountNonLocked());
        addPredicateBool("passwordChanged", criteria.getPasswordChanged());
        addPredicate("createdAt", criteria.getCreatedAt(),criteria.getCreatedAtLike());
        addPredicate("updatedAt", criteria.getUpdatedAt(),criteria.getUpdatedAtLike());
        addPredicate("username", criteria.getUsername(),criteria.getUsernameLike());
        addPredicate("password", criteria.getPassword(),criteria.getPasswordLike());
        addPredicate("prenom", criteria.getPrenom(),criteria.getPrenomLike());
        addPredicate("nom", criteria.getNom(),criteria.getNomLike());
        addPredicateFk("parcours","id", criteria.getParcours()==null?null:criteria.getParcours().getId());
        addPredicateFk("parcours","code", criteria.getParcours()==null?null:criteria.getParcours().getCode());
        addPredicateFk("categorieProf","id", criteria.getCategorieProf()==null?null:criteria.getCategorieProf().getId());
        addPredicateFk("categorieProf","code", criteria.getCategorieProf()==null?null:criteria.getCategorieProf().getCode());
        addPredicateFk("typeTeacher","id", criteria.getTypeTeacher()==null?null:criteria.getTypeTeacher().getId());
        addPredicateFk("typeTeacher","code", criteria.getTypeTeacher()==null?null:criteria.getTypeTeacher().getCode());
    }

    public ProfSpecification(ProfCriteria criteria) {
        super(criteria);
    }

    public ProfSpecification(ProfCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
