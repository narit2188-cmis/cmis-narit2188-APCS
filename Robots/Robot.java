import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public abstract class Robot extends Actor
{
    private boolean moved;
    private boolean stuck;
    private GreenfootImage img;
    private int oldX = -1, oldY = -1;
    private final int[] data;
    private boolean canSetLocation = true;

    public Robot(Color color){
        data = new int[10];
        moved = false;
        stuck = false;
        img = new GreenfootImage(5,5);
        img.setColor(color);
        img.fill();
        setImage(img);
        init();
    }
    
    /**
     * Method that sequences behavior of robot.
     */
    public abstract void behave(); //Your Robot subclass must implement this.
    
    /**
     * Initialize the robot.
     */
    public abstract void init();
    
    /**
     * Moves robot 1 to the right if it has not moved yet.
     */
    public final void right(){
        if(!moved){
            super.setLocation(getX() + 1, getY());
            moved = true;
        }
    }
    
    /**
     * Moves robot 1 to the left if it has not moved yet.
     */
    public final void left(){
        if(!moved){
            super.setLocation(getX() - 1, getY());
            moved = true;
        }
    }
    
    /**
    * Moves robot 1 to the up if it has not moved yet.
    */
    public final void up(){
        if(!moved){
            super.setLocation(getX(), getY() - 1);
            moved = true;
        }
    }

    
    /**
    * Moves robot 1 to the down if it has not moved yet.
    */
    public final void down(){
        if(!moved){
            super.setLocation(getX(), getY() + 1);
            moved = true;
        }
    }
    
    /**
     * @return true if there is no obstacle on the left; false if there is
     */
    public final boolean isClearLeft(){
        return getOneObjectAtOffset(-1, 0, Barrier.class) == null;
    }

    /**
     * @return true if there is no obstacle on the right; false if there is
     */
    public final boolean isClearRight(){
        return getOneObjectAtOffset(1, 0, Barrier.class) == null;
    }

    /**
     * @return true if there is no obstacle up; false if there is
     */
    public final boolean isClearUp(){
        return getOneObjectAtOffset(0, -1, Barrier.class) == null;
    }

    /**
     * @return true if there is no obstacle down; false if there is
     */
    public final boolean isClearDown(){
        return getOneObjectAtOffset(0, 1, Barrier.class) == null;
    }

    /**
     * @return the x coordinate of the square the robot was on the previous round. 
     */
    public final int getOldX(){
        return oldX;
    }

    /**
     * @return the y coordinate of the square the robot was on the previous round. 
     */
    public final int getOldY(){
        return oldY;
    }

    /**
     * Store the int value at index idx in the data array.
     * @param idx the index of the array 
     * @param value the value to store in the array
     */
    public final void setData(int idx, int value){
        data[idx] = value;
    }
    
    /**
     * Set a new value for the data array
     * @param newData the array that will replace the current data array
     */
    public final void setData(int[] newData){
        if(newData.length == data.length){
            for(int i = 0; i < data.length; i++){
                data[i] = newData[i];
            }
        }else{
            throw(new RuntimeException("int[] newData must have length of exactly " + data.length + "."));
        }
    }

    /**
     * Get ten entire data array.
     * @return data
     */
    public final int[] getData(){
        return data;
    }

    /**
     * Get value at idx from data array
     * @param idx The index of the value to return
     * @return data[idx]
     */
    public final int getData(int idx){
        return data[idx];
    }
    
    /**
    * @return true if robot hasn't moved; false if it has
    */
    public final boolean isStuck(){
        
        return stuck;
    }

    /**
     * The main loop. called once per turn.
     */
    public final void act() 
    {   
        moved = false;
        oldX = getX();
        oldY = getY();
        behave(); //Abstract method implemented in subclass.

        if(isTouching(Barrier.class)){
            super.setLocation(oldX, oldY);
        }
        stuck = false;
        if(oldX == getX() && oldY == getY()){
            stuck = true;
        }

        if(isTouching(Goal.class)){
            MyWorld w = (MyWorld) getWorld();
            w.finishRound(this);
        }
    }    

    protected final void addedToWorld(World w){
        canSetLocation = false;
    }

    public final void setLocation(int x, int y){
        /* Deactivated */
        if(!canSetLocation)
            throw(new RuntimeException("Classes that extend Robot cannot call setLocation();"));      
    }

}
