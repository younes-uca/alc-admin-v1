package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.ClassRoomHistoryCriteria;
import ma.engflexy.alc.bean.history.ClassRoomHistory;


public class ClassRoomHistorySpecification extends AbstractHistorySpecification<ClassRoomHistoryCriteria, ClassRoomHistory> {

    public ClassRoomHistorySpecification(ClassRoomHistoryCriteria criteria) {
        super(criteria);
    }

    public ClassRoomHistorySpecification(ClassRoomHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
