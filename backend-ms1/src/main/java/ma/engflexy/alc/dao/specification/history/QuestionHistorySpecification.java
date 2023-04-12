package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.QuestionHistoryCriteria;
import ma.engflexy.alc.bean.history.QuestionHistory;


public class QuestionHistorySpecification extends AbstractHistorySpecification<QuestionHistoryCriteria, QuestionHistory> {

    public QuestionHistorySpecification(QuestionHistoryCriteria criteria) {
        super(criteria);
    }

    public QuestionHistorySpecification(QuestionHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
