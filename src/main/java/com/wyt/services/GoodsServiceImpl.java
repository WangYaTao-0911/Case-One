package com.wyt.services;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wyt.dao.GoodsMapper;
import com.wyt.services.GoodsService;
import com.wyt.vo.GoodsVO;
import com.yt.domains.Goods;


@Service
public class GoodsServiceImpl implements GoodsService{

	@Autowired
	private GoodsMapper Mapper;
	@Override
	public PageInfo<Goods> selects(GoodsVO goodsVO, Integer pageNum, Integer pageSize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum,pageSize);
		List<Goods> list=Mapper.selects(goodsVO);
		PageInfo<Goods> info=new PageInfo<Goods>(list);
		return info;
	}

	

}
