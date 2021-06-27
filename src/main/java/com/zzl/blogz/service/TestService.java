package com.zzl.blogz.service;

import com.zzl.blogz.domain.Test;
import com.zzl.blogz.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Zz1
 * @version 1.0
 * @date 2021/6/27 22:04
 */
@Service
public class TestService {

    @Resource //jdk自带
//    @Autowired
    private TestMapper testMapper;

    public List<Test> list(){
//        return testMapper.list();
        return null;
    }
}
