<%@ include file="../common/header.jspf"%>

	<div class="container">
		<H1>Welcome!</H1>
		
		
		
		<table class="table table-striped">
			<caption>Your todo list is:</caption>
			<thead>
			<th>Description</th>
			<th>Category</th>
			<th>Actions</th>
			</thead>
			<tbody>
				<c:forEach items="${todos}" var="todo">
					<tr>
						<td>${todo.name}</td>
						<td>${todo.category}</td>
						<td><a class="btn btn-danger" href="/delete-todo.do?deletetodo=${todo.name}&category=${todo.category}">Delete</a></td>
					</tr>
					
				</c:forEach>	
			</tbody>
		</table>
		
		<p>
			<font color="red">${errorMessage}</font>
		</p>
		<a class ="btn btn-success" href="/add-todo.do">Add new ToDo Item</a>
		
	</div>

<%@ include file="../common/footer.jspf" %>