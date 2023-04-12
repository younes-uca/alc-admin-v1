package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.AdminHistoryCriteria;
import ma.engflexy.alc.bean.history.AdminHistory;


public class AdminHistorySpecification extends AbstractHistorySpecification<AdminHistoryCriteria, AdminHistory> {

    public AdminHistorySpecification(AdminHistoryCriteria criteria) {
        super(criteria);
    }

    public AdminHistorySpecification(AdminHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
