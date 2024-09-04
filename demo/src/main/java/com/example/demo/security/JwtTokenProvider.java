//package com.example.demo.security;
//
//import com.example.demo.userdetail.CustomUserDetail;
//import io.jsonwebtoken.*;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.stereotype.Component;
//
//import java.util.Date;
//
//import static com.example.demo.security.JWTConstants.JWT_EXPIRATION;
//import static com.example.demo.security.JWTConstants.JWT_SECRET;
//
//
//@Slf4j
//@Component
//public class JwtTokenProvider {
////    public String generateToken(CustomUserDetail userDetails) {
////        Date now = new Date();
////        Date expiryDate = new Date(now.getTime() + JWT_EXPIRATION);
////
////        return Jwts.builder()
////                .setSubject(userDetails.getUsername())
////                .setIssuedAt(now)
////                .setExpiration(expiryDate)
////                .signWith(SignatureAlgorithm.HS512, JWT_SECRET)
////                .compact();
////    }
////
////    public boolean validateToken(String authToken) {
////        try {
////            Jwts.parser().setSigningKey(JWT_SECRET).parseClaimsJws(authToken);
////            return true;
////        } catch (MalformedJwtException ex) {
////            log.error("Invalid JWT token");
////        } catch (ExpiredJwtException ex) {
////            log.error("Expired JWT token");
////        } catch (UnsupportedJwtException ex) {
////            log.error("Unsupported JWT token");
////        } catch (IllegalArgumentException ex) {
////            log.error("JWT claims string is empty.");
////
////
////        }
////        return false;
////    }
//
//    //    public Long getUserIdFromJWT(String token) {
////        Claims claims = Jwts.parser()
////                .setSigningKey(JWT_SECRET)
////                .parseClaimsJws(token)
////                .getBody();
////
////        return Long.parseLong(claims.getSubject());
////    }
////    public String getUserNameFromJWT(String token) {
////        Claims claims = Jwts.parser()
////                .setSigningKey(JWT_SECRET)
////                .parseClaimsJws(token)
////                .getBody();
////
////        return claims.getSubject();
////    }
//}
