package com.etc.lzxp.dao;

import java.util.ArrayList;
import java.util.List;

import com.etc.lzxp.entity.Goods;
import com.etc.util.BaseDao;

public class GoodsDao {
	/**
	 * ��ʾ��Ʒ������Ϣ
	 * 
	 * @return
	 */
	public List<Goods> getAllGoods() {
		return (List<Goods>) BaseDao.select("select * from goods", Goods.class, null);
	}

	/**
	 * ͨ��ID����
	 * 
	 * @param goodsId
	 * @return
	 */
	public List<Goods> getGoodsBygoodsId(int goodsId) {
		return (List<Goods>) BaseDao.select("select * from Goods where goodsId like ?", Goods.class, goodsId);
	}

	/**
	 * ͨ����Ʒ������
	 * 
	 * @param goodsName
	 * @return
	 */
	public List<Goods> getGoodsByGoodsName(String goodsName) {
		List<Goods> list = new ArrayList<>();

		if ((goodsName.equals(""))) {
			// ���������Ϊ��
			list = (List<Goods>) BaseDao.select("select * from goods", Goods.class);
		} else {
			list = (List<Goods>) BaseDao.select("select * from goods where GoodsName like ? ", Goods.class,
					"%" + goodsName + "%");
		}
		return list;
	}

	/**
	 * ������Ʒ
	 * 
	 * @param goods
	 * @return
	 */
	public boolean addGoods(Goods goods) {
		return BaseDao.execute("insert into  Goods values(null,?,?,?,?,?,?)", goods.getGOODSNAME(),
				goods.getSTYPEID(), goods.getGOODSPRICE(), goods.getGOODSCONTENT(), goods.getGOODSSTOCK(),
				goods.getGOODSSTATE()) > 0;
	}

	/**
	 * ������ƷIDɾ��
	 * 
	 * @param goodsId
	 * @return
	 */
	public boolean deleteGoods(int goodsId) {
		return BaseDao.execute("delete from Goods where goodsId=?", goodsId) > 0;
	}
	
	/**
	 * �޸���Ʒ��Ϣ
	 * @param goods
	 * @return
	 */
	public boolean updateGoods(Goods goods) {
		return BaseDao.execute(
				"update Goods set goodsName=?,stypeId=?,goodsPrice=?,goodsContent=?,goodsStock=?goodsState=? where goodsId=?",goods.getGOODSNAME(),goods.getSTYPEID(),goods.getGOODSPRICE(),goods.getGOODSCONTENT(),goods.getGOODSSTOCK(),goods.getGOODSSTATE(),goods.getGOODSID()) > 0;
	}

}
