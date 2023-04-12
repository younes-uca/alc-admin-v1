package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.PackStudentHistoryCriteria;
import ma.engflexy.alc.bean.history.PackStudentHistory;


public class PackStudentHistorySpecification extends AbstractHistorySpecification<PackStudentHistoryCriteria, PackStudentHistory> {

    public PackStudentHistorySpecification(PackStudentHistoryCriteria criteria) {
        super(criteria);
    }

    public PackStudentHistorySpecification(PackStudentHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
