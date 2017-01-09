class Me 
{
	public static void main(String[] args) 
	{
		Person student = new Person();
		Person instructor = new Person("Jim","Lawaich",65,1);
		System.out.println("My First Name is "+student.getForename());
		System.out.println("My Last Name is "+student.getSurname());
		System.out.println("I am a "+student.getGenderString());
		System.out.println("My age is "+student.getAge());
		System.out.println("My First Name is "+instructor.getForename());
		System.out.println("My Last Name is "+instructor.getSurname());
		System.out.println("I am a "+instructor.getGenderString());
		System.out.println("My age is "+instructor.getAge());

	}
}
