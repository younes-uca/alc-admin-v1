package ma.engflexy.alc.service.facade.admin;

import java.util.List;
import ma.engflexy.alc.bean.core.QuizClassRoom;
import ma.engflexy.alc.dao.criteria.core.QuizClassRoomCriteria;
import ma.engflexy.alc.dao.criteria.history.QuizClassRoomHistoryCriteria;
import ma.engflexy.alc.zynerator.service.IService;

public interface QuizClassRoomAdminService extends  IService<QuizClassRoom,QuizClassRoomCriteria, QuizClassRoomHistoryCriteria>  {

    List<QuizClassRoom> findByClassRoomId(Long id);
    int deleteByClassRoomId(Long id);
    List<QuizClassRoom> findByQuizId(Long id);
    int deleteByQuizId(Long id);



}
