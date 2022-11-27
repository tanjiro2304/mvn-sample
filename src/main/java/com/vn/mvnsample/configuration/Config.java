package com.vn.mvnsample.configuration;

import com.vn.mvnsample.modules.PresenterImpl;
import com.vn.mvnsample.modules.View;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public View.Presenter presenter(){
        return new PresenterImpl();
    }
}
