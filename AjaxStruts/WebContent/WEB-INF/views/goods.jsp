<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<table>
	<thead>
		<tr>
			<th>序号</th>
			<th>名称</th>
			<th>数量</th>
			<th>价格</th>
		</tr>
	</thead>
	<tbody>
		<!-- varStatus获取当前索引或序号 -->
		<c:forEach var="item" items="${goods }" varStatus="status">
			<tr class="goods-content-item" data-id="${item.id }">
				<!-- count获取当前序号，从1开始 -->
				<!-- index获取当前索引，从0开始 -->
				<td>${status.count }- ${status.index }</td>
				<td>${item.name }</td>
				<td>${item.counts }</td>
				<td>${item.price }</td>
			</tr>
		</c:forEach>
	</tbody>
</table>

<script>
	$(function() {
		// 点击商品显示描述信息
		$goodsContentPanel.find(".goods-content-item").on("click", function() {
			var $this = $(this);
			// 获取商品id
			var goodsId = $this.data("id");

			// 异步获取商品描述信息
			$.ajax({
				url : "description",
				type : "post",
				dataType : "json",
				data : {
					goodsId : goodsId
				},
				success : function(data) {
					alert(data.description);
				}
			})
		});
	})
</script>