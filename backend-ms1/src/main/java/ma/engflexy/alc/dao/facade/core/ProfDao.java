package ma.engflexy.alc.dao.facade.core;


import ma.engflexy.alc.zynerator.repository.AbstractRepository;
import ma.engflexy.alc.bean.core.Prof;
import org.springframework.stereotype.Repository;
import ma.engflexy.alc.bean.core.Prof;
import java.util.List;


@Repository
public interface ProfDao extends AbstractRepository<Prof,Long>  {
    Prof findByRef(String ref);
    int deleteByRef(String ref);

    List<Prof> findByParcoursId(Long id);
    int deleteByParcoursId(Long id);
    List<Prof> findByCategorieProfId(Long id);
    int deleteByCategorieProfId(Long id);
    List<Prof> findByTypeTeacherId(Long id);
    int deleteByTypeTeacherId(Long id);
    Prof findByUsername(String username);

}
