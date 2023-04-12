package ma.engflexy.alc.service.facade.admin;

import java.util.List;
import ma.engflexy.alc.bean.core.Paiement;
import ma.engflexy.alc.dao.criteria.core.PaiementCriteria;
import ma.engflexy.alc.dao.criteria.history.PaiementHistoryCriteria;
import ma.engflexy.alc.zynerator.service.IService;

public interface PaiementAdminService extends  IService<Paiement,PaiementCriteria, PaiementHistoryCriteria>  {

    List<Paiement> findByProfId(Long id);
    int deleteByProfId(Long id);
    List<Paiement> findByGroupeEtudiantId(Long id);
    int deleteByGroupeEtudiantId(Long id);



}
