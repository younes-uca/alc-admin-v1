package ma.engflexy.alc.service.impl.admin;

import ma.engflexy.alc.bean.core.Inscription;
import ma.engflexy.alc.bean.history.InscriptionHistory;
import ma.engflexy.alc.dao.criteria.core.InscriptionCriteria;
import ma.engflexy.alc.dao.criteria.history.InscriptionHistoryCriteria;
import ma.engflexy.alc.dao.facade.core.InscriptionDao;
import ma.engflexy.alc.dao.facade.history.InscriptionHistoryDao;
import ma.engflexy.alc.dao.specification.core.InscriptionSpecification;
import ma.engflexy.alc.service.facade.admin.InscriptionAdminService;
import ma.engflexy.alc.zynerator.service.AbstractServiceImpl;
import ma.engflexy.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.engflexy.alc.service.facade.admin.SkillAdminService ;
import ma.engflexy.alc.service.facade.admin.ParcoursAdminService ;
import ma.engflexy.alc.service.facade.admin.GroupeEtudeAdminService ;
import ma.engflexy.alc.service.facade.admin.FonctionAdminService ;
import ma.engflexy.alc.service.facade.admin.InteretEtudiantAdminService ;
import ma.engflexy.alc.service.facade.admin.PackStudentAdminService ;
import ma.engflexy.alc.service.facade.admin.EtatInscriptionAdminService ;
import ma.engflexy.alc.service.facade.admin.StatutSocialAdminService ;
import ma.engflexy.alc.service.facade.admin.EtudiantAdminService ;
import ma.engflexy.alc.service.facade.admin.NiveauEtudeAdminService ;
import ma.engflexy.alc.service.facade.admin.QuizAdminService ;


import java.util.List;
@Service
public class InscriptionAdminServiceImpl extends AbstractServiceImpl<Inscription,InscriptionHistory, InscriptionCriteria, InscriptionHistoryCriteria, InscriptionDao,
InscriptionHistoryDao> implements InscriptionAdminService {



    public List<Inscription> findByEtudiantId(Long id){
        return dao.findByEtudiantId(id);
    }
    public int deleteByEtudiantId(Long id){
        return dao.deleteByEtudiantId(id);
    }
    public List<Inscription> findByEtatInscriptionId(Long id){
        return dao.findByEtatInscriptionId(id);
    }
    public int deleteByEtatInscriptionId(Long id){
        return dao.deleteByEtatInscriptionId(id);
    }
    public List<Inscription> findByParcoursId(Long id){
        return dao.findByParcoursId(id);
    }
    public int deleteByParcoursId(Long id){
        return dao.deleteByParcoursId(id);
    }
    public List<Inscription> findByGroupeEtudeId(Long id){
        return dao.findByGroupeEtudeId(id);
    }
    public int deleteByGroupeEtudeId(Long id){
        return dao.deleteByGroupeEtudeId(id);
    }
    public List<Inscription> findByStatutSocialId(Long id){
        return dao.findByStatutSocialId(id);
    }
    public int deleteByStatutSocialId(Long id){
        return dao.deleteByStatutSocialId(id);
    }
    public List<Inscription> findByInteretEtudiantId(Long id){
        return dao.findByInteretEtudiantId(id);
    }
    public int deleteByInteretEtudiantId(Long id){
        return dao.deleteByInteretEtudiantId(id);
    }
    public List<Inscription> findByNiveauEtudeId(Long id){
        return dao.findByNiveauEtudeId(id);
    }
    public int deleteByNiveauEtudeId(Long id){
        return dao.deleteByNiveauEtudeId(id);
    }
    public List<Inscription> findByFonctionId(Long id){
        return dao.findByFonctionId(id);
    }
    public int deleteByFonctionId(Long id){
        return dao.deleteByFonctionId(id);
    }
    public List<Inscription> findByQuizNiveauId(Long id){
        return dao.findByQuizNiveauId(id);
    }
    public int deleteByQuizNiveauId(Long id){
        return dao.deleteByQuizNiveauId(id);
    }
    public List<Inscription> findByPackStudentId(Long id){
        return dao.findByPackStudentId(id);
    }
    public int deleteByPackStudentId(Long id){
        return dao.deleteByPackStudentId(id);
    }
    public List<Inscription> findBySkillId(Long id){
        return dao.findBySkillId(id);
    }
    public int deleteBySkillId(Long id){
        return dao.deleteBySkillId(id);
    }

    public void configure() {
        super.configure(Inscription.class,InscriptionHistory.class, InscriptionHistoryCriteria.class, InscriptionSpecification.class);
    }

    @Autowired
    private SkillAdminService skillService ;
    @Autowired
    private ParcoursAdminService parcoursService ;
    @Autowired
    private GroupeEtudeAdminService groupeEtudeService ;
    @Autowired
    private FonctionAdminService fonctionService ;
    @Autowired
    private InteretEtudiantAdminService interetEtudiantService ;
    @Autowired
    private PackStudentAdminService packStudentService ;
    @Autowired
    private EtatInscriptionAdminService etatInscriptionService ;
    @Autowired
    private StatutSocialAdminService statutSocialService ;
    @Autowired
    private EtudiantAdminService etudiantService ;
    @Autowired
    private NiveauEtudeAdminService niveauEtudeService ;
    @Autowired
    private QuizAdminService quizService ;
    public InscriptionAdminServiceImpl(InscriptionDao dao, InscriptionHistoryDao historyDao) {
        super(dao, historyDao);
    }

}