package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.RecommendTeacherHistoryCriteria;
import ma.engflexy.alc.bean.history.RecommendTeacherHistory;


public class RecommendTeacherHistorySpecification extends AbstractHistorySpecification<RecommendTeacherHistoryCriteria, RecommendTeacherHistory> {

    public RecommendTeacherHistorySpecification(RecommendTeacherHistoryCriteria criteria) {
        super(criteria);
    }

    public RecommendTeacherHistorySpecification(RecommendTeacherHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
