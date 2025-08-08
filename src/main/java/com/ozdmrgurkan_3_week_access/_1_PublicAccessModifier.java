package com.ozdmrgurkan_3_week_access;

import com.ozdmrgurkan._2_week._15_4_SpecialColor;

public class _1_PublicAccessModifier {

    public String publicData = "publicData";
    private String privateData = "privateData";
    protected String protectedData = "protectedData";
     String defaultData = "defaultData";



     public static void main(String[] args) {
        _1_PublicAccessModifier accessModifier = new _1_PublicAccessModifier();
         System.out.println(_15_4_SpecialColor.BLUE + accessModifier.publicData + _15_4_SpecialColor.RESET);
         System.out.println(_15_4_SpecialColor.YELLOW + accessModifier.privateData + _15_4_SpecialColor.RESET);
         System.out.println(_15_4_SpecialColor.RED + accessModifier.protectedData + _15_4_SpecialColor.RESET);
         System.out.println(_15_4_SpecialColor.GREEN + accessModifier.defaultData + _15_4_SpecialColor.RESET);
    }
}


