package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.HomeWorkHistoryCriteria;
import ma.engflexy.alc.bean.history.HomeWorkHistory;


public class HomeWorkHistorySpecification extends AbstractHistorySpecification<HomeWorkHistoryCriteria, HomeWorkHistory> {

    public HomeWorkHistorySpecification(HomeWorkHistoryCriteria criteria) {
        super(criteria);
    }

    public HomeWorkHistorySpecification(HomeWorkHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
