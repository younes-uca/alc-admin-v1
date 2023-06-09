package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.VocabularyHistoryCriteria;
import ma.engflexy.alc.bean.history.VocabularyHistory;


public class VocabularyHistorySpecification extends AbstractHistorySpecification<VocabularyHistoryCriteria, VocabularyHistory> {

    public VocabularyHistorySpecification(VocabularyHistoryCriteria criteria) {
        super(criteria);
    }

    public VocabularyHistorySpecification(VocabularyHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
