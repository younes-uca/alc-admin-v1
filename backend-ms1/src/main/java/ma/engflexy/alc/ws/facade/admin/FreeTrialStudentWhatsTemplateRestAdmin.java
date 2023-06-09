package  ma.engflexy.alc.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.engflexy.alc.bean.core.FreeTrialStudentWhatsTemplate;
import ma.engflexy.alc.bean.history.FreeTrialStudentWhatsTemplateHistory;
import ma.engflexy.alc.dao.criteria.core.FreeTrialStudentWhatsTemplateCriteria;
import ma.engflexy.alc.dao.criteria.history.FreeTrialStudentWhatsTemplateHistoryCriteria;
import ma.engflexy.alc.service.facade.admin.FreeTrialStudentWhatsTemplateAdminService;
import ma.engflexy.alc.ws.converter.FreeTrialStudentWhatsTemplateConverter;
import ma.engflexy.alc.ws.dto.FreeTrialStudentWhatsTemplateDto;
import ma.engflexy.alc.zynerator.controller.AbstractController;
import ma.engflexy.alc.zynerator.dto.AuditEntityDto;
import ma.engflexy.alc.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import ma.engflexy.alc.zynerator.process.Result;

import org.springframework.web.multipart.MultipartFile;
import ma.engflexy.alc.zynerator.dto.FileTempDto;

@Api("Manages freeTrialStudentWhatsTemplate services")
@RestController
@RequestMapping("/api/admin/freeTrialStudentWhatsTemplate/")
public class FreeTrialStudentWhatsTemplateRestAdmin  extends AbstractController<FreeTrialStudentWhatsTemplate, FreeTrialStudentWhatsTemplateDto, FreeTrialStudentWhatsTemplateHistory, FreeTrialStudentWhatsTemplateCriteria, FreeTrialStudentWhatsTemplateHistoryCriteria, FreeTrialStudentWhatsTemplateAdminService, FreeTrialStudentWhatsTemplateConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all freeTrialStudentWhatsTemplates")
    @GetMapping("")
    public ResponseEntity<List<FreeTrialStudentWhatsTemplateDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  freeTrialStudentWhatsTemplate")
    @PutMapping("")
    public ResponseEntity<FreeTrialStudentWhatsTemplateDto> update(@RequestBody FreeTrialStudentWhatsTemplateDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a freeTrialStudentWhatsTemplate by id")
    @GetMapping("id/{id}")
    public ResponseEntity<FreeTrialStudentWhatsTemplateDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  freeTrialStudentWhatsTemplate")
    @PostMapping("")
    public ResponseEntity<FreeTrialStudentWhatsTemplateDto> save(@RequestBody FreeTrialStudentWhatsTemplateDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of freeTrialStudentWhatsTemplate")
    @PostMapping("multiple")
    public ResponseEntity<List<FreeTrialStudentWhatsTemplateDto>> delete(@RequestBody List<FreeTrialStudentWhatsTemplateDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified freeTrialStudentWhatsTemplate")
    @DeleteMapping("")
    public ResponseEntity<FreeTrialStudentWhatsTemplateDto> delete(@RequestBody FreeTrialStudentWhatsTemplateDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified freeTrialStudentWhatsTemplate")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple freeTrialStudentWhatsTemplates by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }
    @ApiOperation("Finds freeTrialStudentWhatsTemplates by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<FreeTrialStudentWhatsTemplateDto>> findByCriteria(@RequestBody FreeTrialStudentWhatsTemplateCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated freeTrialStudentWhatsTemplates by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody FreeTrialStudentWhatsTemplateCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports freeTrialStudentWhatsTemplates by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody FreeTrialStudentWhatsTemplateCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets freeTrialStudentWhatsTemplate data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody FreeTrialStudentWhatsTemplateCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets freeTrialStudentWhatsTemplate history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets freeTrialStudentWhatsTemplate paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody FreeTrialStudentWhatsTemplateHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports freeTrialStudentWhatsTemplate history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody FreeTrialStudentWhatsTemplateHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets freeTrialStudentWhatsTemplate history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody FreeTrialStudentWhatsTemplateHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public FreeTrialStudentWhatsTemplateRestAdmin (FreeTrialStudentWhatsTemplateAdminService service, FreeTrialStudentWhatsTemplateConverter converter) {
        super(service, converter);
    }


}