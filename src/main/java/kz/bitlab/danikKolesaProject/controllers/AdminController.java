package kz.bitlab.danikKolesaProject.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequiredArgsConstructor
public class AdminController {
    @GetMapping(value = "/check-deal")
    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    public String checkDealPage(){
        return "check_deal_page";
    }

    @GetMapping(value = "/car-details-check/" + "{id}")
    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    public String checkDealDetails(
            @PathVariable(name = "id") Long id
    ){
        return "car_check_details";
    }
}
