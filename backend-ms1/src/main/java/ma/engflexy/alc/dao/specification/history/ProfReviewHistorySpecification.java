package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.ProfReviewHistoryCriteria;
import ma.engflexy.alc.bean.history.ProfReviewHistory;


public class ProfReviewHistorySpecification extends AbstractHistorySpecification<ProfReviewHistoryCriteria, ProfReviewHistory> {

    public ProfReviewHistorySpecification(ProfReviewHistoryCriteria criteria) {
        super(criteria);
    }

    public ProfReviewHistorySpecification(ProfReviewHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
