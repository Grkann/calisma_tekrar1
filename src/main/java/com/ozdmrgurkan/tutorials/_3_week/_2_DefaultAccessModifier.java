package com.ozdmrgurkan.tutorials._3_week;

import com.ozdmrgurkan.tutorials._2_week._15_4_SpecialColor;

public class _2_DefaultAccessModifier {
    public static void main(String[] args) {
        _1_PublicAccessModifier accessModifier = new _1_PublicAccessModifier();
        System.out.println(_15_4_SpecialColor.BLUE + accessModifier.publicData + _15_4_SpecialColor.RESET);
        System.out.println(_15_4_SpecialColor.RED + accessModifier.protectedData + _15_4_SpecialColor.RESET);
        System.out.println(_15_4_SpecialColor.GREEN + accessModifier.defaultData + _15_4_SpecialColor.RESET);
       //  System.out.println(_15_4_SpecialColor.YELLOW + accessModifier.privateData + _15_4_SpecialColor.RESET);
    }



}
