package ma.engflexy.alc.service.impl.admin;

import ma.engflexy.alc.bean.core.ConfirmationToken;
import ma.engflexy.alc.bean.history.ConfirmationTokenHistory;
import ma.engflexy.alc.dao.criteria.core.ConfirmationTokenCriteria;
import ma.engflexy.alc.dao.criteria.history.ConfirmationTokenHistoryCriteria;
import ma.engflexy.alc.dao.facade.core.ConfirmationTokenDao;
import ma.engflexy.alc.dao.facade.history.ConfirmationTokenHistoryDao;
import ma.engflexy.alc.dao.specification.core.ConfirmationTokenSpecification;
import ma.engflexy.alc.service.facade.admin.ConfirmationTokenAdminService;
import ma.engflexy.alc.zynerator.service.AbstractServiceImpl;
import ma.engflexy.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.engflexy.alc.service.facade.admin.EtudiantAdminService ;


import java.util.List;
@Service
public class ConfirmationTokenAdminServiceImpl extends AbstractServiceImpl<ConfirmationToken,ConfirmationTokenHistory, ConfirmationTokenCriteria, ConfirmationTokenHistoryCriteria, ConfirmationTokenDao,
ConfirmationTokenHistoryDao> implements ConfirmationTokenAdminService {



    public List<ConfirmationToken> findByEtudiantId(Long id){
        return dao.findByEtudiantId(id);
    }
    public int deleteByEtudiantId(Long id){
        return dao.deleteByEtudiantId(id);
    }

    public void configure() {
        super.configure(ConfirmationToken.class,ConfirmationTokenHistory.class, ConfirmationTokenHistoryCriteria.class, ConfirmationTokenSpecification.class);
    }

    @Autowired
    private EtudiantAdminService etudiantService ;
    public ConfirmationTokenAdminServiceImpl(ConfirmationTokenDao dao, ConfirmationTokenHistoryDao historyDao) {
        super(dao, historyDao);
    }

}