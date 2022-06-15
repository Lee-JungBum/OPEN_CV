package com.OPEN_CV.characterface.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import javax.validation.constraints.*;


@Getter
@Builder
@ToString
public class User {
    @ApiModelProperty(example = "회원 번호")
    int idx;

    @NotBlank(message = "이메일을 입력하세요.")
    @Email(message = "이메일 형식에 맞지 않습니다.")

    @NotBlank(message = "이메일을 입력하세요.")
    @Email(message = "이메일 형식에 맞지 않습니다.")
    @ApiModelProperty(example = "E-mail")
    String email;

    @NotBlank(message = "비밀번호는 필수 입력 값입니다.")
    @Pattern(regexp="(?=.*[0-9])(?=.*[a-zA-Z])(?=.*\\W)(?=\\S+$).{8}",
            message = "비밀번호는 영문 대,소문자와 숫자, 특수기호가 적어도 1개 이상씩 포함된 8자 ~ 20자의 비밀번호여야 합니다.")
    @ApiModelProperty(example = "비밀번호")
    String password;

    @NotEmpty(message = "이름을 입력하세요.")
    @ApiModelProperty(example = "이름")
    String Name;
}
