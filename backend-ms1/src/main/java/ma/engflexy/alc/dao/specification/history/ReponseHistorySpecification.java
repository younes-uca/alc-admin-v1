package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.ReponseHistoryCriteria;
import ma.engflexy.alc.bean.history.ReponseHistory;


public class ReponseHistorySpecification extends AbstractHistorySpecification<ReponseHistoryCriteria, ReponseHistory> {

    public ReponseHistorySpecification(ReponseHistoryCriteria criteria) {
        super(criteria);
    }

    public ReponseHistorySpecification(ReponseHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
