package kz.bitlab.danikKolesaProject;

import kz.bitlab.danikKolesaProject.dto.BodyStyleDTO;
import kz.bitlab.danikKolesaProject.dto.CarBrandDTO;
import kz.bitlab.danikKolesaProject.mapper.BodyStyleMapper;
import kz.bitlab.danikKolesaProject.mapper.CarBrandMapper;
import kz.bitlab.danikKolesaProject.model.BodyStyle;
import kz.bitlab.danikKolesaProject.model.CarBrand;
import kz.bitlab.danikKolesaProject.services.CarBrandService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DanikKolesaProjectApplicationTests {

	@Autowired
	private CarBrandMapper carBrandMapper;

	@Autowired
	private CarBrandService carBrandService;

	@Autowired
	private BodyStyleMapper bodyStyleMapper;


	@Test
	void checkCarBrandDTO(){
		CarBrand carBrand = new CarBrand();
		carBrand.setId(19L);
		carBrand.setName("Nissan");
		carBrand.setCountry("Japan");

		CarBrandDTO carBrandDTO = carBrandMapper.toDto(carBrand);

		Assertions.assertEquals(carBrand.getId(), carBrandDTO.getId());
		Assertions.assertEquals(carBrand.getName(), carBrandDTO.getName());
		Assertions.assertEquals(carBrand.getCountry(), carBrandDTO.getCountry());
	}

	@Test
	void checkBodyStyleDTO(){
		BodyStyle bodyStyle = new BodyStyle();
		bodyStyle.setId(12L);
		bodyStyle.setStyle("limousin");

		BodyStyleDTO bodyStyleDTO = bodyStyleMapper.toDto(bodyStyle);

		Assertions.assertEquals(bodyStyle.getId(), bodyStyleDTO.getId());
		Assertions.assertEquals(bodyStyle.getStyle(), bodyStyleDTO.getStyle());
	}

	@Test
	void checkInsertIntoDb(){
		CarBrand carBrand = new CarBrand();
		carBrand.setName("Nissan");
		carBrand.setCountry("Japan");

		CarBrandDTO newCarBrand = carBrandService.addCarBrand(carBrandMapper.toDto(carBrand));

		Assertions.assertNotNull(newCarBrand);
		Assertions.assertNotNull(newCarBrand.getId());
		Assertions.assertEquals(carBrand.getName(), newCarBrand.getName());
		Assertions.assertEquals(carBrand.getCountry(), newCarBrand.getCountry());

		carBrandService.deleteCarBrand(newCarBrand.getId());
	}

}
