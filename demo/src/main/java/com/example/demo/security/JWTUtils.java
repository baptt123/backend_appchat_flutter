package com.example.demo.security;

import com.example.demo.dto.UserDTO;
import com.example.demo.model.User;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;

import java.nio.file.AccessDeniedException;
import java.util.Date;
@Component
public class JWTUtils {
    private static String secret = "This_is_secret";
    private static long expiryDuration = 60 * 60;

    public String generateJwt(UserDTO userDTO) {
        //thời gian tồn tại của token
        long milliTime = System.currentTimeMillis();
        long expiryTime = milliTime + expiryDuration * 1000;

        Date issuedAt = new Date(milliTime);
        Date expiryAt = new Date(expiryTime);

        // claims
        Claims claims = Jwts.claims()
                .setIssuer(String.valueOf(userDTO.getName()))
                .setIssuer(String.valueOf(userDTO.getUsername())).setIssuer(String.valueOf(userDTO.getPassword()))
                .setIssuedAt(issuedAt)
                .setExpiration(expiryAt);

        // optional claims
//        claims.put("type", user.getUserType());
//        claims.put("name", user.getName());
//        claims.put("emailId", user.getEmailId());

        // generate jwt using claims
        return Jwts.builder()
                .setClaims(claims)
                .signWith(SignatureAlgorithm.HS512, secret)
                .compact();
    }
//authorizaion là biến lưu trữ jwt khi client gửi xuống
    public Claims verify(String authorization) throws Exception {

        try {
            Claims claims = Jwts.parser().setSigningKey(secret).parseClaimsJws(authorization).getBody();
            return claims;
        } catch (Exception e) {
            throw new AccessDeniedException("Từ chối quyền truy cập");
        }

    }
}
