package com.r2s.mobilestore.data.dto.oder;

import com.r2s.mobilestore.data.dto.*;
import com.r2s.mobilestore.data.dto.product.ProductOrderDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderCreationDTO {

    private long idUser;
    private long idPromotion;
    private String paymentMethodDTO;
    private StatusDTO statusDTO;
    List<ProductOrderDTO> orderProductDTOList;
    private long idAddress;
    private Date receiveDate;
}
