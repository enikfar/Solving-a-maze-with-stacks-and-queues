package lab3;

import java.util.*;

abstract class MazeSolver {
    protected Maze maze;
    protected boolean finished = false;
    protected boolean pathFound = false;
    protected MyStack<Square> stack;


    MazeSolver(Maze maze) {
        this.maze = maze;
        

    }

    // creates an empty worklist
    abstract void makeEmpty();

    // tests if the worklist is empty
    abstract boolean isEmpty();

    // adds a squaren to the worklist
    abstract void add(Square sq);

    // removes the next element from the worklist and returns it
    abstract Square next();

    public boolean isFinished() {

    		 return finished;
    		 
    		 
    	 
		
    	 
    }

    public boolean pathFound() {
        return pathFound;
    }

    
    public List<Square> getPath() {
        // TODO: write the getPath method
    	ArrayList<Square>path = new ArrayList<Square>( );
    	 stack = new MyStack<Square>();
    	Square s = maze.getExit();
    	
    	while(s!=null) {
    		stack.push(s);
    		s.setOnPath();
    		s = s.getPrevious();}
    		
    	
		while (!stack.isEmpty()) {
			Square t = stack.pop();
			path.add(t);
		}
		
			
			
		
		return path;
		
    }

    /* performs one step of the maze solver algorithm */
    public void step() {
    	if(this.isEmpty()){//if the worklist is empty, stop.
            this.finished = true;
            this.isEmpty();
            return;}
        Square next = this.next(); //gets the next square
        if(next == maze.getExit()){//if the next element in the worklist is the endpoint, stop
        	
        	
//            return next;
        	this.finished =true;
        	this.pathFound = true;}
        if(next != null){
            for(Square neighbor : maze.getNeighbors(next))//gets the next squares neighbors
            {
            	
            

            	
            	
            	
            	
            	
            	
            	
                //sets the previous square for neighbor equal to the original 'next' Square variable
                 if(neighbor.getType() != Square.WALL && !neighbor.isMarked()) {
                	 neighbor.mark();
                	 
                	 
                	 neighbor.setPrevious(next);
                	
                	
                   
                     this.add(neighbor);//add the neighbor to the worklist 
                     }
                 
                
                
            }
//            
//        
//        // TODO: write the step method
//    }
}
		}}
