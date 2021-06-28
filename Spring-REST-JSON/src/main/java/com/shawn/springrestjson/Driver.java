package com.shawn.springrestjson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.shawn.springrestjson.entities.Organizations;

import java.io.File;


public class Driver {

    public static void main(String[] args) {

        try{

            ObjectMapper mapper = new ObjectMapper();

            Organizations organizations = mapper.readValue(new File("src/main/data/sample-full.json"), Organizations.class);

            System.out.println("organization : " + organizations.getOrganization());
            System.out.println("release_count : " + organizations.getRelease_count());
            System.out.println("total_labor_hours : " + organizations.getTotal_labor_hours());
            System.out.println("licenses : " + organizations.getLicenses());
            System.out.println("most_active_months: " + organizations.getMost_active_months());

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
