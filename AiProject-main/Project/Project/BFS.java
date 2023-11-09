import java.util.Queue;
import java.util.LinkedList;

public class BFS {
    public static void BFSFunction(){
        String [] operators;

        String [] operatorsWithOUTWait={"RequestFood","RequestMaterial",
                                        "RequestEnergy","Build1","Build2"};

        String [] build1build2={"Build1","Build2"};                               
        // get the initial state of the problem
        System.out.println(LLAPSearch.getLLAPInitialState());
        
        
        
        //create new node to start with it
        //another note the operator is the applied operator to produce this node
        //so at the begining null 
        State initialState = new State();
        Node nodeInitial = new Node(initialState, 
                                    null, null, 
                                    0, 0 , false , false , false,0);
        // System.out.println(nodeInitial.getState().getProsperity());
        Queue<Node> queueLevelNodes=new LinkedList<Node>();
        queueLevelNodes.add(nodeInitial);

        
        Node currentNodeInitial = queueLevelNodes.poll();
        String [] theNextOperationsInitial= InitialOperators(nodeInitial);
        nodeInitial.setDepth(nodeInitial.getDepth() + 1);
        for (String operator : theNextOperationsInitial) {
                    Node nodeChild = null;
                    State newState = new State();
                    nodeChild = new Node(newState, 
                                    nodeInitial, operator, 
                                    nodeInitial.getDepth(), 0 , false , false , false,0);              
                    queueLevelNodes.add(nodeChild);
        }

        while (!queueLevelNodes.isEmpty()) {
                 Node currentNode = queueLevelNodes.remove();
                if(currentNode.getState().getProsperity()<=100){
                    String [] theNextOperations= getOperators(currentNode);
                    String [] DelayOperations= getDelayOperators(currentNode);
                    String applicableOperator = currentNode.getOperator();
                    applyOperator(currentNode, applicableOperator);
                    System.out.println(currentNode.printNodeAsString());
                    if(currentNode.getTimeofdelay()==0){
                        if(currentNode.getinvalidAction()==0){
                            for (String operator : theNextOperations) {
                                System.out.println(operator);
                                Node nodeChild = new Node(currentNode.getState(), 
                                                currentNode, operator,  
                                                currentNode.getDepth(), 0,currentNode.getFoodDelay(),currentNode.getMaterialsDelay(),currentNode.getEnergyDelay(),currentNode.getTimeofdelay() );  
                                nodeChild.setDepth(nodeChild.getDepth()+1);            
                                queueLevelNodes.add(nodeChild);
                     }
                    }
                    } else{
                        if(currentNode.getinvalidAction()==0){
                            for (String operator : DelayOperations) {
                                System.out.println(operator);
                                Node nodeChild = new Node(currentNode.getState(), 
                                                currentNode, operator,  
                                                currentNode.getDepth(), 0,currentNode.getFoodDelay(),currentNode.getMaterialsDelay(),currentNode.getEnergyDelay(),currentNode.getTimeofdelay() );  
                                nodeChild.setDepth(nodeChild.getDepth()+1);            
                                queueLevelNodes.add(nodeChild);                        
                    }
                }
        }
    } else{
            System.out.println("Final"+currentNode.printNodeAsString());
            break;
        }
        }
    
        // while (!queueLevelNodes.isEmpty()) {
        //     Node currentNode = queueLevelNodes.poll();
        //     String [] theNextOperations= getOperators(currentNode);
        //     String applicableOperator = currentNode.getOperator();
        //     applyOperator(currentNode, applicableOperator);                
        // }

        //node (50 , initialNode , requestFood , 1 ,0 )//node (50 , initialNode , requestMaterial , 1 ,0 )//node (50 , initialNode , requestEnergy , 1 ,0 )//node (50 , initialNode , build1 , 1 ,0 )//node (50 , initialNode , build2 , 1 ,0 )
        // System.out.println(nodeInitial.printNodeAsString());                         
        


    }

    public static void expand(Node node ){
    
    }

    public static void applyOperator(Node node ,String operator){
        if(operator.equals("RequestFood")){
 
            Operators.RequestFood(node);
 
        }else if(operator.equals("RequestMaterial")){
            Operators.RequestMaterials(node);
        }else if(operator.equals("RequestEnergy")){
            Operators.RequestEnergy(node);
        }else if(operator.equals("Wait")){
            Operators.WAIT(node);
        }else if(operator.equals("Build1")){
            Operators.BUILD1(node);
        }else if(operator.equals("Build2")){
            Operators.BUILD2(node);
        }else{
        }

    }


    public static String[] getOperators(Node node){
        String [] operators={};
             operators=new String[]{"RequestFood","RequestMaterial",
                                        "RequestEnergy","Wait","Build1","Build2"};

    
        return operators;

    }
    public static String[] InitialOperators(Node node){
        String [] operators={};
             operators=new String[]{"RequestFood","RequestMaterial",
                                        "RequestEnergy","Build1","Build2"};

    
        return operators;

    }    
       public static String[] getDelayOperators(Node node){
        String [] operators={};
             operators=new String[]{"Wait","Build1","Build2"};

    
        return operators;

    }

    // public static bfs(graph, start, goal){
    //     Queue<Node> visited= null;



    // }
}
