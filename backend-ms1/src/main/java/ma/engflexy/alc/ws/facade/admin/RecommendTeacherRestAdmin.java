package  ma.engflexy.alc.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.engflexy.alc.bean.core.RecommendTeacher;
import ma.engflexy.alc.bean.history.RecommendTeacherHistory;
import ma.engflexy.alc.dao.criteria.core.RecommendTeacherCriteria;
import ma.engflexy.alc.dao.criteria.history.RecommendTeacherHistoryCriteria;
import ma.engflexy.alc.service.facade.admin.RecommendTeacherAdminService;
import ma.engflexy.alc.ws.converter.RecommendTeacherConverter;
import ma.engflexy.alc.ws.dto.RecommendTeacherDto;
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

@Api("Manages recommendTeacher services")
@RestController
@RequestMapping("/api/admin/recommendTeacher/")
public class RecommendTeacherRestAdmin  extends AbstractController<RecommendTeacher, RecommendTeacherDto, RecommendTeacherHistory, RecommendTeacherCriteria, RecommendTeacherHistoryCriteria, RecommendTeacherAdminService, RecommendTeacherConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all recommendTeachers")
    @GetMapping("")
    public ResponseEntity<List<RecommendTeacherDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  recommendTeacher")
    @PutMapping("")
    public ResponseEntity<RecommendTeacherDto> update(@RequestBody RecommendTeacherDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a recommendTeacher by id")
    @GetMapping("id/{id}")
    public ResponseEntity<RecommendTeacherDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  recommendTeacher")
    @PostMapping("")
    public ResponseEntity<RecommendTeacherDto> save(@RequestBody RecommendTeacherDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of recommendTeacher")
    @PostMapping("multiple")
    public ResponseEntity<List<RecommendTeacherDto>> delete(@RequestBody List<RecommendTeacherDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified recommendTeacher")
    @DeleteMapping("")
    public ResponseEntity<RecommendTeacherDto> delete(@RequestBody RecommendTeacherDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified recommendTeacher")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple recommendTeachers by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }
    @ApiOperation("find by prof id")
    @GetMapping("prof/id/{id}")
    public List<RecommendTeacher> findByProfId(@PathVariable Long id){
        return service.findByProfId(id);
    }
    @ApiOperation("delete by prof id")
    @DeleteMapping("prof/id/{id}")
    public int deleteByProfId(@PathVariable Long id){
        return service.deleteByProfId(id);
    }
    @ApiOperation("Finds recommendTeachers by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<RecommendTeacherDto>> findByCriteria(@RequestBody RecommendTeacherCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated recommendTeachers by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody RecommendTeacherCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports recommendTeachers by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody RecommendTeacherCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets recommendTeacher data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody RecommendTeacherCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets recommendTeacher history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets recommendTeacher paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody RecommendTeacherHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports recommendTeacher history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody RecommendTeacherHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets recommendTeacher history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody RecommendTeacherHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public RecommendTeacherRestAdmin (RecommendTeacherAdminService service, RecommendTeacherConverter converter) {
        super(service, converter);
    }


}