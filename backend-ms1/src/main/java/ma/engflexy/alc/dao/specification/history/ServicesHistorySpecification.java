package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.ServicesHistoryCriteria;
import ma.engflexy.alc.bean.history.ServicesHistory;


public class ServicesHistorySpecification extends AbstractHistorySpecification<ServicesHistoryCriteria, ServicesHistory> {

    public ServicesHistorySpecification(ServicesHistoryCriteria criteria) {
        super(criteria);
    }

    public ServicesHistorySpecification(ServicesHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
