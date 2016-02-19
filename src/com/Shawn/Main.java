package com.Shawn;

public class Main {

    public static void main(String[] args) {
	// practice git program with OOP

        NewGitPractClass t_Rex = new NewGitPractClass();
        NewGitPractClass velociraptor = new NewGitPractClass();
        NewGitPractClass mander = new NewGitPractClass();

        t_Rex.roar(); //this calls the class and the sub function of that class.
        velociraptor.sup(); //this is another example of calling the class and pulling a new sub function.
        mander.reh();
        mander.sup();
        velociraptor.roar();
    }
}
