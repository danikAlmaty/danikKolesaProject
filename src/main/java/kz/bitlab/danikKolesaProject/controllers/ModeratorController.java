package kz.bitlab.danikKolesaProject.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
@RequiredArgsConstructor
public class ModeratorController {
    @GetMapping(value = "/add-car-brand")
    @PreAuthorize("hasAnyRole('ROLE_MODERATOR')")
    public String addCarBrandPage(){
        return "add_car_brand_page";
    }

    @GetMapping(value = "/add-body-style")
    @PreAuthorize("hasAnyRole('ROLE_MODERATOR')")
    public String addBodyStylePage(){
        return "add_body_style_page";
    }

    @GetMapping(value = "/add-city")
    @PreAuthorize("hasAnyRole('ROLE_MODERATOR')")
    public String addCityPage(){
        return "add_city_page";
    }

    @GetMapping(value = "/add-drive-train")
    @PreAuthorize("hasAnyRole('ROLE_MODERATOR')")
    public String addDriveTrain(){
        return "add_drive_train_page";
    }

    @GetMapping(value = "/add-transmission")
    @PreAuthorize("hasAnyRole('ROLE_MODERATOR')")
    public String addTransmission(){
        return "add_transmission_page";
    }

    @GetMapping(value = "/user-management")
    @PreAuthorize("hasAnyRole('ROLE_MODERATOR')")
    public String userManagementPage(){
        return "user_management_page";
    }

    @GetMapping(value = "/user-details/" + "{id}")
    @PreAuthorize("hasAnyRole('ROLE_MODERATOR')")
    public String userDetailsPage(
            @PathVariable(name = "id") Long id
    ){
        return "user_management_details_page";
    }
}
