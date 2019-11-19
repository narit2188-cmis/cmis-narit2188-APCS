import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class NaritoBot2 extends Robot
{
    public NaritoBot2(){
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
        int increment = getData(0);
        System.out.print(increment); 
        if (increment < 1) {
            right();
            if (!isClearRight()){
                setData(0, increment+1);
            }
        }
        else if (increment < 2) {
            left();
            if (!isClearLeft()){
                setData(0, increment+1);
            }
        }
        else if (increment < 4) {
            double random = Math.random();
            if (random < 0.5){
            down();
            if (!isClearDown()){
                setData(0, increment+1);
            }}
            else {
            up();
            if (!isClearUp()){
                setData(0, increment+1);
            }}
        }
        else if (increment < 5) {
            right();
            if (!isClearUp()){
                setData(0, increment+1);
            }
        }
        else {
            setData (0,0);
        }
    }
}
