package com.smartcity.consumeBinanceRestApi.entity;

import java.util.Date;

public class Trade {
    private Long id;
    private Double price;
    private Double qty;
    private Double quoteQty;
    private Date time;
    private Boolean isBuyerMaker;
    private Boolean isBestMatch;

    public Trade () {}

    public Trade(
            Long id,
            Double price,
            Double qty,
            Double quoteQty,
            Date time,
            Boolean isBuyerMaker,
            Boolean isBestMatch
    ) {
        this.id = id;
        this.price = price;
        this.qty = qty;
        this. quoteQty = quoteQty;
        this.time = time;
        this. isBuyerMaker = isBuyerMaker;
        this.isBestMatch = isBestMatch;
    }

    public Long getId() {
        return id;
    }

    public Double getPrice() {
        return price;
    }

    public Double getQty() {
        return qty;
    }

    public Double getQuoteQty() {
        return quoteQty;
    }

    public Date getTime() {
        return time;
    }

    public Boolean getBuyerMaker() {
        return isBuyerMaker;
    }

    public Boolean getBestMatch() {
        return isBestMatch;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setQty(Double qty) {
        this.qty = qty;
    }

    public void setQuoteQty(Double quoteQty) {
        this.quoteQty = quoteQty;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public void setBuyerMaker(Boolean buyerMaker) {
        isBuyerMaker = buyerMaker;
    }

    public void setBestMatch(Boolean bestMatch) {
        isBestMatch = bestMatch;
    }

    @Override
    public String toString() {
        return "Trade{" +
                "id: " + id + "\n" +
                "price: " + price + "\n" +
                "qty: " + qty + "\n" +
                "quoteQty: " + quoteQty + "\n" +
                "time: " + time + "\n" +
                "isBuyerMaker: " + isBuyerMaker + "\n" +
                "isBestMatch: " + isBestMatch + "\n" +
                "}";

    }


}
