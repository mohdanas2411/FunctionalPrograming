package com.FunctionalInerface;

/**
 * @author : MOHD ANAS ANSARI
 * @since : 11-Sep-2023 , Mon
 */

@FunctionalInterface
public interface MyFunctionalInterface <P,R,T> extends FunctionalParent{
    R test(P p,R r,P s,T t);
    boolean equals(Object obj);


}
