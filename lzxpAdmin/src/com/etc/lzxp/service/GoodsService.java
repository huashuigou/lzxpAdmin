package com.etc.lzxp.service;

import java.util.List;

import com.etc.lzxp.dao.GoodsDao;
import com.etc.lzxp.entity.Goods;
import com.etc.lzxp.entity.GoodsAndStype;

public class GoodsService {
	GoodsDao gd = new GoodsDao();

	/**
	 * ��ʾ������Ʒ��Ϣ
	 * 
	 * @return
	 */
	public List<GoodsAndStype> getAllGoods() {
		return gd.getAllGoods();
	}

	/**
	 * ͨ��ID����
	 * 
	 * @param goodsId
	 * @return
	 */
	public List<Goods> getGoodsBygoodsId(int goodsId) {
		return gd.getGoodsBygoodsId(goodsId);
	}

	/**
	 * ͨ����Ʒ����
	 * 
	 * @param goodsName
	 * @return
	 */
	public List<Goods> getGoodsByGoodsName(String goodsName) {
		return gd.getGoodsByGoodsName(goodsName);
	}

	/**
	 * ������Ʒ
	 * 
	 * @param goods
	 * @return
	 */
	public boolean addGoods(Goods goods) {
		return gd.addGoods(goods);
	}

	/**
	 * ͨ��IDɾ����Ʒ
	 * 
	 * @param goodsId
	 * @return
	 */
	public boolean deleteGoods(int goodsId) {
		return gd.deleteGoods(goodsId);
	}
	
	/**
	 * �޸���Ʒ��Ϣ
	 * @param goods
	 * @return
	 */
	public boolean updateGoods(Goods goods){
		return gd.updateGoods(goods);
	}
}
