package  ma.engflexy.alc.dao.specification.core;

import ma.engflexy.alc.zynerator.specification.AbstractSpecification;
import ma.engflexy.alc.dao.criteria.core.FaqCriteria;
import ma.engflexy.alc.bean.core.Faq;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class FaqSpecification extends  AbstractSpecification<FaqCriteria, Faq>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicateFk("faqType","id", criteria.getFaqType()==null?null:criteria.getFaqType().getId());
    }

    public FaqSpecification(FaqCriteria criteria) {
        super(criteria);
    }

    public FaqSpecification(FaqCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
