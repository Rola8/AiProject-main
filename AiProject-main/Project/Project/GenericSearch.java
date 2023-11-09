import java.util.Queue;
import java.util.LinkedList;



public class GenericSearch {
    private Queue<Node> queue;
    private String[] operators; // Set of available operators or actions[RequestFood,RequestMaterials, ...,Build2]
    private String initialState; // Initial state as a string
    private int goalState; // Goal state
    private int pathCost; // Total path cost

    public GenericSearch(Queue<Node> queue, String[] operators, String initialState, int goalState ) {
        this.queue = queue;
        this.operators = operators;
        this.initialState = initialState;
        this.goalState = goalState;
        pathCost = 0;
    }

    public GenericSearch() {
        queue = new LinkedList<>();
    }

    public Queue<Node> getQueue() {
        return queue;
    }

    public void setQueue(Queue<Node> queue) {
        this.queue = queue;
    }

    public String[] getOperators() {
        return operators;
    }

    public void setOperators(String[] operators) {
        this.operators = operators;
    }

    public String getInitialState() {
        return initialState;
    }

    public void setInitialState(String initialState) {
        this.initialState = initialState;
    }

    public int getGoalState() {
        return goalState;
    }

    public void setGoalState(int goalState) {
        this.goalState = goalState;
    }

    public int getPathCost() {
        return pathCost;
    }

    public void setPathCost(int pathCost) {
        this.pathCost = pathCost;
    }

    public static void main(String[] args) {
        String inputInitialState = "50;" +
                "22,22,22;" +
                "50,60,70;" +
                "30,2;" +
                "19,1;" +
                "15,1;" +
                "300,5,7,3,20;" +
                "500,8,6,3,40;";
        GenericSearch search = new GenericSearch(null, null, inputInitialState, 100);
        String result = LLAPSearch.solve(inputInitialState, "BFS", true);
        // System.out.println(result);


    }
}

