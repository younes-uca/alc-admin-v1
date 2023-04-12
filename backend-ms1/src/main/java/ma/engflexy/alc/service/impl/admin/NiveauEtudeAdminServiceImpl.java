package ma.engflexy.alc.service.impl.admin;

import ma.engflexy.alc.bean.core.NiveauEtude;
import ma.engflexy.alc.bean.history.NiveauEtudeHistory;
import ma.engflexy.alc.dao.criteria.core.NiveauEtudeCriteria;
import ma.engflexy.alc.dao.criteria.history.NiveauEtudeHistoryCriteria;
import ma.engflexy.alc.dao.facade.core.NiveauEtudeDao;
import ma.engflexy.alc.dao.facade.history.NiveauEtudeHistoryDao;
import ma.engflexy.alc.dao.specification.core.NiveauEtudeSpecification;
import ma.engflexy.alc.service.facade.admin.NiveauEtudeAdminService;
import ma.engflexy.alc.zynerator.service.AbstractServiceImpl;
import ma.engflexy.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class NiveauEtudeAdminServiceImpl extends AbstractServiceImpl<NiveauEtude,NiveauEtudeHistory, NiveauEtudeCriteria, NiveauEtudeHistoryCriteria, NiveauEtudeDao,
NiveauEtudeHistoryDao> implements NiveauEtudeAdminService {


    public NiveauEtude findByReferenceEntity(NiveauEtude t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(NiveauEtude.class,NiveauEtudeHistory.class, NiveauEtudeHistoryCriteria.class, NiveauEtudeSpecification.class);
    }

    public NiveauEtudeAdminServiceImpl(NiveauEtudeDao dao, NiveauEtudeHistoryDao historyDao) {
        super(dao, historyDao);
    }

}