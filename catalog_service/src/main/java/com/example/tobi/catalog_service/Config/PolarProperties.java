package com.example.tobi.catalog_service.Config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties(prefix = "polar")
public class PolarProperties {
    String greeting;

}
