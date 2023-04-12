package ma.engflexy.alc.service.facade.admin;

import java.util.List;
import ma.engflexy.alc.bean.core.HomeWorkQuestion;
import ma.engflexy.alc.dao.criteria.core.HomeWorkQuestionCriteria;
import ma.engflexy.alc.dao.criteria.history.HomeWorkQuestionHistoryCriteria;
import ma.engflexy.alc.zynerator.service.IService;

public interface HomeWorkQuestionAdminService extends  IService<HomeWorkQuestion,HomeWorkQuestionCriteria, HomeWorkQuestionHistoryCriteria>  {

    List<HomeWorkQuestion> findByTypeDeQuestionId(Long id);
    int deleteByTypeDeQuestionId(Long id);
    List<HomeWorkQuestion> findByHomeWorkId(Long id);
    int deleteByHomeWorkId(Long id);



}
