package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.InteretEtudiantHistoryCriteria;
import ma.engflexy.alc.bean.history.InteretEtudiantHistory;


public class InteretEtudiantHistorySpecification extends AbstractHistorySpecification<InteretEtudiantHistoryCriteria, InteretEtudiantHistory> {

    public InteretEtudiantHistorySpecification(InteretEtudiantHistoryCriteria criteria) {
        super(criteria);
    }

    public InteretEtudiantHistorySpecification(InteretEtudiantHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
