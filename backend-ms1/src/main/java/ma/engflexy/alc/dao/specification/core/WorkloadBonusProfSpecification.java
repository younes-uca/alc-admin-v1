package  ma.engflexy.alc.dao.specification.core;

import ma.engflexy.alc.zynerator.specification.AbstractSpecification;
import ma.engflexy.alc.dao.criteria.core.WorkloadBonusProfCriteria;
import ma.engflexy.alc.bean.core.WorkloadBonusProf;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class WorkloadBonusProfSpecification extends  AbstractSpecification<WorkloadBonusProfCriteria, WorkloadBonusProf>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicateInt("mois", criteria.getMois(), criteria.getMoisMin(), criteria.getMoisMax());
        addPredicateInt("annee", criteria.getAnnee(), criteria.getAnneeMin(), criteria.getAnneeMax());
        addPredicateFk("workloadBonus","id", criteria.getWorkloadBonus()==null?null:criteria.getWorkloadBonus().getId());
        addPredicateFk("workloadBonus","code", criteria.getWorkloadBonus()==null?null:criteria.getWorkloadBonus().getCode());
        addPredicateFk("prof","id", criteria.getProf()==null?null:criteria.getProf().getId());
        addPredicateFk("prof","ref", criteria.getProf()==null?null:criteria.getProf().getRef());
        addPredicateFk("salary","id", criteria.getSalary()==null?null:criteria.getSalary().getId());
        addPredicateFk("salary","code", criteria.getSalary()==null?null:criteria.getSalary().getCode());
    }

    public WorkloadBonusProfSpecification(WorkloadBonusProfCriteria criteria) {
        super(criteria);
    }

    public WorkloadBonusProfSpecification(WorkloadBonusProfCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
