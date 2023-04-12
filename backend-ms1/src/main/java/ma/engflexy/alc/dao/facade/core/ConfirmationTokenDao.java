package ma.engflexy.alc.dao.facade.core;


import ma.engflexy.alc.zynerator.repository.AbstractRepository;
import ma.engflexy.alc.bean.core.ConfirmationToken;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface ConfirmationTokenDao extends AbstractRepository<ConfirmationToken,Long>  {

    List<ConfirmationToken> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);

}
