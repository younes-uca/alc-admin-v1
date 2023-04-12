package  ma.engflexy.alc.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.engflexy.alc.bean.core.Parcours;

import ma.engflexy.alc.zynerator.util.StringUtil;
import ma.engflexy.alc.zynerator.converter.AbstractConverter;
import ma.engflexy.alc.zynerator.util.DateUtil;
import ma.engflexy.alc.bean.history.LevelTestConfigurationHistory;
import ma.engflexy.alc.bean.core.LevelTestConfiguration;
import ma.engflexy.alc.ws.dto.LevelTestConfigurationDto;

@Component
public class LevelTestConfigurationConverter extends AbstractConverter<LevelTestConfiguration, LevelTestConfigurationDto, LevelTestConfigurationHistory> {

    @Autowired
    private ParcoursConverter parcoursConverter ;
    private boolean parcours;

    public  LevelTestConfigurationConverter(){
        super(LevelTestConfiguration.class, LevelTestConfigurationDto.class, LevelTestConfigurationHistory.class);
    }

    @Override
    public LevelTestConfiguration toItem(LevelTestConfigurationDto dto) {
        if (dto == null) {
            return null;
        } else {
        LevelTestConfiguration item = new LevelTestConfiguration();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getNoteMin()))
                item.setNoteMin(dto.getNoteMin());
            if(StringUtil.isNotEmpty(dto.getNoteMax()))
                item.setNoteMax(dto.getNoteMax());
            if(dto.getParcours() != null && dto.getParcours().getId() != null){
                item.setParcours(new Parcours());
                item.getParcours().setId(dto.getParcours().getId());
            }



        return item;
        }
    }

    @Override
    public LevelTestConfigurationDto toDto(LevelTestConfiguration item) {
        if (item == null) {
            return null;
        } else {
            LevelTestConfigurationDto dto = new LevelTestConfigurationDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getNoteMin()))
                dto.setNoteMin(item.getNoteMin());
            if(StringUtil.isNotEmpty(item.getNoteMax()))
                dto.setNoteMax(item.getNoteMax());
        if(this.parcours && item.getParcours()!=null) {
            dto.setParcours(parcoursConverter.toDto(item.getParcours())) ;
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.parcours = value;
    }


    public ParcoursConverter getParcoursConverter(){
        return this.parcoursConverter;
    }
    public void setParcoursConverter(ParcoursConverter parcoursConverter ){
        this.parcoursConverter = parcoursConverter;
    }
    public boolean  isParcours(){
        return this.parcours;
    }
    public void  setParcours(boolean parcours){
        this.parcours = parcours;
    }
}
