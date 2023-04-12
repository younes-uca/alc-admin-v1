package ma.engflexy.alc.service.impl.admin;

import ma.engflexy.alc.bean.core.ProfReview;
import ma.engflexy.alc.bean.history.ProfReviewHistory;
import ma.engflexy.alc.dao.criteria.core.ProfReviewCriteria;
import ma.engflexy.alc.dao.criteria.history.ProfReviewHistoryCriteria;
import ma.engflexy.alc.dao.facade.core.ProfReviewDao;
import ma.engflexy.alc.dao.facade.history.ProfReviewHistoryDao;
import ma.engflexy.alc.dao.specification.core.ProfReviewSpecification;
import ma.engflexy.alc.service.facade.admin.ProfReviewAdminService;
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
public class ProfReviewAdminServiceImpl extends AbstractServiceImpl<ProfReview,ProfReviewHistory, ProfReviewCriteria, ProfReviewHistoryCriteria, ProfReviewDao,
ProfReviewHistoryDao> implements ProfReviewAdminService {



    public List<ProfReview> findByEtudiantId(Long id){
        return dao.findByEtudiantId(id);
    }
    public int deleteByEtudiantId(Long id){
        return dao.deleteByEtudiantId(id);
    }
    public List<ProfReview> findByProfId(Long id){
        return dao.findByProfId(id);
    }
    public int deleteByProfId(Long id){
        return dao.deleteByProfId(id);
    }
    public List<ProfReview> findByCoursId(Long id){
        return dao.findByCoursId(id);
    }
    public int deleteByCoursId(Long id){
        return dao.deleteByCoursId(id);
    }

    public void configure() {
        super.configure(ProfReview.class,ProfReviewHistory.class, ProfReviewHistoryCriteria.class, ProfReviewSpecification.class);
    }

    @Autowired
    private CoursAdminService coursService ;
    @Autowired
    private EtudiantAdminService etudiantService ;
    @Autowired
    private ProfAdminService profService ;
    public ProfReviewAdminServiceImpl(ProfReviewDao dao, ProfReviewHistoryDao historyDao) {
        super(dao, historyDao);
    }

}