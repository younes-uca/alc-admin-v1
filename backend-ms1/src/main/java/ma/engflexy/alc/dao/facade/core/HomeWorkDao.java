package ma.engflexy.alc.dao.facade.core;


import ma.engflexy.alc.zynerator.repository.AbstractRepository;
import ma.engflexy.alc.bean.core.HomeWork;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface HomeWorkDao extends AbstractRepository<HomeWork,Long>  {

    List<HomeWork> findByCoursId(Long id);
    int deleteByCoursId(Long id);
    List<HomeWork> findByTypeHomeWorkId(Long id);
    int deleteByTypeHomeWorkId(Long id);

}
