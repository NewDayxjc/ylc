package com.ylc.kuaishou.vo;


import com.ylc.kuaishou.domain.KsDeliveryData;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

@Getter
@Setter
public class DeliveryRecordExcelVo {

    private String userId;

    private HashSet<KsDeliveryData> ksDeliveryDataHashSet = new HashSet<>();



    private AtomicInteger successNumber=new AtomicInteger(0);

    private AtomicInteger failNumber=new AtomicInteger(0);
    /**
     * 操作类型
     */
    private Integer operationType;
}
