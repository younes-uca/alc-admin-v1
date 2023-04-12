package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.InviteStudentHistoryCriteria;
import ma.engflexy.alc.bean.history.InviteStudentHistory;


public class InviteStudentHistorySpecification extends AbstractHistorySpecification<InviteStudentHistoryCriteria, InviteStudentHistory> {

    public InviteStudentHistorySpecification(InviteStudentHistoryCriteria criteria) {
        super(criteria);
    }

    public InviteStudentHistorySpecification(InviteStudentHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
