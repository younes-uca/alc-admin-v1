package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.SessionCoursHistoryCriteria;
import ma.engflexy.alc.bean.history.SessionCoursHistory;


public class SessionCoursHistorySpecification extends AbstractHistorySpecification<SessionCoursHistoryCriteria, SessionCoursHistory> {

    public SessionCoursHistorySpecification(SessionCoursHistoryCriteria criteria) {
        super(criteria);
    }

    public SessionCoursHistorySpecification(SessionCoursHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
