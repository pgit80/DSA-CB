# OOPS Notes
- Class
- `Class` is a blueprint. only a definition
- Class doesn't take any space

Class kaise banate hai->
Class me sabse phle data aur uski methods(properties) hote hai

Example class->

	class Student{
		// class data
	
		String name;
		int age;
	
		//class method
	
		public void introduce(){
			sout("my name is"+ name + " and age is" + age);
		}
	}

- Student s1 = new Student(); 
iss uper wali line ka meaning kya hai??

ab jb hm code run krenge to hamara JVM main method ko Stack me load krega.
lekin iske phle jispe class ki dependency hai un classes ka blueprint heap
memory me load krega as it is...

- kisi bhi LHS=RHS wali line me phle RHS wali line run hoti hai

- During Debug
	- `Step Over` means we want to run that line directly <br>
	- - `Step Into` means we want to dive into line while running
- This is a keyword which stores address of the current object in heap