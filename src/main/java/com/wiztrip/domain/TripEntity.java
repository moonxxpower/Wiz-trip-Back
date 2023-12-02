package com.wiztrip.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class TripEntity {

    @Id
    @Column(name = "trip_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private LocalDate startDate;

    private LocalDate finishDate;

    private String destination; //목적지. 사용자가 정할 수 있으면 좋을듯?? 00과 부산여행, 00과 엠티 등등

    @OneToMany(mappedBy = "trip", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TripUserEntity> tripUserEntityList = new ArrayList<>();

    @OneToMany(mappedBy = "trip", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PlanEntity> planEntityList = new ArrayList<>();

    @OneToMany(mappedBy = "trip", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MemoEntity> memoEntityList = new ArrayList<>();

    //todo: 숙소, 식당 등에 대한 메모 엔티티 하다 더 파야함
}
