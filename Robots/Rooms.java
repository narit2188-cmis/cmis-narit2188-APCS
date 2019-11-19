import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.reflect.*;
public class Rooms extends World
{
    Class[] robotClasses = new Class[]{NaritoBot2.class};
    private double pctBlocks = 0.01;
    private int rounds = 0;
    public Rooms() throws NoSuchMethodException
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        //super(160, 40, 7);
        super(Greenfoot.getRandomNumber(40)+40, Greenfoot.getRandomNumber(40)+40, 7); 
        setPaintOrder(Robot.class, Goal.class, Barrier.class);
        init();
    }

    public void init(){
        removeObjects(getObjects(null));
        showText("", getWidth()/2,getHeight()/2);
        initLevel3();
         // wall();
    }

    public void wall(){
        initBoard();
        //addWall(10, 0, 60);
        addWall(60, 0, 60);
    }

    public void initBoard(){
        addBorder();
        addRobots();
    }

    public void finishRound(Robot winner){
        showText(winner.getClass().getName() + " wins!!", getWidth()/2,getHeight()/2);
        Greenfoot.delay(100);
        rounds++;
        init();
    }

    public void initLevel1(){
        initBoard();
        addEndZone();
    }

    public void initLevel2(){
        initBoard();
        addEndZone();
        addBlocks(pctBlocks);
        pctBlocks += 0.01;

    }

    public void initLevel3(){
        initBoard();
        int roomD = 10;
        int r1x = 5 + Greenfoot.getRandomNumber((getWidth()/2) - 20);
        int r1y = 5 + Greenfoot.getRandomNumber(getHeight() - 20) ;
        int r2x = 5 + Greenfoot.getRandomNumber((getWidth()/2)) + getWidth()/2 - 20;
        int r2y = 5 + Greenfoot.getRandomNumber(getHeight() - 20);
        
        if(Math.random() > 0.5){
            int temp = r1x;
            r1x = r2x;
            r2x = temp;
        }
        addRoom(r1x, r1y, roomD, roomD);
        addRoom(r2x, r2y, roomD, roomD);
        int gx = r1x + 1 + Greenfoot.getRandomNumber(roomD - 1);
        int gy = r1y + 1 + Greenfoot.getRandomNumber(roomD - 1);
        addGoal(gx, gy, 1, 1);

    }

    public void addRoom(int x, int y, int w, int h){
        for(int bx = x; bx <= x+w; bx++){
            for(int by = y; by <= y+h; by++){
                if((bx == x || bx == x + w) ||(by == y || by == y + h)){
                    addObject(new Barrier(), bx, by);
                }

            }
        }
        int side = Greenfoot.getRandomNumber(4);
        switch(side){
            case 0:
            removeObjects(getObjectsAt(x+(w/2), y, Barrier.class));
            break;
            case 1:
            removeObjects(getObjectsAt(x+(w/2), y+h, Barrier.class));
            break;
            case 2:
            removeObjects(getObjectsAt(x, y+(h/2), Barrier.class));
            break;
            case 3:
            removeObjects(getObjectsAt(x+w, y+(h/2), Barrier.class));
            break;

        }

    }

     public void addRobots(){   
        int added = 0;
        Class[] robots = robotClasses.clone();
        int x = 1, y = 4 + (Greenfoot.getRandomNumber(getHeight()) - 3);
        int side = Greenfoot.getRandomNumber(4);
        switch(side){
            case 0:
            x = 1;
            y = 1 + Greenfoot.getRandomNumber(getHeight() - 3);
            break;
            case 1:
            x = 1 +  Greenfoot.getRandomNumber(getWidth() - 3);
            y = 1;
            break;
            case 2:
            x = getWidth() - 2;
            y = 1 + Greenfoot.getRandomNumber(getHeight() - 3);
            break;
            case 3:
            x = 1 +  Greenfoot.getRandomNumber(getWidth() - 3);
            y = getHeight() - 2;
            break;
        }
        System.out.println(side + ":" + x + " " + y);
        while(added < robots.length){
            Class cls = null;
            int idx = 0;
            while(cls == null){
                idx = (int)(Math.random() * robots.length);    
                cls = robots[idx];
            }

            robots[idx] = null;
            try{
                addObject((Robot)cls.newInstance(),  x, y);
                added++;
            }catch(Exception e){
                System.err.println("Bad class");
            }
        }   
    }

    public void addBorder(){
        for(int x = 0; x < getWidth(); x++){
            addObject(new Barrier(), x, 0);
            addObject(new Barrier(), x, getHeight() - 1);
        }
        for(int y = 0; y < getHeight(); y++){
            addObject(new Barrier(), 0, y);
            addObject(new Barrier(), getWidth() - 1, y);
        }      
    }

    public void addBlocks(double density){
        for(int x = 5; x < getWidth(); x++){
            for(int y = 0; y < getHeight(); y++){
                if(Math.random() < density){
                    addObject(new Barrier(), x, y);
                }
            }
        }
    }

    public void addEndZone(){
        addGoal(getWidth() - 2, 1, 1, getHeight()-2);
    }

    public void addGoal(int sx, int sy, int w, int h){
        for(int x = sx; x < sx+w; x++){
            for(int y = sy; y < sy+h; y++){
                addObject(new Goal(), x, y);
            }
        }

    }

    public void addWall(int x, int wy, int h){
        for(int y = wy; y < wy+h; y++){
            addObject(new Barrier(), x, y);
        }

    }

    public void act(){
        showText(""+rounds, 2,2);
    }
}