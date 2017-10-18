<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>系统后台</title>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/bootstrap-responsive.min.css" />
<link rel="stylesheet" href="css/uniform.css" />
<link rel="stylesheet" href="css/select2.css" />
<link rel="stylesheet" href="css/unicorn.main.css" />
<link rel="stylesheet" href="css/unicorn.grey.css" class="skin-color" />

<script src="js/jquery.min.js"></script>
<script src="js/jquery.ui.custom.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/jquery.uniform.js"></script>
<script src="js/select2.min.js"></script>
<script src="js/jquery.dataTables.min.js"></script>
<script src="js/unicorn.js"></script>
<script src="js/unicorn.tables.js"></script>

</head>
<body>
	<div id="header">
		<h1>
			<a href="#">零嘴小铺</a>
		</h1>
	</div>

	<!-- 左侧菜单栏 -->
	<div id="sidebar">
		<ul>
			<li><a href="index.jsp"><i
					class="icon icon-home"></i> <span>后台首页</span></a></li>

			<li class="submenu"><a href="#"><i class="icon icon-th-list"></i>
					<span>订单管理</span></a>
				<ul>
					<li><a href="#">已处理</a></li>
					<li><a href="#">未处理</a></li>
				</ul></li>

			<li class="submenu active open"><a href="#"><i class="icon icon-th-list"></i>
					<span>商品管理</span></a>
				<ul>
					<li class="active"><a href="GoodsServlet?op=getAllGoods" >商品列表</a></li>
					<li class="active"><a href="goods-sort.jsp">商品分类</a></li>
					<li class="active"><a href="goods-state.jsp">商品状态</a></li>
				</ul></li>

			<li class="submenu"><a href="#"><i class="icon icon-th-list"></i>
					<span>交易记录管理</span></a>
				<ul>
					<li><a href="#">交易记录管理</a></li>
				</ul></li>

			<!-- <li class="submenu"><a href="#"><i class="icon icon-th-list"></i>
					<span>评论管理</span></a>
				<ul>
					<li><a href="#">评论列表</a></li>
					<li><a href="#">意见反馈</a></li>
				</ul></li> -->
		</ul>
	</div>

	<div id="style-switcher">
		<i class="icon-arrow-left icon-white"></i> <span>Style:</span> <a
			href="#grey"
			style="background-color: #555555; border-color: #aaaaaa;"></a> <a
			href="#blue" style="background-color: #2D2F57;"></a> <a href="#red"
			style="background-color: #673232;"></a>
	</div>

	<div id="content">
		<div id="content-header">
			<h1>商品分类</h1>
		</div>

     <!-- 内容 -->
		<div id="breadcrumb">
			<a href="index.jsp" title="Go to Home" class="tip-bottom"><i
				class="icon-home"></i>后台管理</a> <a href="#" class="current">商品分类</a>
		</div>
		<div class="container-fluid">
			<div class="row-fluid">
				<div class="span12">
					<div class="widget-box">
						<div class="widget-title">
							<h5>商品类别列表</h5>
						</div>
						<div class="widget-content nopadding">
							<table class="table table-bordered data-table">
								<thead>
									<tr>
										<th>类别编号</th>
										<th>所属大类</th>
										<th>类别名</th>
									</tr>
								</thead>
								<tbody>

									<tr class="gradeA">
										<td>1</td>
										<td>坚果炒货</td>
										<td>开心果</td>
									</tr>

									<tr class="gradeA">
										<td>1</td>
										<td>坚果炒货</td>
										<td>开心果</td>
									</tr>

									<tr class="gradeA">
										<td>1</td>
										<td>坚果炒货</td>
										<td>开心果</td>
									</tr>
								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>

			<div class="row-fluid">
				<div id="footer" class="span12">版权所有 &copy; 2007-2017 零嘴小铺电子商务有限公司  闽ICP备15022981号</div>
			</div>
		</div>
	</div>


</body>
</html>