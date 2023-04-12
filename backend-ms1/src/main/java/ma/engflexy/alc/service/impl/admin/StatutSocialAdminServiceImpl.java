package ma.engflexy.alc.service.impl.admin;

import ma.engflexy.alc.bean.core.StatutSocial;
import ma.engflexy.alc.bean.history.StatutSocialHistory;
import ma.engflexy.alc.dao.criteria.core.StatutSocialCriteria;
import ma.engflexy.alc.dao.criteria.history.StatutSocialHistoryCriteria;
import ma.engflexy.alc.dao.facade.core.StatutSocialDao;
import ma.engflexy.alc.dao.facade.history.StatutSocialHistoryDao;
import ma.engflexy.alc.dao.specification.core.StatutSocialSpecification;
import ma.engflexy.alc.service.facade.admin.StatutSocialAdminService;
import ma.engflexy.alc.zynerator.service.AbstractServiceImpl;
import ma.engflexy.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class StatutSocialAdminServiceImpl extends AbstractServiceImpl<StatutSocial,StatutSocialHistory, StatutSocialCriteria, StatutSocialHistoryCriteria, StatutSocialDao,
StatutSocialHistoryDao> implements StatutSocialAdminService {


    public StatutSocial findByReferenceEntity(StatutSocial t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(StatutSocial.class,StatutSocialHistory.class, StatutSocialHistoryCriteria.class, StatutSocialSpecification.class);
    }

    public StatutSocialAdminServiceImpl(StatutSocialDao dao, StatutSocialHistoryDao historyDao) {
        super(dao, historyDao);
    }

}