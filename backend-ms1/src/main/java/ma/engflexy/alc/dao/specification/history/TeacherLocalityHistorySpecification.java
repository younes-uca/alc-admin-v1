package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.TeacherLocalityHistoryCriteria;
import ma.engflexy.alc.bean.history.TeacherLocalityHistory;


public class TeacherLocalityHistorySpecification extends AbstractHistorySpecification<TeacherLocalityHistoryCriteria, TeacherLocalityHistory> {

    public TeacherLocalityHistorySpecification(TeacherLocalityHistoryCriteria criteria) {
        super(criteria);
    }

    public TeacherLocalityHistorySpecification(TeacherLocalityHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
