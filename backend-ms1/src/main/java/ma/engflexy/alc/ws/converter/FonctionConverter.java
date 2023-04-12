package  ma.engflexy.alc.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.engflexy.alc.zynerator.util.StringUtil;
import ma.engflexy.alc.zynerator.converter.AbstractConverter;
import ma.engflexy.alc.zynerator.util.DateUtil;
import ma.engflexy.alc.bean.history.FonctionHistory;
import ma.engflexy.alc.bean.core.Fonction;
import ma.engflexy.alc.ws.dto.FonctionDto;

@Component
public class FonctionConverter extends AbstractConverter<Fonction, FonctionDto, FonctionHistory> {


    public  FonctionConverter(){
        super(Fonction.class, FonctionDto.class, FonctionHistory.class);
    }

    @Override
    public Fonction toItem(FonctionDto dto) {
        if (dto == null) {
            return null;
        } else {
        Fonction item = new Fonction();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());


        return item;
        }
    }

    @Override
    public FonctionDto toDto(Fonction item) {
        if (item == null) {
            return null;
        } else {
            FonctionDto dto = new FonctionDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());


        return dto;
        }
    }


    public void initObject(boolean value) {
    }


}
