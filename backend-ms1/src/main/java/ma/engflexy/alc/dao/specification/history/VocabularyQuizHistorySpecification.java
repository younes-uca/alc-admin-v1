package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.VocabularyQuizHistoryCriteria;
import ma.engflexy.alc.bean.history.VocabularyQuizHistory;


public class VocabularyQuizHistorySpecification extends AbstractHistorySpecification<VocabularyQuizHistoryCriteria, VocabularyQuizHistory> {

    public VocabularyQuizHistorySpecification(VocabularyQuizHistoryCriteria criteria) {
        super(criteria);
    }

    public VocabularyQuizHistorySpecification(VocabularyQuizHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
