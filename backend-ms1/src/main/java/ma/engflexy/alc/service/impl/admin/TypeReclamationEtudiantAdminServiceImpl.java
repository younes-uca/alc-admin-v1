package ma.engflexy.alc.service.impl.admin;

import ma.engflexy.alc.bean.core.TypeReclamationEtudiant;
import ma.engflexy.alc.bean.history.TypeReclamationEtudiantHistory;
import ma.engflexy.alc.dao.criteria.core.TypeReclamationEtudiantCriteria;
import ma.engflexy.alc.dao.criteria.history.TypeReclamationEtudiantHistoryCriteria;
import ma.engflexy.alc.dao.facade.core.TypeReclamationEtudiantDao;
import ma.engflexy.alc.dao.facade.history.TypeReclamationEtudiantHistoryDao;
import ma.engflexy.alc.dao.specification.core.TypeReclamationEtudiantSpecification;
import ma.engflexy.alc.service.facade.admin.TypeReclamationEtudiantAdminService;
import ma.engflexy.alc.zynerator.service.AbstractServiceImpl;
import ma.engflexy.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class TypeReclamationEtudiantAdminServiceImpl extends AbstractServiceImpl<TypeReclamationEtudiant,TypeReclamationEtudiantHistory, TypeReclamationEtudiantCriteria, TypeReclamationEtudiantHistoryCriteria, TypeReclamationEtudiantDao,
TypeReclamationEtudiantHistoryDao> implements TypeReclamationEtudiantAdminService {


    public TypeReclamationEtudiant findByReferenceEntity(TypeReclamationEtudiant t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(TypeReclamationEtudiant.class,TypeReclamationEtudiantHistory.class, TypeReclamationEtudiantHistoryCriteria.class, TypeReclamationEtudiantSpecification.class);
    }

    public TypeReclamationEtudiantAdminServiceImpl(TypeReclamationEtudiantDao dao, TypeReclamationEtudiantHistoryDao historyDao) {
        super(dao, historyDao);
    }

}