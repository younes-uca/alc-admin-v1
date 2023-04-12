package ma.engflexy.alc.service.facade.admin;

import java.util.List;
import ma.engflexy.alc.bean.core.Question;
import ma.engflexy.alc.dao.criteria.core.QuestionCriteria;
import ma.engflexy.alc.dao.criteria.history.QuestionHistoryCriteria;
import ma.engflexy.alc.zynerator.service.IService;

public interface QuestionAdminService extends  IService<Question,QuestionCriteria, QuestionHistoryCriteria>  {

    List<Question> findByTypeDeQuestionId(Long id);
    int deleteByTypeDeQuestionId(Long id);
    List<Question> findByQuizId(Long id);
    int deleteByQuizId(Long id);
    List<Question> findByHomeWorkId(Long id);
    int deleteByHomeWorkId(Long id);



}
