package info.m2sj.ehcachetest;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class NameService {

    @Cacheable(value = "cache_names", key = "#prefix")
    public List<String> findNames(String prefix) {
       log.info("====== Start Generating name ======");
       List<String> rtnList = new ArrayList<>();

       for (int i = 0; i < 500; i++) {
           rtnList.add(prefix + "_" + RandomStringUtils.randomAlphabetic(5));
       }
       log.info("====== Completed ======");
       return rtnList;
    }
}
