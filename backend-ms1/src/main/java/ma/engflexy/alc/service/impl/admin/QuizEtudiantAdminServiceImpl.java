package ma.engflexy.alc.service.impl.admin;

import ma.engflexy.alc.bean.core.QuizEtudiant;
import ma.engflexy.alc.bean.history.QuizEtudiantHistory;
import ma.engflexy.alc.dao.criteria.core.QuizEtudiantCriteria;
import ma.engflexy.alc.dao.criteria.history.QuizEtudiantHistoryCriteria;
import ma.engflexy.alc.dao.facade.core.QuizEtudiantDao;
import ma.engflexy.alc.dao.facade.history.QuizEtudiantHistoryDao;
import ma.engflexy.alc.dao.specification.core.QuizEtudiantSpecification;
import ma.engflexy.alc.service.facade.admin.QuizEtudiantAdminService;
import ma.engflexy.alc.zynerator.service.AbstractServiceImpl;
import ma.engflexy.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ma.engflexy.alc.bean.core.ReponseEtudiant;

import ma.engflexy.alc.service.facade.admin.EtudiantAdminService ;
import ma.engflexy.alc.service.facade.admin.ReponseEtudiantAdminService ;
import ma.engflexy.alc.service.facade.admin.QuizAdminService ;


import java.util.List;
@Service
public class QuizEtudiantAdminServiceImpl extends AbstractServiceImpl<QuizEtudiant,QuizEtudiantHistory, QuizEtudiantCriteria, QuizEtudiantHistoryCriteria, QuizEtudiantDao,
QuizEtudiantHistoryDao> implements QuizEtudiantAdminService {

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
    public QuizEtudiant create(QuizEtudiant t) {
        super.create(t);
        if (t.getReponseEtudiants() != null) {
                t.getReponseEtudiants().forEach(element-> {
                    element.setQuizEtudiant(t);
                    reponseEtudiantService.create(element);
            });
        }
        return t;
    }

    public QuizEtudiant findWithAssociatedLists(Long id){
        QuizEtudiant result = dao.findById(id).orElse(null);
        if(result!=null && result.getId() != null) {
            result.setReponseEtudiants(reponseEtudiantService.findByQuizEtudiantId(id));
        }
        return result;
    }
    @Transactional
    public void deleteAssociatedLists(Long id) {
        reponseEtudiantService.deleteByQuizEtudiantId(id);
    }


    public void updateWithAssociatedLists(QuizEtudiant quizEtudiant){
    if(quizEtudiant !=null && quizEtudiant.getId() != null){
            List<List<ReponseEtudiant>> resultReponseEtudiants= reponseEtudiantService.getToBeSavedAndToBeDeleted(reponseEtudiantService.findByQuizEtudiantId(quizEtudiant.getId()),quizEtudiant.getReponseEtudiants());
            reponseEtudiantService.delete(resultReponseEtudiants.get(1));
            ListUtil.emptyIfNull(resultReponseEtudiants.get(0)).forEach(e -> e.setQuizEtudiant(quizEtudiant));
            reponseEtudiantService.update(resultReponseEtudiants.get(0),true);
    }
    }

    public QuizEtudiant findByReferenceEntity(QuizEtudiant t){
        return  dao.findByRef(t.getRef());
    }

    public List<QuizEtudiant> findByEtudiantId(Long id){
        return dao.findByEtudiantId(id);
    }
    public int deleteByEtudiantId(Long id){
        return dao.deleteByEtudiantId(id);
    }
    public List<QuizEtudiant> findByQuizId(Long id){
        return dao.findByQuizId(id);
    }
    public int deleteByQuizId(Long id){
        return dao.deleteByQuizId(id);
    }

    public void configure() {
        super.configure(QuizEtudiant.class,QuizEtudiantHistory.class, QuizEtudiantHistoryCriteria.class, QuizEtudiantSpecification.class);
    }

    @Autowired
    private EtudiantAdminService etudiantService ;
    @Autowired
    private ReponseEtudiantAdminService reponseEtudiantService ;
    @Autowired
    private QuizAdminService quizService ;
    public QuizEtudiantAdminServiceImpl(QuizEtudiantDao dao, QuizEtudiantHistoryDao historyDao) {
        super(dao, historyDao);
    }

}