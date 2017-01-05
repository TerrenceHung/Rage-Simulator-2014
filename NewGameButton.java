import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Button clicked to load the level the user was on before they close the game
 * 
 * @author Jason Fok
 * @version June 2014
 */
public class NewGameButton extends Actor
{
    /**
     * Changes size of the New Game Button depending whether or not the mouse is on it.
     */
    public void changeSize()
    {
        //if mouse is on the play button, make it bigger
        if(Greenfoot.mouseMoved(this))
            setImage("NewGameBigger.png");
        //if mouse is on the background, return play button to regular size
        else if(Greenfoot.mouseMoved(getWorld()))
            setImage("NewGame.png");
    }
}
