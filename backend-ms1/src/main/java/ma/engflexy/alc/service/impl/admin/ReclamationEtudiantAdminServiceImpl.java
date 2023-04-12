package ma.engflexy.alc.service.impl.admin;

import ma.engflexy.alc.bean.core.ReclamationEtudiant;
import ma.engflexy.alc.bean.history.ReclamationEtudiantHistory;
import ma.engflexy.alc.dao.criteria.core.ReclamationEtudiantCriteria;
import ma.engflexy.alc.dao.criteria.history.ReclamationEtudiantHistoryCriteria;
import ma.engflexy.alc.dao.facade.core.ReclamationEtudiantDao;
import ma.engflexy.alc.dao.facade.history.ReclamationEtudiantHistoryDao;
import ma.engflexy.alc.dao.specification.core.ReclamationEtudiantSpecification;
import ma.engflexy.alc.service.facade.admin.ReclamationEtudiantAdminService;
import ma.engflexy.alc.zynerator.service.AbstractServiceImpl;
import ma.engflexy.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.engflexy.alc.service.facade.admin.TypeReclamationEtudiantAdminService ;


import java.util.List;
@Service
public class ReclamationEtudiantAdminServiceImpl extends AbstractServiceImpl<ReclamationEtudiant,ReclamationEtudiantHistory, ReclamationEtudiantCriteria, ReclamationEtudiantHistoryCriteria, ReclamationEtudiantDao,
ReclamationEtudiantHistoryDao> implements ReclamationEtudiantAdminService {


    public ReclamationEtudiant findByReferenceEntity(ReclamationEtudiant t){
        return  dao.findByReference(t.getReference());
    }

    public List<ReclamationEtudiant> findByTypeReclamationEtudiantId(Long id){
        return dao.findByTypeReclamationEtudiantId(id);
    }
    public int deleteByTypeReclamationEtudiantId(Long id){
        return dao.deleteByTypeReclamationEtudiantId(id);
    }

    public void configure() {
        super.configure(ReclamationEtudiant.class,ReclamationEtudiantHistory.class, ReclamationEtudiantHistoryCriteria.class, ReclamationEtudiantSpecification.class);
    }

    @Autowired
    private TypeReclamationEtudiantAdminService typeReclamationEtudiantService ;
    public ReclamationEtudiantAdminServiceImpl(ReclamationEtudiantDao dao, ReclamationEtudiantHistoryDao historyDao) {
        super(dao, historyDao);
    }

}