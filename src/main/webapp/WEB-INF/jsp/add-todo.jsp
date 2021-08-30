<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<div class="container">
	<h1>Add Todo</h1>
	<form:form action="/add-todo" method="post" commandName="todo">
		<fieldset class="form-group">
			<form:label path="desc">Description</form:label>
			<form:input path="desc" type="text" name="text-desc" id="text-desc"
				placeholder="Enter Name" required="required" class="form-control"></form:input>
			<form:errors path="desc" cssClass="error" />
			<br>

			<form:label path="targetDate">Target Date</form:label>
			<form:input path="targetDate" type="text" name="text-date"
				id="text-date" placeholder="" required="required"
				class="form-control"></form:input>
			<form:errors path="targetDate" cssClass="error" />
			<br>

		</fieldset>
		<input type="submit" class="btn btn-primary" value="submit">
	</form:form>
</div>
<%@ include file="common/footer.jspf"%>

</body>
</html>