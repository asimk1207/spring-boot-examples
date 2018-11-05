package com.example.cache.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.jcache.JCacheCacheManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.URISyntaxException;

import javax.cache.Caching;

//@EnableCaching
//@Configuration
public class CacheConfig {

//	@Bean
//	public CacheManager cacheManager() throws URISyntaxException {
//		return new JCacheCacheManager(Caching.getCachingProvider()
//				.getCacheManager(getClass().getResource("/ehcache.xml").toURI(), getClass().getClassLoader()));
//	}

}
