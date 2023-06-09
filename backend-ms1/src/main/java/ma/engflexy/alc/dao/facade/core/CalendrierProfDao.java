package ma.engflexy.alc.dao.facade.core;


import ma.engflexy.alc.zynerator.repository.AbstractRepository;
import ma.engflexy.alc.bean.core.CalendrierProf;
import org.springframework.stereotype.Repository;
import ma.engflexy.alc.bean.core.CalendrierProf;
import java.util.List;


@Repository
public interface CalendrierProfDao extends AbstractRepository<CalendrierProf,Long>  {
    CalendrierProf findByRef(String ref);
    int deleteByRef(String ref);

    List<CalendrierProf> findByProfId(Long id);
    int deleteByProfId(Long id);
    List<CalendrierProf> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);

}
