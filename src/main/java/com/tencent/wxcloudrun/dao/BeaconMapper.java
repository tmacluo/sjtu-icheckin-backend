package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.model.Beacon;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BeaconMapper {
    List<Beacon> getBeacons() ;
}
