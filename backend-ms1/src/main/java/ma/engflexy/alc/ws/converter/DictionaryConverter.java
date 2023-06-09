package  ma.engflexy.alc.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.engflexy.alc.bean.core.Etudiant;

import ma.engflexy.alc.zynerator.util.StringUtil;
import ma.engflexy.alc.zynerator.converter.AbstractConverter;
import ma.engflexy.alc.zynerator.util.DateUtil;
import ma.engflexy.alc.bean.history.DictionaryHistory;
import ma.engflexy.alc.bean.core.Dictionary;
import ma.engflexy.alc.ws.dto.DictionaryDto;

@Component
public class DictionaryConverter extends AbstractConverter<Dictionary, DictionaryDto, DictionaryHistory> {

    @Autowired
    private EtudiantConverter etudiantConverter ;
    private boolean etudiant;

    public  DictionaryConverter(){
        super(Dictionary.class, DictionaryDto.class, DictionaryHistory.class);
    }

    @Override
    public Dictionary toItem(DictionaryDto dto) {
        if (dto == null) {
            return null;
        } else {
        Dictionary item = new Dictionary();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getWord()))
                item.setWord(dto.getWord());
            if(StringUtil.isNotEmpty(dto.getDefinition()))
                item.setDefinition(dto.getDefinition());
            if(dto.getEtudiant() != null && dto.getEtudiant().getId() != null){
                item.setEtudiant(new Etudiant());
                item.getEtudiant().setId(dto.getEtudiant().getId());
            }



        return item;
        }
    }

    @Override
    public DictionaryDto toDto(Dictionary item) {
        if (item == null) {
            return null;
        } else {
            DictionaryDto dto = new DictionaryDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getWord()))
                dto.setWord(item.getWord());
            if(StringUtil.isNotEmpty(item.getDefinition()))
                dto.setDefinition(item.getDefinition());
        if(this.etudiant && item.getEtudiant()!=null) {
            dto.setEtudiant(etudiantConverter.toDto(item.getEtudiant())) ;
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.etudiant = value;
    }


    public EtudiantConverter getEtudiantConverter(){
        return this.etudiantConverter;
    }
    public void setEtudiantConverter(EtudiantConverter etudiantConverter ){
        this.etudiantConverter = etudiantConverter;
    }
    public boolean  isEtudiant(){
        return this.etudiant;
    }
    public void  setEtudiant(boolean etudiant){
        this.etudiant = etudiant;
    }
}
