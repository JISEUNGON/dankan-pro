package com.dankan.controller;

import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/review")
@Api(tags = {"후기 관련 api"})
@AllArgsConstructor
public class ReviewController {
    /**
     * TODO: 후기 생성 API
     * TODO: 후기 삭제 API
     * TODO: 후기 최신순 정렬 API
     * TODO: 해당 매물의 후기 확인 API
     * TODO: 후기 신고 API
     * */
}
