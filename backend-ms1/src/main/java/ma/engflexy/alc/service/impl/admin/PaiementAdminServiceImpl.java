package ma.engflexy.alc.service.impl.admin;

import ma.engflexy.alc.bean.core.Paiement;
import ma.engflexy.alc.bean.history.PaiementHistory;
import ma.engflexy.alc.dao.criteria.core.PaiementCriteria;
import ma.engflexy.alc.dao.criteria.history.PaiementHistoryCriteria;
import ma.engflexy.alc.dao.facade.core.PaiementDao;
import ma.engflexy.alc.dao.facade.history.PaiementHistoryDao;
import ma.engflexy.alc.dao.specification.core.PaiementSpecification;
import ma.engflexy.alc.service.facade.admin.PaiementAdminService;
import ma.engflexy.alc.zynerator.service.AbstractServiceImpl;
import ma.engflexy.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.engflexy.alc.service.facade.admin.GroupeEtudiantAdminService ;
import ma.engflexy.alc.service.facade.admin.ProfAdminService ;


import java.util.List;
@Service
public class PaiementAdminServiceImpl extends AbstractServiceImpl<Paiement,PaiementHistory, PaiementCriteria, PaiementHistoryCriteria, PaiementDao,
PaiementHistoryDao> implements PaiementAdminService {



    public List<Paiement> findByProfId(Long id){
        return dao.findByProfId(id);
    }
    public int deleteByProfId(Long id){
        return dao.deleteByProfId(id);
    }
    public List<Paiement> findByGroupeEtudiantId(Long id){
        return dao.findByGroupeEtudiantId(id);
    }
    public int deleteByGroupeEtudiantId(Long id){
        return dao.deleteByGroupeEtudiantId(id);
    }

    public void configure() {
        super.configure(Paiement.class,PaiementHistory.class, PaiementHistoryCriteria.class, PaiementSpecification.class);
    }

    @Autowired
    private GroupeEtudiantAdminService groupeEtudiantService ;
    @Autowired
    private ProfAdminService profService ;
    public PaiementAdminServiceImpl(PaiementDao dao, PaiementHistoryDao historyDao) {
        super(dao, historyDao);
    }

}