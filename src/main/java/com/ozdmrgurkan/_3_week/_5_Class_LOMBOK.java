package com.ozdmrgurkan._3_week;

import com.ozdmrgurkan._2_week._15_4_SpecialColor;
import lombok.*;
import java.util.Date;

@NoArgsConstructor //Parametresiz constructor
@AllArgsConstructor // Parametreli constructor
// @Data
@Getter
@Setter
@ToString
@Builder

public class _5_Class_LOMBOK {


    //Field
    private Long id;
    private String name;
    private String surname;
    private Date createdDate;

    public static void main(String[] args) {
        _5_Class_LOMBOK lombok = _5_Class_LOMBOK.builder()
                .id(1L)
                .name(_15_4_SpecialColor.CYAN+ "Gurkan" + _15_4_SpecialColor.RESET)
                .surname("Ozdemir")
                .createdDate(new Date())
                .build();
        System.out.println(lombok);

    }

}
