package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.NewsHistoryCriteria;
import ma.engflexy.alc.bean.history.NewsHistory;


public class NewsHistorySpecification extends AbstractHistorySpecification<NewsHistoryCriteria, NewsHistory> {

    public NewsHistorySpecification(NewsHistoryCriteria criteria) {
        super(criteria);
    }

    public NewsHistorySpecification(NewsHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
