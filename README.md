## Blackjack Project

### Overview
In this project I created a command-line Blackjack card game.

### Technologies Used
* Java
* Enums
* Interfaces
* Conditionals
* Abstraction
* Inheritance
* Encapsulation
* Polymorphism
* Object-Oriented Design

### How to Run
In order to run, you must have a version of Java 1.8 or later.
Run the BlackJackApp java file. This will pull from the other classes in the package.
Follow the prompts. The game will begin and allow you to choose three options from the menu. 
If you're dealt a value total of 21, your turn is over, 
otherwise, you can choose options until you decide you're satified with the cards in your hand or you bust 21. 
Once your turn is over, the dealer will run through their turn. 
The winner of the round is determined by who was closest to 21, or who didn't bust. 
After the round if over, you can continue playing another round by responding with 'Y' or discontinue by entering 'N' 
Voila, you're done!

### Lessons Learned
This was a great dive into understanding OOP concepts, but also a really good exercise in how to abstract ideas into classes. 
At the start, it was really easy to lose track of what part communicates with what. What certain classes did, and how they would interact with eachother. 
I had spent quite some time trying to plan out each class and what they would do, but it only made so much sense looking at it in concept. 
After spending sometime trying to hack together a working product, I ended up hitting a wall and had to rethink my approach. 
I was too focused on working multiple things at once, I hadn't made sure that the individual pieces were fleshed out completely. 
Taking a minute to narrow down my focus on one part of the puzzle really helped when trying to get all the pieces put together. 
Another area I spent some time troubleshooting was remembering the use of static classes when it came to setting up the player hands. 
When the game started, both the dealer and player would share the same hand.
Since the dealer and player both create instances of BlackjackHand, I figured they would create their own List object when they were instantiated. 
I didn't realize that I had set that field to static when initially creating the class, so everytime one player added a card to their hand, the other player would add the same one. 
I had to remember that Static fields are shared among instances of the class, since they will all point to the same location in memory.
Halfway through the project, I realized I had severely limited my program by basically building all of my methods and game logic of the program inside the player class. 
Not terrible at first, but small problems started to cascade as I tried to adjust the program or introduce any new features. 
The final piece was getting the game logic to work properly. That was a challenge of its own, but actually really fun once running properly. I really would like to come back to this project to implement more features like soft aces, different rules, money tracking, game modes, and additional players.
