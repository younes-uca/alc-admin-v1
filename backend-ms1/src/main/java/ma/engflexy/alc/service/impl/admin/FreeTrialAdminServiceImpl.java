package ma.engflexy.alc.service.impl.admin;

import ma.engflexy.alc.bean.core.FreeTrial;
import ma.engflexy.alc.bean.history.FreeTrialHistory;
import ma.engflexy.alc.dao.criteria.core.FreeTrialCriteria;
import ma.engflexy.alc.dao.criteria.history.FreeTrialHistoryCriteria;
import ma.engflexy.alc.dao.facade.core.FreeTrialDao;
import ma.engflexy.alc.dao.facade.history.FreeTrialHistoryDao;
import ma.engflexy.alc.dao.specification.core.FreeTrialSpecification;
import ma.engflexy.alc.service.facade.admin.FreeTrialAdminService;
import ma.engflexy.alc.zynerator.service.AbstractServiceImpl;
import ma.engflexy.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ma.engflexy.alc.bean.core.FreeTrialDetail;

import ma.engflexy.alc.service.facade.admin.FreeTrialTeacherWhatsTemplateAdminService ;
import ma.engflexy.alc.service.facade.admin.FreeTrialConfigurationAdminService ;
import ma.engflexy.alc.service.facade.admin.FreeTrialDetailAdminService ;
import ma.engflexy.alc.service.facade.admin.ProfAdminService ;
import ma.engflexy.alc.service.facade.admin.NiveauEtudeAdminService ;
import ma.engflexy.alc.service.facade.admin.FreeTrialStudentWhatsTemplateAdminService ;
import ma.engflexy.alc.service.facade.admin.StatutFreeTrialAdminService ;
import ma.engflexy.alc.service.facade.admin.FreeTrialStudentEmailTemplateAdminService ;
import ma.engflexy.alc.service.facade.admin.FreeTrialTeacherEmailTemplateAdminService ;


import java.util.List;
@Service
public class FreeTrialAdminServiceImpl extends AbstractServiceImpl<FreeTrial,FreeTrialHistory, FreeTrialCriteria, FreeTrialHistoryCriteria, FreeTrialDao,
FreeTrialHistoryDao> implements FreeTrialAdminService {

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
    public FreeTrial create(FreeTrial t) {
        super.create(t);
        if (t.getFreeTrialDetails() != null) {
                t.getFreeTrialDetails().forEach(element-> {
                    element.setFreeTrial(t);
                    freeTrialDetailService.create(element);
            });
        }
        return t;
    }

    public FreeTrial findWithAssociatedLists(Long id){
        FreeTrial result = dao.findById(id).orElse(null);
        if(result!=null && result.getId() != null) {
            result.setFreeTrialDetails(freeTrialDetailService.findByFreeTrialId(id));
        }
        return result;
    }
    @Transactional
    public void deleteAssociatedLists(Long id) {
        freeTrialDetailService.deleteByFreeTrialId(id);
    }


    public void updateWithAssociatedLists(FreeTrial freeTrial){
    if(freeTrial !=null && freeTrial.getId() != null){
            List<List<FreeTrialDetail>> resultFreeTrialDetails= freeTrialDetailService.getToBeSavedAndToBeDeleted(freeTrialDetailService.findByFreeTrialId(freeTrial.getId()),freeTrial.getFreeTrialDetails());
            freeTrialDetailService.delete(resultFreeTrialDetails.get(1));
            ListUtil.emptyIfNull(resultFreeTrialDetails.get(0)).forEach(e -> e.setFreeTrial(freeTrial));
            freeTrialDetailService.update(resultFreeTrialDetails.get(0),true);
    }
    }

    public FreeTrial findByReferenceEntity(FreeTrial t){
        return  dao.findByReference(t.getReference());
    }

    public List<FreeTrial> findByProfId(Long id){
        return dao.findByProfId(id);
    }
    public int deleteByProfId(Long id){
        return dao.deleteByProfId(id);
    }
    public List<FreeTrial> findByNiveauEtudeId(Long id){
        return dao.findByNiveauEtudeId(id);
    }
    public int deleteByNiveauEtudeId(Long id){
        return dao.deleteByNiveauEtudeId(id);
    }
    public List<FreeTrial> findByFreeTrialStudentWhatsTemplateId(Long id){
        return dao.findByFreeTrialStudentWhatsTemplateId(id);
    }
    public int deleteByFreeTrialStudentWhatsTemplateId(Long id){
        return dao.deleteByFreeTrialStudentWhatsTemplateId(id);
    }
    public List<FreeTrial> findByFreeTrialStudentEmailTemplateId(Long id){
        return dao.findByFreeTrialStudentEmailTemplateId(id);
    }
    public int deleteByFreeTrialStudentEmailTemplateId(Long id){
        return dao.deleteByFreeTrialStudentEmailTemplateId(id);
    }
    public List<FreeTrial> findByFreeTrialTeacherEmailTemplateId(Long id){
        return dao.findByFreeTrialTeacherEmailTemplateId(id);
    }
    public int deleteByFreeTrialTeacherEmailTemplateId(Long id){
        return dao.deleteByFreeTrialTeacherEmailTemplateId(id);
    }
    public List<FreeTrial> findByFreeTrialTeacherWhatsTemplateId(Long id){
        return dao.findByFreeTrialTeacherWhatsTemplateId(id);
    }
    public int deleteByFreeTrialTeacherWhatsTemplateId(Long id){
        return dao.deleteByFreeTrialTeacherWhatsTemplateId(id);
    }
    public List<FreeTrial> findByFreeTrialConfigurationId(Long id){
        return dao.findByFreeTrialConfigurationId(id);
    }
    public int deleteByFreeTrialConfigurationId(Long id){
        return dao.deleteByFreeTrialConfigurationId(id);
    }
    public List<FreeTrial> findByStatutFreeTrialId(Long id){
        return dao.findByStatutFreeTrialId(id);
    }
    public int deleteByStatutFreeTrialId(Long id){
        return dao.deleteByStatutFreeTrialId(id);
    }

    public void configure() {
        super.configure(FreeTrial.class,FreeTrialHistory.class, FreeTrialHistoryCriteria.class, FreeTrialSpecification.class);
    }

    @Autowired
    private FreeTrialTeacherWhatsTemplateAdminService freeTrialTeacherWhatsTemplateService ;
    @Autowired
    private FreeTrialConfigurationAdminService freeTrialConfigurationService ;
    @Autowired
    private FreeTrialDetailAdminService freeTrialDetailService ;
    @Autowired
    private ProfAdminService profService ;
    @Autowired
    private NiveauEtudeAdminService niveauEtudeService ;
    @Autowired
    private FreeTrialStudentWhatsTemplateAdminService freeTrialStudentWhatsTemplateService ;
    @Autowired
    private StatutFreeTrialAdminService statutFreeTrialService ;
    @Autowired
    private FreeTrialStudentEmailTemplateAdminService freeTrialStudentEmailTemplateService ;
    @Autowired
    private FreeTrialTeacherEmailTemplateAdminService freeTrialTeacherEmailTemplateService ;
    public FreeTrialAdminServiceImpl(FreeTrialDao dao, FreeTrialHistoryDao historyDao) {
        super(dao, historyDao);
    }

}