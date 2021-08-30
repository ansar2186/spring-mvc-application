<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<div class="container">
	<h1>Update Todo</h1>
	<form:form action="/update-todo" method="post" commandName="todo">
		<form:hidden path="id" />
		<fieldset class="form-group">
			<form:label path="user">User</form:label>
			<form:input path="user" type="text" name="text-user" id="text-user"
				placeholder="Enter Name" required="required" class="form-control"></form:input>
			<br>

			<form:label path="desc">Description</form:label>
			<form:input path="desc" type="text" name="text-desc" id="text-desc"
				placeholder="Enter description" required="required"
				class="form-control"></form:input>
			<br>


			<form:label path="targetDate">Date</form:label>
			<form:input path="targetDate" type="text" name="text-targetDate"
				id="text-targetDate" placeholder="Enter Target Date"
				required="required" class="form-control"></form:input>
			<br>

			<form:label path="done">Done</form:label>
			<form:input path="done" type="text" name="text-done" id="text-done"
				placeholder="Enter" required="required" class="form-control"></form:input>
			<br>

		</fieldset>
		<input type="submit" class="btn btn-primary" value="submit">
	</form:form>
</div>


<%@ include file="common/footer.jspf"%>


</body>
</html>