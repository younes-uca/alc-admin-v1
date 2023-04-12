package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.HomeWorkQuestionHistoryCriteria;
import ma.engflexy.alc.bean.history.HomeWorkQuestionHistory;


public class HomeWorkQuestionHistorySpecification extends AbstractHistorySpecification<HomeWorkQuestionHistoryCriteria, HomeWorkQuestionHistory> {

    public HomeWorkQuestionHistorySpecification(HomeWorkQuestionHistoryCriteria criteria) {
        super(criteria);
    }

    public HomeWorkQuestionHistorySpecification(HomeWorkQuestionHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
