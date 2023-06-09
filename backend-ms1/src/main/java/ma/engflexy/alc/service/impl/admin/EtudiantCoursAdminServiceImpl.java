package ma.engflexy.alc.service.impl.admin;

import ma.engflexy.alc.bean.core.EtudiantCours;
import ma.engflexy.alc.bean.history.EtudiantCoursHistory;
import ma.engflexy.alc.dao.criteria.core.EtudiantCoursCriteria;
import ma.engflexy.alc.dao.criteria.history.EtudiantCoursHistoryCriteria;
import ma.engflexy.alc.dao.facade.core.EtudiantCoursDao;
import ma.engflexy.alc.dao.facade.history.EtudiantCoursHistoryDao;
import ma.engflexy.alc.dao.specification.core.EtudiantCoursSpecification;
import ma.engflexy.alc.service.facade.admin.EtudiantCoursAdminService;
import ma.engflexy.alc.zynerator.service.AbstractServiceImpl;
import ma.engflexy.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.engflexy.alc.service.facade.admin.CoursAdminService ;
import ma.engflexy.alc.service.facade.admin.EtudiantAdminService ;
import ma.engflexy.alc.service.facade.admin.ProfAdminService ;


import java.util.List;
@Service
public class EtudiantCoursAdminServiceImpl extends AbstractServiceImpl<EtudiantCours,EtudiantCoursHistory, EtudiantCoursCriteria, EtudiantCoursHistoryCriteria, EtudiantCoursDao,
EtudiantCoursHistoryDao> implements EtudiantCoursAdminService {



    public List<EtudiantCours> findByEtudiantId(Long id){
        return dao.findByEtudiantId(id);
    }
    public int deleteByEtudiantId(Long id){
        return dao.deleteByEtudiantId(id);
    }
    public List<EtudiantCours> findByProfId(Long id){
        return dao.findByProfId(id);
    }
    public int deleteByProfId(Long id){
        return dao.deleteByProfId(id);
    }
    public List<EtudiantCours> findByCoursId(Long id){
        return dao.findByCoursId(id);
    }
    public int deleteByCoursId(Long id){
        return dao.deleteByCoursId(id);
    }

    public void configure() {
        super.configure(EtudiantCours.class,EtudiantCoursHistory.class, EtudiantCoursHistoryCriteria.class, EtudiantCoursSpecification.class);
    }

    @Autowired
    private CoursAdminService coursService ;
    @Autowired
    private EtudiantAdminService etudiantService ;
    @Autowired
    private ProfAdminService profService ;
    public EtudiantCoursAdminServiceImpl(EtudiantCoursDao dao, EtudiantCoursHistoryDao historyDao) {
        super(dao, historyDao);
    }

}