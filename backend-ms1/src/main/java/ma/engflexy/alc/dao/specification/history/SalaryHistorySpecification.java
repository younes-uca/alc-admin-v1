package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.SalaryHistoryCriteria;
import ma.engflexy.alc.bean.history.SalaryHistory;


public class SalaryHistorySpecification extends AbstractHistorySpecification<SalaryHistoryCriteria, SalaryHistory> {

    public SalaryHistorySpecification(SalaryHistoryCriteria criteria) {
        super(criteria);
    }

    public SalaryHistorySpecification(SalaryHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
