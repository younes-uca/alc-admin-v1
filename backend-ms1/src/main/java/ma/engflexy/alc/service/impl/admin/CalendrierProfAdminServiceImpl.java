package ma.engflexy.alc.service.impl.admin;

import ma.engflexy.alc.bean.core.CalendrierProf;
import ma.engflexy.alc.bean.history.CalendrierProfHistory;
import ma.engflexy.alc.dao.criteria.core.CalendrierProfCriteria;
import ma.engflexy.alc.dao.criteria.history.CalendrierProfHistoryCriteria;
import ma.engflexy.alc.dao.facade.core.CalendrierProfDao;
import ma.engflexy.alc.dao.facade.history.CalendrierProfHistoryDao;
import ma.engflexy.alc.dao.specification.core.CalendrierProfSpecification;
import ma.engflexy.alc.service.facade.admin.CalendrierProfAdminService;
import ma.engflexy.alc.zynerator.service.AbstractServiceImpl;
import ma.engflexy.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.engflexy.alc.service.facade.admin.ProfAdminService ;
import ma.engflexy.alc.service.facade.admin.EtudiantAdminService ;


import java.util.List;
@Service
public class CalendrierProfAdminServiceImpl extends AbstractServiceImpl<CalendrierProf,CalendrierProfHistory, CalendrierProfCriteria, CalendrierProfHistoryCriteria, CalendrierProfDao,
CalendrierProfHistoryDao> implements CalendrierProfAdminService {


    public CalendrierProf findByReferenceEntity(CalendrierProf t){
        return  dao.findByRef(t.getRef());
    }

    public List<CalendrierProf> findByProfId(Long id){
        return dao.findByProfId(id);
    }
    public int deleteByProfId(Long id){
        return dao.deleteByProfId(id);
    }
    public List<CalendrierProf> findByEtudiantId(Long id){
        return dao.findByEtudiantId(id);
    }
    public int deleteByEtudiantId(Long id){
        return dao.deleteByEtudiantId(id);
    }

    public void configure() {
        super.configure(CalendrierProf.class,CalendrierProfHistory.class, CalendrierProfHistoryCriteria.class, CalendrierProfSpecification.class);
    }

    @Autowired
    private ProfAdminService profService ;
    @Autowired
    private EtudiantAdminService etudiantService ;
    public CalendrierProfAdminServiceImpl(CalendrierProfDao dao, CalendrierProfHistoryDao historyDao) {
        super(dao, historyDao);
    }

}