package com.OPEN_CV.characterface.JWT;

import com.OPEN_CV.characterface.domain.User;
//import io.jsonwebtoken.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.xml.bind.DatatypeConverter;
import java.util.Date;

@RequiredArgsConstructor
@Slf4j
@Component
public class JWT {
//    private long tokenValidTime = 60*60*1000L;
//    @Value("${jwt.secret}")
//    private String secretKey;
//    public String makeJWTToken(User user)
//    {
//        Date now = new Date();
//        return Jwts.builder()
//                .setHeaderParam(Header.TYPE, Header.JWT_TYPE) // (1)
//                .setIssuer(user.getName()) // (2)
//                .setIssuedAt(now) // (3)
//                .setExpiration(new Date(now.getTime()+tokenValidTime)) // (4)
//                .claim("email", user.getEmail())
//                .signWith(SignatureAlgorithm.HS256, secretKey) // (6)
//                .compact();
//    }
//
//
//    // 토큰에서 회원 정보 추출
//    public String getUserPk(String token) {
//        if(validateToken(token))
//        {
//            return Jwts.parser().setSigningKey(DatatypeConverter.parseBase64Binary(secretKey)).parseClaimsJws(token).getBody().getSubject();
//        }else
//        {
//            return "만료된 토큰이다";
//        }
//    }
//
//    public boolean validateToken(String jwtToken) {
//
//        try {
//            Jws<Claims> claims = Jwts.parser().setSigningKey(DatatypeConverter.parseBase64Binary(secretKey)).parseClaimsJws(jwtToken);
//            return !claims.getBody().getExpiration().before(new Date());
//        } catch (ExpiredJwtException e) {// 이쪽에서 예외 터질일 없을것 으로 예상됨.
//            log.debug("해당 토큰은 이미 만료된 토큰입니다\n"+"토큰 만료시간 : {}"+e.getClaims().getExpiration());
//            return false;
//        }
//    }
}
