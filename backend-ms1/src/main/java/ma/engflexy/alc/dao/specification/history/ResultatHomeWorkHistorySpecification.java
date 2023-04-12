package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.ResultatHomeWorkHistoryCriteria;
import ma.engflexy.alc.bean.history.ResultatHomeWorkHistory;


public class ResultatHomeWorkHistorySpecification extends AbstractHistorySpecification<ResultatHomeWorkHistoryCriteria, ResultatHomeWorkHistory> {

    public ResultatHomeWorkHistorySpecification(ResultatHomeWorkHistoryCriteria criteria) {
        super(criteria);
    }

    public ResultatHomeWorkHistorySpecification(ResultatHomeWorkHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
