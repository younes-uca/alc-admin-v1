package ma.engflexy.alc.service.impl.admin;

import ma.engflexy.alc.bean.core.Vocabulary;
import ma.engflexy.alc.bean.history.VocabularyHistory;
import ma.engflexy.alc.dao.criteria.core.VocabularyCriteria;
import ma.engflexy.alc.dao.criteria.history.VocabularyHistoryCriteria;
import ma.engflexy.alc.dao.facade.core.VocabularyDao;
import ma.engflexy.alc.dao.facade.history.VocabularyHistoryDao;
import ma.engflexy.alc.dao.specification.core.VocabularySpecification;
import ma.engflexy.alc.service.facade.admin.VocabularyAdminService;
import ma.engflexy.alc.zynerator.service.AbstractServiceImpl;
import ma.engflexy.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.engflexy.alc.service.facade.admin.SectionAdminService ;
import ma.engflexy.alc.service.facade.admin.VocabularyQuizAdminService ;


import java.util.List;
@Service
public class VocabularyAdminServiceImpl extends AbstractServiceImpl<Vocabulary,VocabularyHistory, VocabularyCriteria, VocabularyHistoryCriteria, VocabularyDao,
VocabularyHistoryDao> implements VocabularyAdminService {



    public List<Vocabulary> findBySectionId(Long id){
        return dao.findBySectionId(id);
    }
    public int deleteBySectionId(Long id){
        return dao.deleteBySectionId(id);
    }
    public List<Vocabulary> findByVocabularyQuizId(Long id){
        return dao.findByVocabularyQuizId(id);
    }
    public int deleteByVocabularyQuizId(Long id){
        return dao.deleteByVocabularyQuizId(id);
    }

    public void configure() {
        super.configure(Vocabulary.class,VocabularyHistory.class, VocabularyHistoryCriteria.class, VocabularySpecification.class);
    }

    @Autowired
    private SectionAdminService sectionService ;
    @Autowired
    private VocabularyQuizAdminService vocabularyQuizService ;
    public VocabularyAdminServiceImpl(VocabularyDao dao, VocabularyHistoryDao historyDao) {
        super(dao, historyDao);
    }

}