package com.hotmart.marketplace.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.io.Serializable;

@Value
@Getter
@Builder
@Jacksonized
@Entity
@Table(name = "MARKETPLACE_SALE")
public class Sale implements Serializable {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "ID")
        Long id;

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "ID_PRODUCT")
        Product product;

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "ID_PURCHASER")
        Purchaser purchaser;

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "ID_SELLER")
        Seller seller;

        @Column(name = "SCORE")
        @Min(0)
        @Max(5)
        Integer score;
}