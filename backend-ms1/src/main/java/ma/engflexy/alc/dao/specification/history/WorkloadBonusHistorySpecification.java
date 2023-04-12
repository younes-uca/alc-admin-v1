package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.WorkloadBonusHistoryCriteria;
import ma.engflexy.alc.bean.history.WorkloadBonusHistory;


public class WorkloadBonusHistorySpecification extends AbstractHistorySpecification<WorkloadBonusHistoryCriteria, WorkloadBonusHistory> {

    public WorkloadBonusHistorySpecification(WorkloadBonusHistoryCriteria criteria) {
        super(criteria);
    }

    public WorkloadBonusHistorySpecification(WorkloadBonusHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
