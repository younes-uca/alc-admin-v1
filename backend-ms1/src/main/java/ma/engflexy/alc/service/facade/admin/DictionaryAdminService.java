package ma.engflexy.alc.service.facade.admin;

import java.util.List;
import ma.engflexy.alc.bean.core.Dictionary;
import ma.engflexy.alc.dao.criteria.core.DictionaryCriteria;
import ma.engflexy.alc.dao.criteria.history.DictionaryHistoryCriteria;
import ma.engflexy.alc.zynerator.service.IService;

public interface DictionaryAdminService extends  IService<Dictionary,DictionaryCriteria, DictionaryHistoryCriteria>  {

    List<Dictionary> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);



}
