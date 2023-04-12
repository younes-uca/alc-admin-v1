package ma.engflexy.alc.service.impl.admin;

import ma.engflexy.alc.bean.core.EtudiantReview;
import ma.engflexy.alc.bean.history.EtudiantReviewHistory;
import ma.engflexy.alc.dao.criteria.core.EtudiantReviewCriteria;
import ma.engflexy.alc.dao.criteria.history.EtudiantReviewHistoryCriteria;
import ma.engflexy.alc.dao.facade.core.EtudiantReviewDao;
import ma.engflexy.alc.dao.facade.history.EtudiantReviewHistoryDao;
import ma.engflexy.alc.dao.specification.core.EtudiantReviewSpecification;
import ma.engflexy.alc.service.facade.admin.EtudiantReviewAdminService;
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
public class EtudiantReviewAdminServiceImpl extends AbstractServiceImpl<EtudiantReview,EtudiantReviewHistory, EtudiantReviewCriteria, EtudiantReviewHistoryCriteria, EtudiantReviewDao,
EtudiantReviewHistoryDao> implements EtudiantReviewAdminService {



    public List<EtudiantReview> findByEtudiantId(Long id){
        return dao.findByEtudiantId(id);
    }
    public int deleteByEtudiantId(Long id){
        return dao.deleteByEtudiantId(id);
    }
    public List<EtudiantReview> findByProfId(Long id){
        return dao.findByProfId(id);
    }
    public int deleteByProfId(Long id){
        return dao.deleteByProfId(id);
    }
    public List<EtudiantReview> findByCoursId(Long id){
        return dao.findByCoursId(id);
    }
    public int deleteByCoursId(Long id){
        return dao.deleteByCoursId(id);
    }

    public void configure() {
        super.configure(EtudiantReview.class,EtudiantReviewHistory.class, EtudiantReviewHistoryCriteria.class, EtudiantReviewSpecification.class);
    }

    @Autowired
    private CoursAdminService coursService ;
    @Autowired
    private EtudiantAdminService etudiantService ;
    @Autowired
    private ProfAdminService profService ;
    public EtudiantReviewAdminServiceImpl(EtudiantReviewDao dao, EtudiantReviewHistoryDao historyDao) {
        super(dao, historyDao);
    }

}