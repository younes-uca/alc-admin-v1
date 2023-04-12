package ma.engflexy.alc.service.facade.admin;

import java.util.List;
import ma.engflexy.alc.bean.core.Vocabulary;
import ma.engflexy.alc.dao.criteria.core.VocabularyCriteria;
import ma.engflexy.alc.dao.criteria.history.VocabularyHistoryCriteria;
import ma.engflexy.alc.zynerator.service.IService;

public interface VocabularyAdminService extends  IService<Vocabulary,VocabularyCriteria, VocabularyHistoryCriteria>  {

    List<Vocabulary> findBySectionId(Long id);
    int deleteBySectionId(Long id);
    List<Vocabulary> findByVocabularyQuizId(Long id);
    int deleteByVocabularyQuizId(Long id);



}
