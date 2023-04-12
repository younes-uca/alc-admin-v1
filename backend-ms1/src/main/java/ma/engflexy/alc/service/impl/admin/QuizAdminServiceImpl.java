package ma.engflexy.alc.service.impl.admin;

import ma.engflexy.alc.bean.core.Quiz;
import ma.engflexy.alc.bean.history.QuizHistory;
import ma.engflexy.alc.dao.criteria.core.QuizCriteria;
import ma.engflexy.alc.dao.criteria.history.QuizHistoryCriteria;
import ma.engflexy.alc.dao.facade.core.QuizDao;
import ma.engflexy.alc.dao.facade.history.QuizHistoryDao;
import ma.engflexy.alc.dao.specification.core.QuizSpecification;
import ma.engflexy.alc.service.facade.admin.QuizAdminService;
import ma.engflexy.alc.zynerator.service.AbstractServiceImpl;
import ma.engflexy.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ma.engflexy.alc.bean.core.Question;
import ma.engflexy.alc.bean.core.QuizEtudiant;

import ma.engflexy.alc.service.facade.admin.SectionAdminService ;
import ma.engflexy.alc.service.facade.admin.QuizEtudiantAdminService ;
import ma.engflexy.alc.service.facade.admin.QuestionAdminService ;


import java.util.List;
@Service
public class QuizAdminServiceImpl extends AbstractServiceImpl<Quiz,QuizHistory, QuizCriteria, QuizHistoryCriteria, QuizDao,
QuizHistoryDao> implements QuizAdminService {

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
    public Quiz create(Quiz t) {
        super.create(t);
        if (t.getQuestions() != null) {
                t.getQuestions().forEach(element-> {
                    element.setQuiz(t);
                    questionService.create(element);
            });
        }
        if (t.getQuizEtudiants() != null) {
                t.getQuizEtudiants().forEach(element-> {
                    element.setQuiz(t);
                    quizEtudiantService.create(element);
            });
        }
        return t;
    }

    public Quiz findWithAssociatedLists(Long id){
        Quiz result = dao.findById(id).orElse(null);
        if(result!=null && result.getId() != null) {
            result.setQuestions(questionService.findByQuizId(id));
            result.setQuizEtudiants(quizEtudiantService.findByQuizId(id));
        }
        return result;
    }
    @Transactional
    public void deleteAssociatedLists(Long id) {
        questionService.deleteByQuizId(id);
        quizEtudiantService.deleteByQuizId(id);
    }


    public void updateWithAssociatedLists(Quiz quiz){
    if(quiz !=null && quiz.getId() != null){
            List<List<Question>> resultQuestions= questionService.getToBeSavedAndToBeDeleted(questionService.findByQuizId(quiz.getId()),quiz.getQuestions());
            questionService.delete(resultQuestions.get(1));
            ListUtil.emptyIfNull(resultQuestions.get(0)).forEach(e -> e.setQuiz(quiz));
            questionService.update(resultQuestions.get(0),true);
            List<List<QuizEtudiant>> resultQuizEtudiants= quizEtudiantService.getToBeSavedAndToBeDeleted(quizEtudiantService.findByQuizId(quiz.getId()),quiz.getQuizEtudiants());
            quizEtudiantService.delete(resultQuizEtudiants.get(1));
            ListUtil.emptyIfNull(resultQuizEtudiants.get(0)).forEach(e -> e.setQuiz(quiz));
            quizEtudiantService.update(resultQuizEtudiants.get(0),true);
    }
    }

    public Quiz findByReferenceEntity(Quiz t){
        return  dao.findByRef(t.getRef());
    }

    public List<Quiz> findBySectionId(Long id){
        return dao.findBySectionId(id);
    }
    public int deleteBySectionId(Long id){
        return dao.deleteBySectionId(id);
    }

    public void configure() {
        super.configure(Quiz.class,QuizHistory.class, QuizHistoryCriteria.class, QuizSpecification.class);
    }

    @Autowired
    private SectionAdminService sectionService ;
    @Autowired
    private QuizEtudiantAdminService quizEtudiantService ;
    @Autowired
    private QuestionAdminService questionService ;
    public QuizAdminServiceImpl(QuizDao dao, QuizHistoryDao historyDao) {
        super(dao, historyDao);
    }

}