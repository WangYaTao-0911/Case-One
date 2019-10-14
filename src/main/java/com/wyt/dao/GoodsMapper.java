package com.wyt.dao;

import java.util.List;

import com.wyt.vo.GoodsVO;
import com.yt.domains.Goods;

public interface GoodsMapper {

	List<Goods> selects(GoodsVO goodsVO);

	
}
