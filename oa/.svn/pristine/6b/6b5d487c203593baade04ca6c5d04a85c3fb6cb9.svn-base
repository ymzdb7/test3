package com.myoa.controller.officeSupplies;

import com.myoa.dao.officesupplies.OfficeDepositoryMapper;
import com.myoa.model.officesupplies.OfficeDepositoryWithBLOBs;
import com.myoa.model.officesupplies.OfficeProductsWithBLOBs;
import com.myoa.model.officesupplies.OfficeType;
import com.myoa.service.officesupplies.OfficeProductService;
import com.myoa.service.officesupplies.OfficeTypeService;
import com.myoa.util.ToJson;

import java.util.Map;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping({ "/officeSupplies" })
public class OfficeSuppliesController {

	@Resource
	private OfficeProductService officeProductService;

	@Resource
	private OfficeTypeService officeTypeService;

	@Resource
	private OfficeDepositoryMapper officeDepositoryMapper;

	@RequestMapping({ "/info" })
	public String info(HttpServletRequest request) {
		return "app/officeSupplies/infoQuery";
	}

	@RequestMapping({ "/infoManage" })
	public String manage(HttpServletRequest request) {
		return "app/officeSupplies/infoManage";
	}

	@RequestMapping({ "/librarySet" })
	public String librarySet(HttpServletRequest request) {
		return "app/officeSupplies/librarySet";
	}

	@RequestMapping({ "/goOfficeList" })
	public String goOfficeList(String typeId, Map<String, Object> map) {
		map.put("typeId", typeId);
		return "app/officeSupplies/Information/index";
	}

	@RequestMapping({ "/goInfomationHome" })
	public String goInfomationHome() {
		return "app/officeSupplies/Information/fileHome";
	}

	@RequestMapping({ "/goOfficeQuery" })
	public String goOfficeList() {
		return "app/officeSupplies/Information/query";
	}

	@RequestMapping({ "/goimport" })
	public String goimport() {
		return "app/officeSupplies/Information/import";
	}

	@RequestMapping({ "/newProduct" })
	public String goNewProduct(String editFlag, int proId,
			Map<String, Object> map) {
		map.put("editFlag", editFlag);
		map.put("proId", Integer.valueOf(proId));
		return "app/officeSupplies/Information/newProduct";
	}

	@RequestMapping({ "/goProductApply" })
	public String goProductApply() {
		return "app/officeSupplies/product/fileHome";
	}

	@RequestMapping({ "/goOfficeTypeList" })
	public String goOfficeTypeList(String typeDepository,
			Map<String, Object> map) {
		map.put("typeDepository", typeDepository);
		return "app/officeSupplies/offType/index";
	}

	@RequestMapping({ "/addOfficeProducts" })
	@ResponseBody
	public ToJson<Object> addOfficeProducts(
			OfficeProductsWithBLOBs officeProductsWithBLOBs) {
		return this.officeProductService
				.addOfficeProducts(officeProductsWithBLOBs);
	}

	@RequestMapping({ "/editOfficeProducts" })
	@ResponseBody
	public ToJson<Object> editOfficeProducts(
			OfficeProductsWithBLOBs officeProductsWithBLOBs) {
		return this.officeProductService
				.editOfficeProducts(officeProductsWithBLOBs);
	}

	@RequestMapping({ "/getOfficeProductById" })
	@ResponseBody
	public ToJson<OfficeProductsWithBLOBs> getOfficeProductById(Integer proId) {
		return this.officeProductService.getOfficeProductById(proId);
	}

	@RequestMapping({ "/deleteOfficeProductById" })
	@ResponseBody
	public ToJson<Object> deleteOfficeProductById(Integer proId) {
		return this.officeProductService.deleteOfficeProductById(proId);
	}

	@RequestMapping({ "/deleteOfficeProducts" })
	@ResponseBody
	public ToJson<Object> deleteOfficeProducts(String[] proIds) {
		return this.officeProductService.deleteOfficeProducts(proIds);
	}

	@RequestMapping({ "/selectOfficeProducts" })
	@ResponseBody
	public ToJson<OfficeProductsWithBLOBs> selectOfficeProducts(
			HttpServletRequest request, HttpServletResponse response,
			String id, String typeId, String proId, String export) {
		return this.officeProductService.selectOfficeProducts(request,
				response, id, typeId, proId, export);
	}

	@ResponseBody
	@RequestMapping({ "/importOfficeProducts" })
	public ToJson<Object> importOfficeProducts(MultipartFile file,
			HttpServletRequest request, HttpServletResponse response,
			HttpSession session) {
		return this.officeProductService.importOfficeProducts(file, request,
				response, session);
	}

	@RequestMapping({ "/editOfficeType" })
	@ResponseBody
	public ToJson<Object> editOfficeType(OfficeType OfficeType) {
		return this.officeTypeService.editOfficeType(OfficeType);
	}

	@RequestMapping({ "/deleteOfficeTypeById" })
	@ResponseBody
	public ToJson<Object> deleteOfficeTypeById(Integer id) {
		return this.officeTypeService.deleteOfficeTypeById(id);
	}

	@ResponseBody
	@RequestMapping({ "/selDepositoryByDept" })
	public ToJson<OfficeDepositoryWithBLOBs> selDepositoryByDept(
			HttpServletRequest request) {
		return this.officeProductService.selDepositoryByDept(request);
	}

	@ResponseBody
	@RequestMapping({ "/selProductByType" })
	public ToJson<OfficeProductsWithBLOBs> selProductByType(String typeId) {
		return this.officeProductService.selProductByType(typeId);
	}

	@ResponseBody
	@RequestMapping({ "/addOffType" })
	public ToJson<Object> addOffType(OfficeType officeType) {
		return this.officeTypeService.addOfficeType(officeType);
	}

	@ResponseBody
	@RequestMapping({ "/selectAllOffType" })
	public ToJson<OfficeType> selectAllOffType(HttpServletRequest request,
			String typeDepository) {
		return this.officeTypeService.selectAllOffType(request, typeDepository);
	}

	@ResponseBody
	@RequestMapping({ "/getOfficeTypeById" })
	public ToJson<OfficeType> getOfficeTypeById(Integer id) {
		return this.officeTypeService.getOfficeTypeById(id);
	}

	@ResponseBody
	@RequestMapping({ "/getInfo" })
	public ToJson<OfficeProductsWithBLOBs> getInfo(HttpServletRequest request) {
		return this.officeProductService.getInfo(request);
	}
}
