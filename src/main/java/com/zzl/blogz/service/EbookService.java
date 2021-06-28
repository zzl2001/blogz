package com.zzl.blogz.service;

import com.zzl.blogz.domain.Ebook;
import com.zzl.blogz.mapper.EbookMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Zz1
 * @version 1.0
 * @date 2021/6/27 22:04
 */
@Service
public class EbookService {

    @Resource //jdk自带
//    @Autowired
    private EbookMapper ebookMapper;

    public List<Ebook> list(){
//        return ebookMapper.list();
        return ebookMapper.selectByExample(null);
    }
}
