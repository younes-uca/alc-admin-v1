package ma.engflexy.alc.service.impl.admin;

import ma.engflexy.alc.bean.core.Langue;
import ma.engflexy.alc.bean.history.LangueHistory;
import ma.engflexy.alc.dao.criteria.core.LangueCriteria;
import ma.engflexy.alc.dao.criteria.history.LangueHistoryCriteria;
import ma.engflexy.alc.dao.facade.core.LangueDao;
import ma.engflexy.alc.dao.facade.history.LangueHistoryDao;
import ma.engflexy.alc.dao.specification.core.LangueSpecification;
import ma.engflexy.alc.service.facade.admin.LangueAdminService;
import ma.engflexy.alc.zynerator.service.AbstractServiceImpl;
import ma.engflexy.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class LangueAdminServiceImpl extends AbstractServiceImpl<Langue,LangueHistory, LangueCriteria, LangueHistoryCriteria, LangueDao,
LangueHistoryDao> implements LangueAdminService {


    public Langue findByReferenceEntity(Langue t){
        return  dao.findByLibelle(t.getLibelle());
    }


    public void configure() {
        super.configure(Langue.class,LangueHistory.class, LangueHistoryCriteria.class, LangueSpecification.class);
    }

    public LangueAdminServiceImpl(LangueDao dao, LangueHistoryDao historyDao) {
        super(dao, historyDao);
    }

}