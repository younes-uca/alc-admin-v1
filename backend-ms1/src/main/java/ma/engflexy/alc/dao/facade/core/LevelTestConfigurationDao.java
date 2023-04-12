package ma.engflexy.alc.dao.facade.core;


import ma.engflexy.alc.zynerator.repository.AbstractRepository;
import ma.engflexy.alc.bean.core.LevelTestConfiguration;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface LevelTestConfigurationDao extends AbstractRepository<LevelTestConfiguration,Long>  {

    List<LevelTestConfiguration> findByParcoursId(Long id);
    int deleteByParcoursId(Long id);

}
