package com.project.LabStore.domain;

import com.project.LabStore.domain.item.Item;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Date;

@Entity
public class Member {

    @Id
    @GeneratedValue
    private Long id;

    private String userid;
    private String pwd;
    private String name;
    private String email;
    private String phone;

    private Date dateJoined;
    private ArrayList<Item> wishList;
    private boolean isAdministrator;





}
