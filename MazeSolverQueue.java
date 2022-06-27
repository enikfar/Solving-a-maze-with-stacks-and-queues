package lab3;

public class MazeSolverQueue extends MazeSolver {
	MyQueue<Square> worklist;

    public MazeSolverQueue(Maze maze) {
        super(maze);
        worklist = new MyQueue<Square>();
        Square current = maze.getStart();
        current.mark();
        add(current);
        // TODO Auto-generated constructor stub
    }

    @Override
	public
    void makeEmpty() {
    	worklist = new MyQueue<Square>();
        // TODO Auto-generated method stub

    }

    @Override
	public
    boolean isEmpty() {
        // TODO Auto-generated method stub
    	if(worklist.size() == 0)
            return true;
        return false;
    }

    @Override
	public
    void add(Square sq) {
    	worklist.enqueue(sq);
        // TODO Auto-generated method stub

    }

    @Override
	public
    Square next() {
        // TODO Auto-generated method stub
        return worklist.dequeue();
    }

	@Override
	public Square remove() {
		// TODO Auto-generated method stub
		 return null;
	}

	

	
	

}
