package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.EtudiantReviewHistoryCriteria;
import ma.engflexy.alc.bean.history.EtudiantReviewHistory;


public class EtudiantReviewHistorySpecification extends AbstractHistorySpecification<EtudiantReviewHistoryCriteria, EtudiantReviewHistory> {

    public EtudiantReviewHistorySpecification(EtudiantReviewHistoryCriteria criteria) {
        super(criteria);
    }

    public EtudiantReviewHistorySpecification(EtudiantReviewHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
