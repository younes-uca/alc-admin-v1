package ma.engflexy.alc.service.impl.admin;

import ma.engflexy.alc.bean.core.TeacherLocality;
import ma.engflexy.alc.bean.history.TeacherLocalityHistory;
import ma.engflexy.alc.dao.criteria.core.TeacherLocalityCriteria;
import ma.engflexy.alc.dao.criteria.history.TeacherLocalityHistoryCriteria;
import ma.engflexy.alc.dao.facade.core.TeacherLocalityDao;
import ma.engflexy.alc.dao.facade.history.TeacherLocalityHistoryDao;
import ma.engflexy.alc.dao.specification.core.TeacherLocalitySpecification;
import ma.engflexy.alc.service.facade.admin.TeacherLocalityAdminService;
import ma.engflexy.alc.zynerator.service.AbstractServiceImpl;
import ma.engflexy.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class TeacherLocalityAdminServiceImpl extends AbstractServiceImpl<TeacherLocality,TeacherLocalityHistory, TeacherLocalityCriteria, TeacherLocalityHistoryCriteria, TeacherLocalityDao,
TeacherLocalityHistoryDao> implements TeacherLocalityAdminService {

    public Long getNextOrdre() {
        Long max = dao.findMaxOrdreByEtablissementIdOrder(getEtablissementId());
        return max != null ? max + 1 : 1;
    }

    public TeacherLocality findByReferenceEntity(TeacherLocality t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(TeacherLocality.class,TeacherLocalityHistory.class, TeacherLocalityHistoryCriteria.class, TeacherLocalitySpecification.class);
    }

    public TeacherLocalityAdminServiceImpl(TeacherLocalityDao dao, TeacherLocalityHistoryDao historyDao) {
        super(dao, historyDao);
    }

}