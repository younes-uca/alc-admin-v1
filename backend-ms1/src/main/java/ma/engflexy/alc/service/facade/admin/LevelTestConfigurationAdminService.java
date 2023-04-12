package ma.engflexy.alc.service.facade.admin;

import java.util.List;
import ma.engflexy.alc.bean.core.LevelTestConfiguration;
import ma.engflexy.alc.dao.criteria.core.LevelTestConfigurationCriteria;
import ma.engflexy.alc.dao.criteria.history.LevelTestConfigurationHistoryCriteria;
import ma.engflexy.alc.zynerator.service.IService;

public interface LevelTestConfigurationAdminService extends  IService<LevelTestConfiguration,LevelTestConfigurationCriteria, LevelTestConfigurationHistoryCriteria>  {

    List<LevelTestConfiguration> findByParcoursId(Long id);
    int deleteByParcoursId(Long id);



}
