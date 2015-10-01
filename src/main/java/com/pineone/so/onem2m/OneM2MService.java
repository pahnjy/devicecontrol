package com.pineone.so.onem2m;

import org.springframework.stereotype.Service;

/**
 * Created by use on 2015-10-01.
 */
@Service
public class OneM2MService {

    /**
     * create oneM2MMessage
     * @param physicaloperator
     * @return
     */
    public String oneM2MCreateMessage(String physicaloperator){

        return "http://localhost:9901/herit-in/herit-cse/ae-gaslock1004";

    }


}
