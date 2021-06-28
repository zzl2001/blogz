package com.zzl.blogz.service;

import com.zzl.blogz.domain.Ebook;
import com.zzl.blogz.domain.EbookExample;
import com.zzl.blogz.mapper.EbookMapper;
import com.zzl.blogz.req.EbookReq;
import com.zzl.blogz.resp.EbookResp;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
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

    public List<EbookResp> list(EbookReq ebookReq){
//        return ebookMapper.list();
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();// 相当于where条件
        criteria.andNameLike("%"+ebookReq.getName()+"%");//模糊查询
        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);//以这个方式查询

        List<EbookResp> ebookRespList = new ArrayList<>();
        for (Ebook ebook: ebookList){
            EbookResp ebookResp = new EbookResp();
            BeanUtils.copyProperties(ebook, ebookResp);
            ebookRespList.add(ebookResp);
        }

        return ebookRespList;
    }

    public List<Ebook> list(){
        return ebookMapper.selectByExample(null);
    }
}
