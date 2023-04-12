package ma.engflexy.alc.service.impl.admin;

import ma.engflexy.alc.bean.core.Etudiant;
import ma.engflexy.alc.bean.history.EtudiantHistory;
import ma.engflexy.alc.dao.criteria.core.EtudiantCriteria;
import ma.engflexy.alc.dao.criteria.history.EtudiantHistoryCriteria;
import ma.engflexy.alc.dao.facade.core.EtudiantDao;
import ma.engflexy.alc.dao.facade.history.EtudiantHistoryDao;
import ma.engflexy.alc.dao.specification.core.EtudiantSpecification;
import ma.engflexy.alc.service.facade.admin.EtudiantAdminService;
import ma.engflexy.alc.zynerator.service.AbstractServiceImpl;
import ma.engflexy.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ma.engflexy.alc.bean.core.QuizEtudiant;
import ma.engflexy.alc.bean.core.GroupeEtudiantDetail;

import ma.engflexy.alc.service.facade.admin.TeacherLocalityAdminService ;
import ma.engflexy.alc.service.facade.admin.SkillAdminService ;
import ma.engflexy.alc.service.facade.admin.ParcoursAdminService ;
import ma.engflexy.alc.service.facade.admin.PackStudentAdminService ;
import ma.engflexy.alc.service.facade.admin.StatutSocialAdminService ;
import ma.engflexy.alc.service.facade.admin.NiveauEtudeAdminService ;
import ma.engflexy.alc.service.facade.admin.GroupeEtudiantDetailAdminService ;
import ma.engflexy.alc.service.facade.admin.GroupeEtudeAdminService ;
import ma.engflexy.alc.service.facade.admin.EtatEtudiantScheduleAdminService ;
import ma.engflexy.alc.service.facade.admin.FonctionAdminService ;
import ma.engflexy.alc.service.facade.admin.LangueAdminService ;
import ma.engflexy.alc.service.facade.admin.InteretEtudiantAdminService ;
import ma.engflexy.alc.service.facade.admin.QuizEtudiantAdminService ;


