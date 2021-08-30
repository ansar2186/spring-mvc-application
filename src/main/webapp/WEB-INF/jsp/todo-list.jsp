<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
	HI ${name} Your TODOs Are
	<br>
	<div class="container">
		<div>

			<a class="w-20 btn btn-lg btn-primary" href="/add-todo">Add New
				Todo</a>
		</div>
		<table class="table table-striped">

			<caption>Todos</caption>
			<thead>
				<tr>
					<th>user</th>
					<th>Description</th>
					<th>Date</th>
					<th>Done</th>
					<th>Update</th>
					<th>Delete</th>



				</tr>


			</thead>

			<tbody>
				<c:forEach items="${list}" var="todolist">

					<tr>
						<td>${todolist.user}</td>
						<td>${todolist.desc}</td>
						<td><fmt:formatDate pattern="dd/MM/yyyy"
								value="${todolist.targetDate}" /></td>
						<td>${todolist.done}</td>
						<td><a class="btn btn-primary"
							href="/update-todo?id=${todolist.id}">Update</a></td>
						<td><a href="/delete-toto?id=${todolist.id}"
							class="btn btn-danger"> Delete</a></td>
					</tr>

				</c:forEach>

			</tbody>


		</table>
	</div>
	<%@ include file="common/footer.jspf" %>
</body>
</html>