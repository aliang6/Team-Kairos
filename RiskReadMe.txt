We are creating the board game Risk.

We have four main classes: Cards, Territory, Player, and Play.

The Card class defines what a card is. 
It has the instance variables isUsed, newArmies, and name.
The airSupport, groundSupport, and navySupport class extend the Card class each with varying effects such as giving more troops.

The Territory class defines what a territory is. 
It contains the instance variables terrName (what the territory is called), owner (who owns the territory, neutral or * by default), armytotal (how many troops are occupying the territory), and nearby (a String array taken from the Nearby class that shows what other territories are around the territory). 
It contains a default constructor, overloaded constructor which allows for the owner to be change, and a few modifier and accessor methods. We also modified the toString and created the display function to change the values on the map in a way that would preserve its shape by keeping it always at 4 spaces.

The Player class defines what a player is.
It contains many instance variables among which include symbol (insignia of the player), armytotal (troops given to deployment), turns, winner, the continents (whether they’re captured or not and, as a result, whether they’ll receive the army bonus), and an ArrayList for owned territories and cards.
It contains a default constructor and an overloaded constructor that accepts an integer input for the player number. It contains accessor methods, modifier methods, and the functions armyUpdate, doIhave (checks whether the player contains a territory), doIhaveCard (checks whether a player has a card), and whatDoIown (returns all territories owned by the player).

The Play Class is the driver class the runs the game.
It first initializes all the cards, territories, map, and players. It then gives the players certain territories to start. The entire game is looped by a while loop that checks to see if either player has all the territories. Each player is given troops to deploy at the beginning of his turn. After deployment, he is given the option to either transfer his troops to another one of the nearby territories that he owns or to attempt conquering a nearby territory that he doesn’t own. We have checks throughout to see the status and ownership of each territory. We allow them to pick the territory to transfer or conquer and use a certain amount of troops from the original territory to transfer or aid in conquering. If they choose to conquer, we show a graph with statistics to show the chances of conquering the territory. This is the statGraph function. If they choose to continue the battle, we use our battle function and commence with the battle. If they conquer the territory, it gets added to the player ArrayList. If they don’t, they lose their armies. All values on the map are updated and the second player goes. 
