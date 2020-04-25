package com.apricot.core.model.party;
/*
    Apricot Management Suite
    Copyright (C) 2020 Tarang Parikh

    Email : tp0265@gmail.com
    Project Home : https://github.com/tarangparikh/apricot

    Original Author : @author Tarang Parikh <tp0265@gmail.com>

*/

import com.apricot.core.model.company.Company;

import javax.persistence.*;

@Entity
@Table
public class Party {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String phoneNumber;
    private String email;
    private String address;
    @Enumerated(EnumType.STRING) private PartyType partyType;
    private String gstInNumber;
    @OneToOne private Company company;
}
