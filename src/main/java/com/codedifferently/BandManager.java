package com.codedifferently;


import java.lang.reflect.Array;

public class BandManager {
    private final WuMember[] wuMemberArray;

    public BandManager(WuMember[] wuMemberArray) {
        this.wuMemberArray = wuMemberArray;
    }

    public String whileLoop() {
        String result = "";
        // create a `counter`
       int counter = 0;
        // while `counter` is less than length of array
        while(counter < wuMemberArray.length) {
            // begin loop
            // use `counter` to identify the `current Person` in the array
            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable
            result += wuMemberArray[counter];
            counter++;
            // end loop
       }
        return result;
    }



    public String forLoop() {
        String result = "";
        // identify initial value
        // identify terminal condition
        // identify increment
        // use the above clauses to declare for-loop signature
        // begin loop

        for(int i =0; i < wuMemberArray.length; i++) {

            // use `counter` to identify the `current Person` in the array
            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable

            result += wuMemberArray[i];
        }
            // end loop

        return result;
    }



    public String forEachLoop() {
        String result = "";
        // identify array's type
        // identify array's variable-name
        // use the above discoveries to declare for-each-loop signature
        for ( WuMember wuMember: wuMemberArray) {
            // begin loop
            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable
            result+= wuMember.toString();
        }
            // end loop

        return result;
    }


    public WuMember[] getwuMemberArray() {
        return wuMemberArray;
    }
}
