package ma.engflexy.alc.service.impl.admin;

import ma.engflexy.alc.bean.core.HoweWorkQSTReponse;
import ma.engflexy.alc.bean.history.HoweWorkQSTReponseHistory;
import ma.engflexy.alc.dao.criteria.core.HoweWorkQSTReponseCriteria;
import ma.engflexy.alc.dao.criteria.history.HoweWorkQSTReponseHistoryCriteria;
import ma.engflexy.alc.dao.facade.core.HoweWorkQSTReponseDao;
import ma.engflexy.alc.dao.facade.history.HoweWorkQSTReponseHistoryDao;
import ma.engflexy.alc.dao.specification.core.HoweWorkQSTReponseSpecification;
import ma.engflexy.alc.service.facade.admin.HoweWorkQSTReponseAdminService;
import ma.engflexy.alc.zynerator.service.AbstractServiceImpl;
import ma.engflexy.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.engflexy.alc.service.facade.admin.HomeWorkQuestionAdminService ;
import ma.engflexy.alc.service.facade.admin.EtatReponseAdminService ;


import java.util.List;
@Service
public class HoweWorkQSTReponseAdminServiceImpl extends AbstractServiceImpl<HoweWorkQSTReponse,HoweWorkQSTReponseHistory, HoweWorkQSTReponseCriteria, HoweWorkQSTReponseHistoryCriteria, HoweWorkQSTReponseDao,
HoweWorkQSTReponseHistoryDao> implements HoweWorkQSTReponseAdminService {


    public HoweWorkQSTReponse findByReferenceEntity(HoweWorkQSTReponse t){
        return  dao.findByRef(t.getRef());
    }

    public List<HoweWorkQSTReponse> findByEtatReponseId(Long id){
        return dao.findByEtatReponseId(id);
    }
    public int deleteByEtatReponseId(Long id){
        return dao.deleteByEtatReponseId(id);
    }
    public List<HoweWorkQSTReponse> findByHomeWorkQuestionId(Long id){
        return dao.findByHomeWorkQuestionId(id);
    }
    public int deleteByHomeWorkQuestionId(Long id){
        return dao.deleteByHomeWorkQuestionId(id);
    }

    public void configure() {
        super.configure(HoweWorkQSTReponse.class,HoweWorkQSTReponseHistory.class, HoweWorkQSTReponseHistoryCriteria.class, HoweWorkQSTReponseSpecification.class);
    }

    @Autowired
    private HomeWorkQuestionAdminService homeWorkQuestionService ;
    @Autowired
    private EtatReponseAdminService etatReponseService ;
    public HoweWorkQSTReponseAdminServiceImpl(HoweWorkQSTReponseDao dao, HoweWorkQSTReponseHistoryDao historyDao) {
        super(dao, historyDao);
    }

}