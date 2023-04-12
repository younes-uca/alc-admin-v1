package ma.engflexy.alc.service.impl.admin;

import ma.engflexy.alc.bean.core.GroupeEtude;
import ma.engflexy.alc.bean.history.GroupeEtudeHistory;
import ma.engflexy.alc.dao.criteria.core.GroupeEtudeCriteria;
import ma.engflexy.alc.dao.criteria.history.GroupeEtudeHistoryCriteria;
import ma.engflexy.alc.dao.facade.core.GroupeEtudeDao;
import ma.engflexy.alc.dao.facade.history.GroupeEtudeHistoryDao;
import ma.engflexy.alc.dao.specification.core.GroupeEtudeSpecification;
import ma.engflexy.alc.service.facade.admin.GroupeEtudeAdminService;
import ma.engflexy.alc.zynerator.service.AbstractServiceImpl;
import ma.engflexy.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class GroupeEtudeAdminServiceImpl extends AbstractServiceImpl<GroupeEtude,GroupeEtudeHistory, GroupeEtudeCriteria, GroupeEtudeHistoryCriteria, GroupeEtudeDao,
GroupeEtudeHistoryDao> implements GroupeEtudeAdminService {




    public void configure() {
        super.configure(GroupeEtude.class,GroupeEtudeHistory.class, GroupeEtudeHistoryCriteria.class, GroupeEtudeSpecification.class);
    }

    public GroupeEtudeAdminServiceImpl(GroupeEtudeDao dao, GroupeEtudeHistoryDao historyDao) {
        super(dao, historyDao);
    }

}