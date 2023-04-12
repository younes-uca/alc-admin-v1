package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.FonctionHistoryCriteria;
import ma.engflexy.alc.bean.history.FonctionHistory;


public class FonctionHistorySpecification extends AbstractHistorySpecification<FonctionHistoryCriteria, FonctionHistory> {

    public FonctionHistorySpecification(FonctionHistoryCriteria criteria) {
        super(criteria);
    }

    public FonctionHistorySpecification(FonctionHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
