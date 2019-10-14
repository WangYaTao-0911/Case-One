package com.wyt.services;


import com.github.pagehelper.PageInfo;
import com.wyt.vo.GoodsVO;
import com.yt.domains.Goods;


public interface GoodsService {

	PageInfo<Goods> selects(GoodsVO goodsVO, Integer pageNum, Integer pageSize);

}
