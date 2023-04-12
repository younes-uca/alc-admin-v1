package ma.engflexy.alc.service.impl.admin;

import ma.engflexy.alc.bean.core.TypeReclamationProf;
import ma.engflexy.alc.bean.history.TypeReclamationProfHistory;
import ma.engflexy.alc.dao.criteria.core.TypeReclamationProfCriteria;
import ma.engflexy.alc.dao.criteria.history.TypeReclamationProfHistoryCriteria;
import ma.engflexy.alc.dao.facade.core.TypeReclamationProfDao;
import ma.engflexy.alc.dao.facade.history.TypeReclamationProfHistoryDao;
import ma.engflexy.alc.dao.specification.core.TypeReclamationProfSpecification;
import ma.engflexy.alc.service.facade.admin.TypeReclamationProfAdminService;
import ma.engflexy.alc.zynerator.service.AbstractServiceImpl;
import ma.engflexy.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class TypeReclamationProfAdminServiceImpl extends AbstractServiceImpl<TypeReclamationProf,TypeReclamationProfHistory, TypeReclamationProfCriteria, TypeReclamationProfHistoryCriteria, TypeReclamationProfDao,
TypeReclamationProfHistoryDao> implements TypeReclamationProfAdminService {


    public TypeReclamationProf findByReferenceEntity(TypeReclamationProf t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(TypeReclamationProf.class,TypeReclamationProfHistory.class, TypeReclamationProfHistoryCriteria.class, TypeReclamationProfSpecification.class);
    }

    public TypeReclamationProfAdminServiceImpl(TypeReclamationProfDao dao, TypeReclamationProfHistoryDao historyDao) {
        super(dao, historyDao);
    }

}