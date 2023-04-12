package ma.engflexy.alc.service.impl.admin;

import ma.engflexy.alc.bean.core.Question;
import ma.engflexy.alc.bean.history.QuestionHistory;
import ma.engflexy.alc.dao.criteria.core.QuestionCriteria;
import ma.engflexy.alc.dao.criteria.history.QuestionHistoryCriteria;
import ma.engflexy.alc.dao.facade.core.QuestionDao;
import ma.engflexy.alc.dao.facade.history.QuestionHistoryDao;
import ma.engflexy.alc.dao.specification.core.QuestionSpecification;
import ma.engflexy.alc.service.facade.admin.QuestionAdminService;
import ma.engflexy.alc.zynerator.service.AbstractServiceImpl;
import ma.engflexy.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ma.engflexy.alc.bean.core.Reponse;

import ma.engflexy.alc.service.facade.admin.TypeDeQuestionAdminService ;
import ma.engflexy.alc.service.facade.admin.HomeWorkAdminService ;
import ma.engflexy.alc.service.facade.admin.ReponseAdminService ;
import ma.engflexy.alc.service.facade.admin.QuizAdminService ;


import java.util.List;
@Service
public class QuestionAdminServiceImpl extends AbstractServiceImpl<Question,QuestionHistory, QuestionCriteria, QuestionHistoryCriteria, QuestionDao,
QuestionHistoryDao> implements QuestionAdminService {

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
    public Question create(Question t) {
        super.create(t);
        if (t.getReponses() != null) {
                t.getReponses().forEach(element-> {
                    element.setQuestion(t);
                    reponseService.create(element);
            });
        }
        return t;
    }

    public Question findWithAssociatedLists(Long id){
        Question result = dao.findById(id).orElse(null);
        if(result!=null && result.getId() != null) {
            result.setReponses(reponseService.findByQuestionId(id));
        }
        return result;
    }
    @Transactional
    public void deleteAssociatedLists(Long id) {
        reponseService.deleteByQuestionId(id);
    }


    public void updateWithAssociatedLists(Question question){
    if(question !=null && question.getId() != null){
            List<List<Reponse>> resultReponses= reponseService.getToBeSavedAndToBeDeleted(reponseService.findByQuestionId(question.getId()),question.getReponses());
            reponseService.delete(resultReponses.get(1));
            ListUtil.emptyIfNull(resultReponses.get(0)).forEach(e -> e.setQuestion(question));
            reponseService.update(resultReponses.get(0),true);
    }
    }

    public Question findByReferenceEntity(Question t){
        return  dao.findByLibelle(t.getLibelle());
    }

    public List<Question> findByTypeDeQuestionId(Long id){
        return dao.findByTypeDeQuestionId(id);
    }
    public int deleteByTypeDeQuestionId(Long id){
        return dao.deleteByTypeDeQuestionId(id);
    }
    public List<Question> findByQuizId(Long id){
        return dao.findByQuizId(id);
    }
    public int deleteByQuizId(Long id){
        return dao.deleteByQuizId(id);
    }
    public List<Question> findByHomeWorkId(Long id){
        return dao.findByHomeWorkId(id);
    }
    public int deleteByHomeWorkId(Long id){
        return dao.deleteByHomeWorkId(id);
    }

    public void configure() {
        super.configure(Question.class,QuestionHistory.class, QuestionHistoryCriteria.class, QuestionSpecification.class);
    }

    @Autowired
    private TypeDeQuestionAdminService typeDeQuestionService ;
    @Autowired
    private HomeWorkAdminService homeWorkService ;
    @Autowired
    private ReponseAdminService reponseService ;
    @Autowired
    private QuizAdminService quizService ;
    public QuestionAdminServiceImpl(QuestionDao dao, QuestionHistoryDao historyDao) {
        super(dao, historyDao);
    }

}