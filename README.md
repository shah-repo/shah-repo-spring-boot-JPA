# spring-boot-JPA
Assignement of spring boot with JPA

we can also extends CrudRepository instead of JpaRepository in StudentRepo class, but we will have to make some changes in service class as  
	
	public List<Student> getStudentList() {
		ArrayList<Student> studentList = new ArrayList<Student>();
		repo.findAll()
		.forEach(studentList::add);
		 return studentList;
	}
becaus here repo.findAll() returns a iterator not a list.
