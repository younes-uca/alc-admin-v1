package ma.engflexy.alc.dao.facade.core;


import ma.engflexy.alc.zynerator.repository.AbstractRepository;
import ma.engflexy.alc.bean.core.News;
import org.springframework.stereotype.Repository;
import ma.engflexy.alc.bean.core.News;
import java.util.List;


@Repository
public interface NewsDao extends AbstractRepository<News,Long>  {
    News findByRef(String ref);
    int deleteByRef(String ref);


}
