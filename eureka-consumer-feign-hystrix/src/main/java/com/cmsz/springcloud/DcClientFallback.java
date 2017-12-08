package com.cmsz.springcloud;

import org.springframework.stereotype.Component;

@Component
public class DcClientFallback implements DcClient {
    @Override
    public String consumer() {
        return "fallback2";
    }
}