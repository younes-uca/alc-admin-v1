package ma.engflexy.alc.service.facade.admin;

import java.util.List;
import ma.engflexy.alc.bean.core.HoweWorkQSTReponse;
import ma.engflexy.alc.dao.criteria.core.HoweWorkQSTReponseCriteria;
import ma.engflexy.alc.dao.criteria.history.HoweWorkQSTReponseHistoryCriteria;
import ma.engflexy.alc.zynerator.service.IService;

public interface HoweWorkQSTReponseAdminService extends  IService<HoweWorkQSTReponse,HoweWorkQSTReponseCriteria, HoweWorkQSTReponseHistoryCriteria>  {

    List<HoweWorkQSTReponse> findByEtatReponseId(Long id);
    int deleteByEtatReponseId(Long id);
    List<HoweWorkQSTReponse> findByHomeWorkQuestionId(Long id);
    int deleteByHomeWorkQuestionId(Long id);



}
