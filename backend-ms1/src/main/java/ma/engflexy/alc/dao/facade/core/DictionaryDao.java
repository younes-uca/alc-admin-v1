package ma.engflexy.alc.dao.facade.core;


import ma.engflexy.alc.zynerator.repository.AbstractRepository;
import ma.engflexy.alc.bean.core.Dictionary;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface DictionaryDao extends AbstractRepository<Dictionary,Long>  {

    List<Dictionary> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);

}
