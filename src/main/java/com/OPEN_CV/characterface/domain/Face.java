package com.OPEN_CV.characterface.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
@AllArgsConstructor
public class Face {
    int idx;
    String url;
    String email;
}
