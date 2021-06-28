package com.zzl.blogz.controller;

import com.zzl.blogz.domain.Ebook;
import com.zzl.blogz.req.EbookReq;
import com.zzl.blogz.resp.CommonResp;
import com.zzl.blogz.resp.EbookResp;
import com.zzl.blogz.service.EbookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Zz1
 * @version 1.0
 * @date 2021/6/26 22:17
 */
@RestController
@RequestMapping("/ebook")
public class EbookController {

    @Resource
    private EbookService ebookService;

    @GetMapping("/list")
    public CommonResp list(){
        CommonResp<List<Ebook>> response = new CommonResp<>();
        List<Ebook> list = ebookService.list();
        response.setContent(list);
        return response;
    }

    @GetMapping("/list1")
    public CommonResp list(EbookReq req){
        CommonResp<List<EbookResp>> response = new CommonResp<>();
        List<EbookResp> list = ebookService.list(req);
        response.setContent(list);
        return response;
    }
}
