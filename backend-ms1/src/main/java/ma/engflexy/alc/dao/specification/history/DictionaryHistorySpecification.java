package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.DictionaryHistoryCriteria;
import ma.engflexy.alc.bean.history.DictionaryHistory;


public class DictionaryHistorySpecification extends AbstractHistorySpecification<DictionaryHistoryCriteria, DictionaryHistory> {

    public DictionaryHistorySpecification(DictionaryHistoryCriteria criteria) {
        super(criteria);
    }

    public DictionaryHistorySpecification(DictionaryHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
