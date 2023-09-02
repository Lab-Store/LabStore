package com.project.LabStore.domain;

import com.project.LabStore.domain.item.Item;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Date;

@Entity
@Getter @Setter
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
