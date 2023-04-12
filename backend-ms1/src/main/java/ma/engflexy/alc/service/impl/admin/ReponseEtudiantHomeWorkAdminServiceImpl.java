package ma.engflexy.alc.service.impl.admin;

import ma.engflexy.alc.bean.core.ReponseEtudiantHomeWork;
import ma.engflexy.alc.bean.history.ReponseEtudiantHomeWorkHistory;
import ma.engflexy.alc.dao.criteria.core.ReponseEtudiantHomeWorkCriteria;
import ma.engflexy.alc.dao.criteria.history.ReponseEtudiantHomeWorkHistoryCriteria;
import ma.engflexy.alc.dao.facade.core.ReponseEtudiantHomeWorkDao;
import ma.engflexy.alc.dao.facade.history.ReponseEtudiantHomeWorkHistoryDao;
import ma.engflexy.alc.dao.specification.core.ReponseEtudiantHomeWorkSpecification;
import ma.engflexy.alc.service.facade.admin.ReponseEtudiantHomeWorkAdminService;
import ma.engflexy.alc.zynerator.service.AbstractServiceImpl;
import ma.engflexy.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.engflexy.alc.service.facade.admin.HomeWorkEtudiantAdminService ;
import ma.engflexy.alc.service.facade.admin.HoweWorkQSTReponseAdminService ;
import ma.engflexy.alc.service.facade.admin.HomeWorkQuestionAdminService ;


import java.util.List;
@Service
public class ReponseEtudiantHomeWorkAdminServiceImpl extends AbstractServiceImpl<ReponseEtudiantHomeWork,ReponseEtudiantHomeWorkHistory, ReponseEtudiantHomeWorkCriteria, ReponseEtudiantHomeWorkHistoryCriteria, ReponseEtudiantHomeWorkDao,
ReponseEtudiantHomeWorkHistoryDao> implements ReponseEtudiantHomeWorkAdminService {



    public List<ReponseEtudiantHomeWork> findByHoweWorkQSTReponseId(Long id){
        return dao.findByHoweWorkQSTReponseId(id);
    }
    public int deleteByHoweWorkQSTReponseId(Long id){
        return dao.deleteByHoweWorkQSTReponseId(id);
    }
    public List<ReponseEtudiantHomeWork> findByHomeWorkEtudiantId(Long id){
        return dao.findByHomeWorkEtudiantId(id);
    }
    public int deleteByHomeWorkEtudiantId(Long id){
        return dao.deleteByHomeWorkEtudiantId(id);
    }
    public List<ReponseEtudiantHomeWork> findByHomeWorkQuestionId(Long id){
        return dao.findByHomeWorkQuestionId(id);
    }
    public int deleteByHomeWorkQuestionId(Long id){
        return dao.deleteByHomeWorkQuestionId(id);
    }

    public void configure() {
        super.configure(ReponseEtudiantHomeWork.class,ReponseEtudiantHomeWorkHistory.class, ReponseEtudiantHomeWorkHistoryCriteria.class, ReponseEtudiantHomeWorkSpecification.class);
    }

    @Autowired
    private HomeWorkEtudiantAdminService homeWorkEtudiantService ;
    @Autowired
    private HoweWorkQSTReponseAdminService howeWorkQSTReponseService ;
    @Autowired
    private HomeWorkQuestionAdminService homeWorkQuestionService ;
    public ReponseEtudiantHomeWorkAdminServiceImpl(ReponseEtudiantHomeWorkDao dao, ReponseEtudiantHomeWorkHistoryDao historyDao) {
        super(dao, historyDao);
    }

}