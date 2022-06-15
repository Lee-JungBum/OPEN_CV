package com.OPEN_CV.characterface.mapper;

import com.OPEN_CV.characterface.domain.DB;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DBmapper {
    void DBSave(String url,int password,String email);
    DB DBLoad(String email, int password);
}
