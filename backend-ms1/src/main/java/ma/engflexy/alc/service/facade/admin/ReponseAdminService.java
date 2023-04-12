package ma.engflexy.alc.service.facade.admin;

import java.util.List;
import ma.engflexy.alc.bean.core.Reponse;
import ma.engflexy.alc.dao.criteria.core.ReponseCriteria;
import ma.engflexy.alc.dao.criteria.history.ReponseHistoryCriteria;
import ma.engflexy.alc.zynerator.service.IService;

public interface ReponseAdminService extends  IService<Reponse,ReponseCriteria, ReponseHistoryCriteria>  {

    List<Reponse> findByEtatReponseId(Long id);
    int deleteByEtatReponseId(Long id);
    List<Reponse> findByQuestionId(Long id);
    int deleteByQuestionId(Long id);



}
