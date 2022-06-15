package com.yomean.carbooking.dao;

import com.yomean.carbooking.bean.CarBookingOrder;
import com.yomean.carbooking.bean.condition.CarBookingOrderQC;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CarBookingOrderDao {

    int add(CarBookingOrder order);

    int update(CarBookingOrder order);

    List<CarBookingOrder> query(CarBookingOrderQC qc);
}