import java.util.List;
@Service
public class EtudiantAdminServiceImpl extends AbstractServiceImpl<Etudiant,EtudiantHistory, EtudiantCriteria, EtudiantHistoryCriteria, EtudiantDao,
EtudiantHistoryDao> implements EtudiantAdminService {

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
    public Etudiant create(Etudiant t) {
        super.create(t);
        if (t.getQuizEtudiants() != null) {
                t.getQuizEtudiants().forEach(element-> {
                    element.setEtudiant(t);
                    quizEtudiantService.create(element);
            });
        }
        if (t.getGroupeEtudiantDetails() != null) {
                t.getGroupeEtudiantDetails().forEach(element-> {
                    element.setEtudiant(t);
                    groupeEtudiantDetailService.create(element);
            });
        }
        return t;
    }

    public Etudiant findWithAssociatedLists(Long id){
        Etudiant result = dao.findById(id).orElse(null);
        if(result!=null && result.getId() != null) {
            result.setQuizEtudiants(quizEtudiantService.findByEtudiantId(id));
            result.setGroupeEtudiantDetails(groupeEtudiantDetailService.findByEtudiantId(id));
        }
        return result;
    }
    @Transactional
    public void deleteAssociatedLists(Long id) {
        quizEtudiantService.deleteByEtudiantId(id);
        groupeEtudiantDetailService.deleteByEtudiantId(id);
    }


    public void updateWithAssociatedLists(Etudiant etudiant){
    if(etudiant !=null && etudiant.getId() != null){
            List<List<QuizEtudiant>> resultQuizEtudiants= quizEtudiantService.getToBeSavedAndToBeDeleted(quizEtudiantService.findByEtudiantId(etudiant.getId()),etudiant.getQuizEtudiants());
            quizEtudiantService.delete(resultQuizEtudiants.get(1));
            ListUtil.emptyIfNull(resultQuizEtudiants.get(0)).forEach(e -> e.setEtudiant(etudiant));
            quizEtudiantService.update(resultQuizEtudiants.get(0),true);
            List<List<GroupeEtudiantDetail>> resultGroupeEtudiantDetails= groupeEtudiantDetailService.getToBeSavedAndToBeDeleted(groupeEtudiantDetailService.findByEtudiantId(etudiant.getId()),etudiant.getGroupeEtudiantDetails());
            groupeEtudiantDetailService.delete(resultGroupeEtudiantDetails.get(1));
            ListUtil.emptyIfNull(resultGroupeEtudiantDetails.get(0)).forEach(e -> e.setEtudiant(etudiant));
            groupeEtudiantDetailService.update(resultGroupeEtudiantDetails.get(0),true);
    }
    }

    public Etudiant findByReferenceEntity(Etudiant t){
        return  dao.findByRef(t.getRef());
    }

    public List<Etudiant> findByTeacherLocalityId(Long id){
        return dao.findByTeacherLocalityId(id);
    }
    public int deleteByTeacherLocalityId(Long id){
        return dao.deleteByTeacherLocalityId(id);
    }
    public List<Etudiant> findByEtatEtudiantScheduleId(Long id){
        return dao.findByEtatEtudiantScheduleId(id);
    }
    public int deleteByEtatEtudiantScheduleId(Long id){
        return dao.deleteByEtatEtudiantScheduleId(id);
    }
    public List<Etudiant> findByParcoursId(Long id){
        return dao.findByParcoursId(id);
    }
    public int deleteByParcoursId(Long id){
        return dao.deleteByParcoursId(id);
    }
    public List<Etudiant> findByGroupeEtudeId(Long id){
        return dao.findByGroupeEtudeId(id);
    }
    public int deleteByGroupeEtudeId(Long id){
        return dao.deleteByGroupeEtudeId(id);
    }
    public List<Etudiant> findByPackStudentId(Long id){
        return dao.findByPackStudentId(id);
    }
    public int deleteByPackStudentId(Long id){
        return dao.deleteByPackStudentId(id);
    }
    public List<Etudiant> findByStatutSocialId(Long id){
        return dao.findByStatutSocialId(id);
    }
    public int deleteByStatutSocialId(Long id){
        return dao.deleteByStatutSocialId(id);
    }
    public List<Etudiant> findByInteretEtudiantId(Long id){
        return dao.findByInteretEtudiantId(id);
    }
    public int deleteByInteretEtudiantId(Long id){
        return dao.deleteByInteretEtudiantId(id);
    }
    public List<Etudiant> findByNiveauEtudeId(Long id){
        return dao.findByNiveauEtudeId(id);
    }
    public int deleteByNiveauEtudeId(Long id){
        return dao.deleteByNiveauEtudeId(id);
    }
    public List<Etudiant> findBySkillId(Long id){
        return dao.findBySkillId(id);
    }
    public int deleteBySkillId(Long id){
        return dao.deleteBySkillId(id);
    }
    public List<Etudiant> findByFonctionId(Long id){
        return dao.findByFonctionId(id);
    }
    public int deleteByFonctionId(Long id){
        return dao.deleteByFonctionId(id);
    }
    public List<Etudiant> findByLangueId(Long id){
        return dao.findByLangueId(id);
    }
    public int deleteByLangueId(Long id){
        return dao.deleteByLangueId(id);
    }

    public void configure() {
        super.configure(Etudiant.class,EtudiantHistory.class, EtudiantHistoryCriteria.class, EtudiantSpecification.class);
    }

    @Autowired
    private TeacherLocalityAdminService teacherLocalityService ;
    @Autowired
    private SkillAdminService skillService ;
    @Autowired
    private ParcoursAdminService parcoursService ;
    @Autowired
    private PackStudentAdminService packStudentService ;
    @Autowired
    private StatutSocialAdminService statutSocialService ;
    @Autowired
    private NiveauEtudeAdminService niveauEtudeService ;
    @Autowired
    private GroupeEtudiantDetailAdminService groupeEtudiantDetailService ;
    @Autowired
    private GroupeEtudeAdminService groupeEtudeService ;
    @Autowired
    private EtatEtudiantScheduleAdminService etatEtudiantScheduleService ;
    @Autowired
    private FonctionAdminService fonctionService ;
    @Autowired
    private LangueAdminService langueService ;
    @Autowired
    private InteretEtudiantAdminService interetEtudiantService ;
    @Autowired
    private QuizEtudiantAdminService quizEtudiantService ;
    public EtudiantAdminServiceImpl(EtudiantDao dao, EtudiantHistoryDao historyDao) {
        super(dao, historyDao);
    }

}