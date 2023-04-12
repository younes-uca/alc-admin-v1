package ma.engflexy.alc.service.facade.admin;

import java.util.List;
import ma.engflexy.alc.bean.core.Services;
import ma.engflexy.alc.dao.criteria.core.ServicesCriteria;
import ma.engflexy.alc.dao.criteria.history.ServicesHistoryCriteria;
import ma.engflexy.alc.zynerator.service.IService;

public interface ServicesAdminService extends  IService<Services,ServicesCriteria, ServicesHistoryCriteria>  {

    Long getNextOrdre();



}
