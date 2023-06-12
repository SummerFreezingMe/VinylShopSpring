package com.example.vinylshopspring.service.impl;

import com.example.vinylshopspring.service.OrderService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    public Double getTotalOrderPrice() {
        double sum = 0D;
      //  List<Integer> orderProducts = getVinylsId();
      //  for (Integer id :orderProducts) {
            //todo : we either store IDs or vinyls
      //  }
        return sum;
    }

  //  public int getNumberOfProducts() {
    //    return this.vinylsId.size();
   // }
}
