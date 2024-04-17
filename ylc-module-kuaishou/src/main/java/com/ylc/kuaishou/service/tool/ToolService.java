package com.ylc.kuaishou.service.tool;


import com.ylc.kuaishou.domain.KsDeliveryData;
import com.ylc.kuaishou.excel.DeliveryExcel;
import com.ylc.kuaishou.vo.DeliveryRecordExcelVo;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.List;
import java.util.function.Consumer;
import java.util.logging.SimpleFormatter;


public class ToolService {
    public static Consumer<List<DeliveryExcel>> importDeliveryRecord(DeliveryRecordExcelVo deliveryRecordExcelVo) {
        return data->{
            HashSet<KsDeliveryData> ksDeliveryDataHashSet = deliveryRecordExcelVo.getKsDeliveryDataHashSet();
            for (DeliveryExcel datum : data) {

                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

                KsDeliveryData ksDeliveryData = new KsDeliveryData();
                String nativeNumber = datum.getNative_number();


                try {
                    ksDeliveryData.setNativeNumber(nativeNumber);
                    ksDeliveryData.setDeliveryName(datum.getDeliveryCompany());
                    ksDeliveryData.setDeliveryNumber(datum.getDeliveryNumber());
                    ksDeliveryData.setSerialNumber(datum.getSerialNumber());
                    ksDeliveryData.setDeliveryTime(simpleDateFormat.parse (datum.getDeliveryTime()));
                    ksDeliveryData.setShopName(datum.getShop());
                    ksDeliveryDataHashSet.add(ksDeliveryData);

                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }

            }
        };


    }

    public static DeliveryExcel deliveryRecordImport(DeliveryRecordExcelVo deliveryRecordExcelVo) {
        return null;
    }
}
