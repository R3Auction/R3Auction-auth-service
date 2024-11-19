package com.r3a.auth.repository;
import com.r3a.auth.jwt.RefreshToken;
import org.springframework.data.repository.CrudRepository;

public interface RefreshTokenRepository extends CrudRepository<RefreshToken, String> {
//    void deleteByRefreshToken(String refreshToken);
}
