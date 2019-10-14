package com.wyt.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.wyt.services.GoodsService;
import com.wyt.util.PageUtil;
import com.wyt.vo.GoodsVO;
import com.yt.domains.Goods;


@Controller
public class GoodsController {

	@Autowired
	private GoodsService service;
	
	@RequestMapping("selects")
	public String selects(HttpServletRequest request,GoodsVO goodsVO,
			@RequestParam(defaultValue = "1")Integer pageNum,@RequestParam(defaultValue = "3")Integer pageSize){
		PageInfo<Goods> info=service.selects(goodsVO,pageNum,pageSize);
		PageUtil.page(request,"/selects", pageSize,info.getList(),info.getTotal(), pageNum);
		request.setAttribute("goods",info.getList());
		request.setAttribute("vo",goodsVO);
		return "goods";
	}
	
}
