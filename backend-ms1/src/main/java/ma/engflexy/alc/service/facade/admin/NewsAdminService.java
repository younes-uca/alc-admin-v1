package ma.engflexy.alc.service.facade.admin;

import java.util.List;
import ma.engflexy.alc.bean.core.News;
import ma.engflexy.alc.dao.criteria.core.NewsCriteria;
import ma.engflexy.alc.dao.criteria.history.NewsHistoryCriteria;
import ma.engflexy.alc.zynerator.service.IService;

public interface NewsAdminService extends  IService<News,NewsCriteria, NewsHistoryCriteria>  {




}
