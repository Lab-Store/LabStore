package com.project.LabStore.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


@Entity
@Getter @Setter
public class Item {

    @Id @GeneratedValue
    @Column(name = "item_id")
    private Long id;
    private String name;
    private String brand;
    private int wishCount;

    private LocalDateTime dateRegistered;   // 관리자의 상품 등록일자

    private HashMap<String, String> specList;
    private List<String> tagList;
    private List<Sale> salelist;

    @OneToMany(mappedBy = "item")
    private List<MemberItem> memberItemList = new ArrayList<>();

}
