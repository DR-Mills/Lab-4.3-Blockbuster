# Lab-4.3-Blockbuster

Task: Create your own blockbuster video. Movies will come in 2 different formats: VHS and
DVD. The user should be able to rent a movie from a list of movies and watch it.
What will the application do?

● Create an abstract Movie class with the following:
○ A field for title that’s a string
○ An field for runTime (in minutes)
○ An array list of string called scenes
○ A method called printInfo() that prints all properties in the class to the
○ console except for the scenes.
○ A method called printScenes() that prints all the scenes in the list along with
their index.
○ An abstract method with no return type called play()

● Next Create a child class of Movie called VHS and code the following:
○ A field called currentTime this will start at 0 and match up with the indexes
of the arraylist of scenes
○ An override of play() that "plays" (prints out) the scene at the current time
and then increments currentTime. If currentTime is greater than the max
index of the array list, call rewind()
○ A method called rewind() that returns nothing and sets currentTime to 0.

● Create a child of Movie named DVD with the following code:
○ An override play() that takes no parameters, is void, and will ask the user
what scene they’d like to watch, print all the available scenes, and allow the
user to select a scene from the list and print it out.

● Next in main create an array list called movies and allow the user to select and play
a movie by index. The array list at minimum needs 3 VHS and 3 DVDs.

● Write JUnit tests
○ Test that a new instance of DVD can be created. Test that title and runTime
are set correctly.
○ Test that a new instance of VHS can be created. Test that title and runTime
are set correctly and currentTime is set to 0.
○ Test the play() method of VHS. Just check that it increments currentTime.
○ Test the rewind() method of VHS. Just check that it sets currentTime to 0.
○ Extended challenge: Test that play() returns to 0 after currentTime reaches
the last scene.
○ (Note: We will not test console input or output.)
