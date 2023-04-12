package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.QuizEtudiantHistoryCriteria;
import ma.engflexy.alc.bean.history.QuizEtudiantHistory;


public class QuizEtudiantHistorySpecification extends AbstractHistorySpecification<QuizEtudiantHistoryCriteria, QuizEtudiantHistory> {

    public QuizEtudiantHistorySpecification(QuizEtudiantHistoryCriteria criteria) {
        super(criteria);
    }

    public QuizEtudiantHistorySpecification(QuizEtudiantHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
