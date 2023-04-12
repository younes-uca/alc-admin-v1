package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.WorkloadBonusProfHistoryCriteria;
import ma.engflexy.alc.bean.history.WorkloadBonusProfHistory;


public class WorkloadBonusProfHistorySpecification extends AbstractHistorySpecification<WorkloadBonusProfHistoryCriteria, WorkloadBonusProfHistory> {

    public WorkloadBonusProfHistorySpecification(WorkloadBonusProfHistoryCriteria criteria) {
        super(criteria);
    }

    public WorkloadBonusProfHistorySpecification(WorkloadBonusProfHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
