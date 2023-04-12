package ma.engflexy.alc.service.impl.admin;

import ma.engflexy.alc.bean.core.GroupeEtudiantDetail;
import ma.engflexy.alc.bean.history.GroupeEtudiantDetailHistory;
import ma.engflexy.alc.dao.criteria.core.GroupeEtudiantDetailCriteria;
import ma.engflexy.alc.dao.criteria.history.GroupeEtudiantDetailHistoryCriteria;
import ma.engflexy.alc.dao.facade.core.GroupeEtudiantDetailDao;
import ma.engflexy.alc.dao.facade.history.GroupeEtudiantDetailHistoryDao;
import ma.engflexy.alc.dao.specification.core.GroupeEtudiantDetailSpecification;
import ma.engflexy.alc.service.facade.admin.GroupeEtudiantDetailAdminService;
import ma.engflexy.alc.zynerator.service.AbstractServiceImpl;
import ma.engflexy.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.engflexy.alc.service.facade.admin.GroupeEtudiantAdminService ;
import ma.engflexy.alc.service.facade.admin.EtudiantAdminService ;


import java.util.List;
@Service
public class GroupeEtudiantDetailAdminServiceImpl extends AbstractServiceImpl<GroupeEtudiantDetail,GroupeEtudiantDetailHistory, GroupeEtudiantDetailCriteria, GroupeEtudiantDetailHistoryCriteria, GroupeEtudiantDetailDao,
GroupeEtudiantDetailHistoryDao> implements GroupeEtudiantDetailAdminService {



    public List<GroupeEtudiantDetail> findByGroupeEtudiantId(Long id){
        return dao.findByGroupeEtudiantId(id);
    }
    public int deleteByGroupeEtudiantId(Long id){
        return dao.deleteByGroupeEtudiantId(id);
    }
    public List<GroupeEtudiantDetail> findByEtudiantId(Long id){
        return dao.findByEtudiantId(id);
    }
    public int deleteByEtudiantId(Long id){
        return dao.deleteByEtudiantId(id);
    }

    public void configure() {
        super.configure(GroupeEtudiantDetail.class,GroupeEtudiantDetailHistory.class, GroupeEtudiantDetailHistoryCriteria.class, GroupeEtudiantDetailSpecification.class);
    }

    @Autowired
    private GroupeEtudiantAdminService groupeEtudiantService ;
    @Autowired
    private EtudiantAdminService etudiantService ;
    public GroupeEtudiantDetailAdminServiceImpl(GroupeEtudiantDetailDao dao, GroupeEtudiantDetailHistoryDao historyDao) {
        super(dao, historyDao);
    }

}