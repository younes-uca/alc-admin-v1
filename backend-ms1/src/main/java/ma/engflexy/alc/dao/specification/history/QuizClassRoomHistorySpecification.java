package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.QuizClassRoomHistoryCriteria;
import ma.engflexy.alc.bean.history.QuizClassRoomHistory;


public class QuizClassRoomHistorySpecification extends AbstractHistorySpecification<QuizClassRoomHistoryCriteria, QuizClassRoomHistory> {

    public QuizClassRoomHistorySpecification(QuizClassRoomHistoryCriteria criteria) {
        super(criteria);
    }

    public QuizClassRoomHistorySpecification(QuizClassRoomHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
