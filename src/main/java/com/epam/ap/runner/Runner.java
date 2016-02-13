package com.epam.ap.runner;

import com.epam.ap.entity.Catalogue;
import com.epam.ap.entity.CatalogueFactory;

public class Runner {
    public static void main(String[] args) {
        Catalogue catalogue = CatalogueFactory.getRandomCatalogue();
        System.out.println(catalogue);

        catalogue.sort(Catalogue.COMPARE_PRICE);
        System.out.println(catalogue);

        System.out.println(catalogue.findByPrice(1500,10000));


    }
}
