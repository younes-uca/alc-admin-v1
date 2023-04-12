package  ma.engflexy.alc.dao.specification.core;

import ma.engflexy.alc.zynerator.specification.AbstractSpecification;
import ma.engflexy.alc.dao.criteria.core.ClassRoomCriteria;
import ma.engflexy.alc.bean.core.ClassRoom;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class ClassRoomSpecification extends  AbstractSpecification<ClassRoomCriteria, ClassRoom>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicateFk("prof","id", criteria.getProf()==null?null:criteria.getProf().getId());
        addPredicateFk("prof","ref", criteria.getProf()==null?null:criteria.getProf().getRef());
    }

    public ClassRoomSpecification(ClassRoomCriteria criteria) {
        super(criteria);
    }

    public ClassRoomSpecification(ClassRoomCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
