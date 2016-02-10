package com.epam.ap.entity;

import java.math.BigInteger;

public class Commodity implements Cloneable {
    private BigInteger price;
    private String description;
    private CommodityType type;
}
