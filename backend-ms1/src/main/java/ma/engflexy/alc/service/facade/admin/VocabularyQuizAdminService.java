package ma.engflexy.alc.service.facade.admin;

import java.util.List;
import ma.engflexy.alc.bean.core.VocabularyQuiz;
import ma.engflexy.alc.dao.criteria.core.VocabularyQuizCriteria;
import ma.engflexy.alc.dao.criteria.history.VocabularyQuizHistoryCriteria;
import ma.engflexy.alc.zynerator.service.IService;

public interface VocabularyQuizAdminService extends  IService<VocabularyQuiz,VocabularyQuizCriteria, VocabularyQuizHistoryCriteria>  {

    List<VocabularyQuiz> findBySectionId(Long id);
    int deleteBySectionId(Long id);



}
