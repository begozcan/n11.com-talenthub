package com.frankmoley.landon.web.service;

import com.frankmoley.landon.business.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class ReservationServiceController {

    @Autowired
    private ProductService productService;

    /*@RequestMapping(method= RequestMethod.GET, value="/reservations/{date}")
    public List<Shopping> getAllReservationsForDate(@PathVariable(value="date")String dateString){
        return this.productService.getRoomReservationsForDate(dateString);
    }*/
}
