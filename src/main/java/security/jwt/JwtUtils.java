package security.jwt;

import java.security.Key;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;
import security.services.UserDetailsImpl;


import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class JwtUtils {

//    private static final String JWT_SECRET = "yourJwtSecretKey";
//    private static final long JWT_EXPIRATION_TIME = 1000 * 60 * 60; // 1 hour
//
//    // Generate JWT token
//    public String generateToken(UserDetails userDetails) {
//        Map<String, Object> claims = new HashMap<>();
//        claims.put("sub", userDetails.getUsername());
//        claims.put("iat", new Date());
//        claims.put("roles", userDetails.getAuthorities());
//        return Jwts.builder()
//                .setClaims(claims)
//                .setExpiration(new Date(System.currentTimeMillis() + JWT_EXPIRATION_TIME))
//                .signWith(SignatureAlgorithm.HS512, JWT_SECRET)
//                .compact();
//    }
//
//    // Validate JWT token
//    public boolean validateToken(String token, UserDetails userDetails) {
//        String username = extractUsername(token);
//        return (username.equals(userDetails.getUsername()) && !isTokenExpired(token));
//    }
//
//    // Extract username from JWT token
//    public String extractUsername(String token) {
//        return extractClaims(token).getSubject();
//    }
//
//    // Check if JWT token is expired
//    public boolean isTokenExpired(String token) {
//        return extractClaims(token).getExpiration().before(new Date());
//    }
//
//    // Extract claims from JWT token
//    private Claims extractClaims(String token) {
//        return Jwts.parser().setSigningKey(JWT_SECRET).parseClaimsJws(token).getBody();
//    }
}
