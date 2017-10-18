package com.etc.lzxp.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.etc.lzxp.entity.Goods;
import com.etc.lzxp.entity.GoodsAndStype;
import com.etc.lzxp.service.GoodsService;

/**
 * Servlet implementation class GoodsServlet
 */
@WebServlet("/GoodsServlet")
public class GoodsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	GoodsService gs=new GoodsService();
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<GoodsAndStype> list =new ArrayList<GoodsAndStype>();
		
		if (request.getParameter("op") != null) {

			// ��op��ֵȡ���� �ж����ֵ
			String op = request.getParameter("op");

			if (op.equals("getAllGoods")) {
				// ��ѯ���У�����Service�еķ��� 
				list = gs.getAllGoods();

			}   else if (op.equals("addGoods")) {
				// ���Ӳ���
				String goodsName = request.getParameter("goodsName");
				int stypeId = Integer.parseInt(request.getParameter("stypeId"));
				double goodsPrice = Double.parseDouble(request.getParameter("goodsPrice"));
				String goodsContent = request.getParameter("goodsContent");
				int goodsStock = Integer.parseInt(request.getParameter("goodsStock"));
				int goodsState = Integer.parseInt(request.getParameter("goodsState"));

				//�õ�һ��goods����
				Goods goods = new Goods(0,goodsName, stypeId, goodsPrice, goodsContent,goodsStock,goodsState);
				// ����service��add����
				gs.addGoods(goods);

				list = gs.getAllGoods();

			}  else if (op.equals("deleteGoods")) {

				// ɾ������
				String goodsIdStr = request.getParameter("goodsIdStr");
				
				System.out.println(goodsIdStr);
				
				String[] goodsId=goodsIdStr.split(",");
				
				for(int i=0;i<goodsId.length;i++){
					
				gs.deleteGoods(Integer.parseInt(goodsId[i]));
				
				}

				list = gs.getAllGoods();

			}else if (op.equals("updateGoods")) {

				// �޸Ĳ���
				String goodsName = request.getParameter("goodsName");
				int stypeId = Integer.parseInt(request.getParameter("stypeId"));
				double goodsPrice = Double.parseDouble(request.getParameter("goodsPrice"));
				String goodsContent = request.getParameter("goodsContent");
				int stypeStock = Integer.parseInt(request.getParameter("stypeStock"));
				int goodsState = Integer.parseInt(request.getParameter("goodsState"));

				Goods goods=new Goods(0,goodsName, stypeId,goodsPrice,goodsContent,stypeStock,goodsState);
				
				gs.updateGoods(goods);

				list = gs.getAllGoods();

			}
		}

		// ��������ظ�goods-list.jsp
		// ������Ҫ���ݵ�����
		request.setAttribute("list", list);

		// ��ת��
		request.getRequestDispatcher("goods-list.jsp").forward(request, response);
	
	}

}
