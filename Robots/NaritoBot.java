import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class NaritoBot extends Robot
{
    public NaritoBot(){
        super(Color.MAGENTA); //You can change the color
        //Color.RED, Color.BLUE, Color.GREEN, 
        //Color.YELLOW, Color.CYAN, Color.MAGENTA
    }
    
    public void init(){
        
    }
    
    /**
     * <p>
     * What your robot can do <em>once</em> per round:
     * </p>
     * <ul>
     * <li>right() => move 1 to the right</li>
     * <li>left() => move 1 to the left</li>
     * <li>up() => move 1 up</li>
     * <li>down() => move 1 down</li>
     * </ul>
     * <p>
     * What your robot can do <em<any number of times</em> per round:
     * </p>
     * <ul>
     * <li>isClearRight() => returns true if no block to the right</li>
     * <li>isClearLeft() => returns true if no block to the left</li>
     * <li>isClearUp() => returns true if no block up</li>
     * <li>isClearDown() => returns true if no block down</li>
     * <li>isStuck() => returns true if Robot hasn't change position</li>
     * <li>getData(int idx) => get a value from the array (there are 10 slots)</li>
     * <li>setData(int idx, int value) => replace a value in the array (there are 10 slots)</li>
     * </ul>
     */
    public void behave(){
        int one = getData(1); 
        if (isClearRight()) {
            setData (one, one); 
            one -= 1; 
            setData (1,one);  
            right();
        }
        
        else if (!isClearRight()){
            one += 1; 
            setData (1, one); 
            double rando = Math.random();
            if (rando < 0.33) {
                down();
            }
            else if (rando < 0.66){
                up();
            }
            else {
                left(); 
            }
        }
        else {
            left(); 
        }
    }
    }  
