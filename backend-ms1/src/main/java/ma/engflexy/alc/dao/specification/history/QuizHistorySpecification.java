package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.QuizHistoryCriteria;
import ma.engflexy.alc.bean.history.QuizHistory;


public class QuizHistorySpecification extends AbstractHistorySpecification<QuizHistoryCriteria, QuizHistory> {

    public QuizHistorySpecification(QuizHistoryCriteria criteria) {
        super(criteria);
    }

    public QuizHistorySpecification(QuizHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
