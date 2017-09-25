<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Struts2-ajax Test</title>
<style>
#goodsPanel {
	width: 800px;
	height: 600px;
	border: 1px solid red;
	margin: 0 auto;
	display: flex;
	flex-direction: row;
	margin: 0 auto
}

#goodsPanel .goods-category-panel {
	flex-grow: 1;
	min-width: 200px;
	max-width: 200px;
	border-right: 1px solid red;
}

#goodsPanel .goods-content-panel {
	flex-grow: 1;
	padding: 0 10px;
	overflow: auto;
}

#goodsPanel .goods-category-panel ul {
	padding: 0;
	margin: 0;
	list-style: none;
}

#goodsPanel .goods-category-panel ul li {
	height: 40px;
	line-height: 40px;
	padding-left: 30px;
	cursor: pointer;
	padding-left: 30px;
}

#goodsPanel .goods-category-panel ul li:hover, #goodsPanel .goods-category-panel ul li.active,
	#goodsPanel .goods-content-panel table tbody tr:hover {
	background-color: red;
	color: white;
}

#goodsPanel .goods-content-panel table {
	width: 100%;
	border-collapse: collapse;
}

#goodsPanel .goods-content-panel table thead th {
	border-bottom: 2px solid #ccc;
	padding: 5px 10px;
}

#goodsPanel .goods-content-panel table tr td {
	padding: 5px 10px;
	text-align: center;
}

#goodsPanel .goods-content-panel table tbody tr {
	cursor: pointer;
}
</style>
</head>
<body>
	<div id="goodsPanel">
		<div class="goods-category-panel"></div>
		<div class="goods-content-panel"></div>
	</div>
	<script type="text/javascript" src="http://code.jquery.com/jquery-2.1.3.js"></script>
	<script>
		var $goodsPanel;
		var $goodsCategoryPanel;
		var $goodsContentPanel;

		$(function() {
			$goodsPanel = $("#goodsPanel");
			$goodsCategoryPanel = $goodsPanel.find(".goods-category-panel");
			$goodsContentPanel = $goodsPanel.find(".goods-content-panel");

			// 加载商品类别
			$goodsCategoryPanel.load("category", function() {
				var $parent = $(this);

				// 点击商品类别
				$parent.find(".goods-category-item").on("click", function() {
					var $this = $(this);
					// 获取商品类别id
					var categoryId = $this.data("id");

					// 高亮处理
					$parent.find(".goods-category-item").removeClass("active");
					$this.addClass("active");

					// 加载商品列表
					$goodsContentPanel.load("goods", {
						categoryId : categoryId
					});
				}).first().click();
			});
		});
	</script>
</body>
</html>