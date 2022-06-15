package com.OPEN_CV.characterface.domain;

import com.OPEN_CV.characterface.mapper.DBmapper;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@Builder
public class DB {
    int password;
    String email;
    String url;
    int idx;

}
