package com.ylc.kuaishou.excel.listener;


import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.excel.exception.ExcelAnalysisException;
import lombok.extern.slf4j.Slf4j;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

@Slf4j
public class DeliveryRecordExcelListener {

    /**
     * 指定阈值
     *
     * @param consumer
     * @param threshold
     * @param <T>
     */
    public static <T> AnalysisEventListener<T> getListener(Consumer<List<T>> consumer, int threshold) {
        return new AnalysisEventListener<T>() {
            private LinkedList<T> linkedList = new LinkedList<T>();

            @Override
            public void invoke(T t, AnalysisContext analysisContext) {
                linkedList.add(t);
                if (linkedList.size() == threshold) {
                    consumer.accept(linkedList);
                    linkedList.clear();
                }
            }


            @Override
            public void invokeHeadMap(Map<Integer, String> headMap, AnalysisContext context) {
                log.info("解析到一条头数据：{}, currentRowHolder: {}", headMap.toString(), context.readRowHolder().getRowIndex());
                // 根据自己的情况去做表头的判断即可
                String txt = "{0=原始单号, 1=店铺, 2=物流公司, 3=物流单号, 4=序列号, 5=发货时间, 6=签收时间, 7=签收状态}";

                if (!txt.equals(headMap.toString())) {
                    throw new ExcelAnalysisException("Excel格式不对,请下载正确的模板");
                }
            }

            @Override
            public void doAfterAllAnalysed(AnalysisContext analysisContext) {
                if (linkedList.size() > 0) {
                    consumer.accept(linkedList);
                }
            }
        };
    }

    /**
     * 不指定阈值，阈值默认为10
     *
     * @param consumer
     * @param <T>
     * @return
     */
    public static <T> AnalysisEventListener<T> getListener(Consumer<List<T>> consumer) {
        return getListener(consumer, 10);
    }
}
