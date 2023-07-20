package kz.bitlab.danikKolesaProject.api;

import kz.bitlab.danikKolesaProject.dto.DealDTO;
import kz.bitlab.danikKolesaProject.services.DealService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/deals")
@RequiredArgsConstructor
public class DealRestController {
    private final DealService dealsService;

    @GetMapping
    public List<DealDTO> dealsDTOList(
            @RequestParam (required = false) String searchQuery
    ){
        if (searchQuery != null){
            return dealsService.getSearchedDeals(searchQuery);
        }
        return dealsService.getDeals();
    }

    @GetMapping(value = "/check")
    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    public List<DealDTO> dealsCheckDTOList(){
        return dealsService.getDealsForCheck();
    }

    @GetMapping(value = "/my-deals")
    @PreAuthorize("isAuthenticated()")
    public List<DealDTO> myDealsList(){
        return dealsService.myDeals();
    }

    @GetMapping(value = "{id}")
    public DealDTO getDeal(
            @PathVariable(name = "id") Long id
    ){
        return dealsService.getDeal(id);
    }

    @PostMapping
    @PreAuthorize("isAuthenticated()")
    public DealDTO addDeal(@RequestBody DealDTO dealsDTO) {
        return dealsService.addDeal(dealsDTO);
    }

    @PutMapping
    @PreAuthorize("isAuthenticated()")
    public DealDTO updateDeal(@RequestBody DealDTO dealsDTO){
        return dealsService.updateDeal(dealsDTO);
    }

    @PutMapping(value = "/update-active")
    @PreAuthorize("isAuthenticated()")
    public DealDTO updateDealIsActive(@RequestBody DealDTO dealsDTO){
        return dealsService.updateDealIsActive(dealsDTO);
    }

    @DeleteMapping(value = "{id}")
    @PreAuthorize("isAuthenticated()")
    public void deleteDeal(
            @PathVariable(name = "id") Long id
    ){
        dealsService.deleteDeal(id);
    }
}
