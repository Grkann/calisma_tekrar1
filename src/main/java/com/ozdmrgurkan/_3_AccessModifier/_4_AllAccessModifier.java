package com.ozdmrgurkan._3_AccessModifier;

import com.ozdmrgurkan._2_week._15_4_SpecialColor;
import com.ozdmrgurkan._3_week._1_PublicAccessModifier;

public class _4_AllAccessModifier {
    public static void main(String[] args) {
        _1_PublicAccessModifier accessModifier = new _1_PublicAccessModifier();
        System.out.println(_15_4_SpecialColor.BLUE + accessModifier.publicData + _15_4_SpecialColor.RESET);
       // System.out.println(_15_4_SpecialColor.YELLOW + accessModifier.privateData + _15_4_SpecialColor.RESET);
       // System.out.println(_15_4_SpecialColor.RED + accessModifier.protectedData + _15_4_SpecialColor.RESET);
       // System.out.println(_15_4_SpecialColor.GREEN + accessModifier.defaultData + _15_4_SpecialColor.RESET);
    }
}
