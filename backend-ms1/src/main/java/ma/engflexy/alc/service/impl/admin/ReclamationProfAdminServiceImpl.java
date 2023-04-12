package ma.engflexy.alc.service.impl.admin;

import ma.engflexy.alc.bean.core.ReclamationProf;
import ma.engflexy.alc.bean.history.ReclamationProfHistory;
import ma.engflexy.alc.dao.criteria.core.ReclamationProfCriteria;
import ma.engflexy.alc.dao.criteria.history.ReclamationProfHistoryCriteria;
import ma.engflexy.alc.dao.facade.core.ReclamationProfDao;
import ma.engflexy.alc.dao.facade.history.ReclamationProfHistoryDao;
import ma.engflexy.alc.dao.specification.core.ReclamationProfSpecification;
import ma.engflexy.alc.service.facade.admin.ReclamationProfAdminService;
import ma.engflexy.alc.zynerator.service.AbstractServiceImpl;
import ma.engflexy.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.engflexy.alc.service.facade.admin.AdminAdminService ;
import ma.engflexy.alc.service.facade.admin.TypeReclamationProfAdminService ;
import ma.engflexy.alc.service.facade.admin.ProfAdminService ;


import java.util.List;
@Service
public class ReclamationProfAdminServiceImpl extends AbstractServiceImpl<ReclamationProf,ReclamationProfHistory, ReclamationProfCriteria, ReclamationProfHistoryCriteria, ReclamationProfDao,
ReclamationProfHistoryDao> implements ReclamationProfAdminService {


    public ReclamationProf findByReferenceEntity(ReclamationProf t){
        return  dao.findByReference(t.getReference());
    }

    public List<ReclamationProf> findByAdminId(Long id){
        return dao.findByAdminId(id);
    }
    public int deleteByAdminId(Long id){
        return dao.deleteByAdminId(id);
    }
    public List<ReclamationProf> findByProfId(Long id){
        return dao.findByProfId(id);
    }
    public int deleteByProfId(Long id){
        return dao.deleteByProfId(id);
    }
    public List<ReclamationProf> findByTypeReclamationProfId(Long id){
        return dao.findByTypeReclamationProfId(id);
    }
    public int deleteByTypeReclamationProfId(Long id){
        return dao.deleteByTypeReclamationProfId(id);
    }

    public void configure() {
        super.configure(ReclamationProf.class,ReclamationProfHistory.class, ReclamationProfHistoryCriteria.class, ReclamationProfSpecification.class);
    }

    @Autowired
    private AdminAdminService adminService ;
    @Autowired
    private TypeReclamationProfAdminService typeReclamationProfService ;
    @Autowired
    private ProfAdminService profService ;
    public ReclamationProfAdminServiceImpl(ReclamationProfDao dao, ReclamationProfHistoryDao historyDao) {
        super(dao, historyDao);
    }

}