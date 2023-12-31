package com.dankan.service.token;

import com.dankan.dto.response.login.TokenResponseDto;
import com.dankan.dto.request.token.TokenRequestDto;

import java.util.UUID;

public interface TokenService {
    public Boolean isExpired();
    public TokenResponseDto reissueAccessToken(TokenRequestDto tokenRequestDto);
    public TokenResponseDto findByUserId(Long id);
}
