package ma.engflexy.alc.dao.facade.core;


import ma.engflexy.alc.zynerator.repository.AbstractRepository;
import ma.engflexy.alc.bean.core.Price;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface PriceDao extends AbstractRepository<Price,Long>  {


}
