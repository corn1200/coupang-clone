package com.kimhs.apis.coupangclone.route;

import com.kimhs.apis.coupangclone.datamodel.dto.SaleDTO;
import com.kimhs.apis.coupangclone.service.SaleService;
import com.kimhs.apis.coupangclone.service.ShoppingBasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sale")
public class SaleRoute {
    private final SaleService saleService;

    @Autowired
    public SaleRoute(SaleService saleService) {
        this.saleService = saleService;
    }

    @GetMapping("")
    @ResponseBody
    public List<SaleDTO> getSales() {
        return null;
    }

    @GetMapping("/id/{sale_id}")
    @ResponseBody
    public SaleDTO getSaleById(@PathVariable(value = "sale_id") String saleId) {
        return null;
    }

    @GetMapping("/userId/{user_id}")
    @ResponseBody
    public List<SaleDTO> getSalesByUserId(@PathVariable(value = "user_id") String userId) {
        return null;
    }

    @PostMapping("/update/deposit")
    public void updateDepositStatus() {
    }

    @PostMapping("/update/delivery")
    public void updateDeliveryStatus() {
    }

    @PostMapping("/update/ExpectedArrivalDate")
    public void updateExpectedArrivalDate() {
    }

    @PostMapping("/update/ArrivalDate")
    public void updateArrivalDate() {
    }

    @PostMapping("/registry")
    public void registrySale() {
    }

    @DeleteMapping("/{sale_id}")
    public void deleteSale(@PathVariable(value = "sale_id") String saleId) {
    }

    @GetMapping("/initialize")
    public void initializeSales() {
    }
}
