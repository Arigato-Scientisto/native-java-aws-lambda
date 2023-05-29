package org.example;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.ArrayList;

/**
 * created by Joseph Yacoub  on 03 Mar 2023
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StringGenerator {
    private ArrayList<String> stringList;
    public void generateList(int numberOfStrings, int stringLength){
        int length = stringLength;
        for(int i = 0; i< numberOfStrings;++i){
            String randString= RandomStringUtils.random(length, true, true);
            stringList.add(randString);
        }
    }

}
