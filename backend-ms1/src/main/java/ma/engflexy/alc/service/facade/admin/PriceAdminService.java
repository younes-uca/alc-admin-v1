package ma.engflexy.alc.service.facade.admin;

import java.util.List;
import ma.engflexy.alc.bean.core.Price;
import ma.engflexy.alc.dao.criteria.core.PriceCriteria;
import ma.engflexy.alc.dao.criteria.history.PriceHistoryCriteria;
import ma.engflexy.alc.zynerator.service.IService;

public interface PriceAdminService extends  IService<Price,PriceCriteria, PriceHistoryCriteria>  {




}
