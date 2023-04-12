package ma.engflexy.alc.service.impl.admin;

import ma.engflexy.alc.bean.core.ReponseEtudiant;
import ma.engflexy.alc.bean.history.ReponseEtudiantHistory;
import ma.engflexy.alc.dao.criteria.core.ReponseEtudiantCriteria;
import ma.engflexy.alc.dao.criteria.history.ReponseEtudiantHistoryCriteria;
import ma.engflexy.alc.dao.facade.core.ReponseEtudiantDao;
import ma.engflexy.alc.dao.facade.history.ReponseEtudiantHistoryDao;
import ma.engflexy.alc.dao.specification.core.ReponseEtudiantSpecification;
import ma.engflexy.alc.service.facade.admin.ReponseEtudiantAdminService;
import ma.engflexy.alc.zynerator.service.AbstractServiceImpl;
import ma.engflexy.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.engflexy.alc.service.facade.admin.ReponseAdminService ;
import ma.engflexy.alc.service.facade.admin.QuizEtudiantAdminService ;
import ma.engflexy.alc.service.facade.admin.QuestionAdminService ;


import java.util.List;
@Service
public class ReponseEtudiantAdminServiceImpl extends AbstractServiceImpl<ReponseEtudiant,ReponseEtudiantHistory, ReponseEtudiantCriteria, ReponseEtudiantHistoryCriteria, ReponseEtudiantDao,
ReponseEtudiantHistoryDao> implements ReponseEtudiantAdminService {


    public ReponseEtudiant findByReferenceEntity(ReponseEtudiant t){
        return  dao.findByRef(t.getRef());
    }

    public List<ReponseEtudiant> findByReponseId(Long id){
        return dao.findByReponseId(id);
    }
    public int deleteByReponseId(Long id){
        return dao.deleteByReponseId(id);
    }
    public List<ReponseEtudiant> findByQuizEtudiantId(Long id){
        return dao.findByQuizEtudiantId(id);
    }
    public int deleteByQuizEtudiantId(Long id){
        return dao.deleteByQuizEtudiantId(id);
    }
    public List<ReponseEtudiant> findByQuestionId(Long id){
        return dao.findByQuestionId(id);
    }
    public int deleteByQuestionId(Long id){
        return dao.deleteByQuestionId(id);
    }

    public void configure() {
        super.configure(ReponseEtudiant.class,ReponseEtudiantHistory.class, ReponseEtudiantHistoryCriteria.class, ReponseEtudiantSpecification.class);
    }

    @Autowired
    private ReponseAdminService reponseService ;
    @Autowired
    private QuizEtudiantAdminService quizEtudiantService ;
    @Autowired
    private QuestionAdminService questionService ;
    public ReponseEtudiantAdminServiceImpl(ReponseEtudiantDao dao, ReponseEtudiantHistoryDao historyDao) {
        super(dao, historyDao);
    }

}