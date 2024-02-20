//package app;
//import javax.swing.*;
//import java.util.*;
//
//public class SocialNetworkGraph extends JFrame {
//    private Map<Integer, Set<Integer>> adjacencyList;
//
//    public SocialNetworkGraph() {
//        adjacencyList = new HashMap<>();
//    }
//
//    // Add a user to the graph
//    public void addUser(int userId) {
//        if (!adjacencyList.containsKey(userId)) {
//            adjacencyList.put(userId, new HashSet<>());
//        }
//    }
//
//    // Add an interaction between two users
//    public void addInteraction(int user1Id, int user2Id) {
//        // Add user1 to user2's adjacency list
//        adjacencyList.computeIfAbsent(user2Id, k -> new HashSet<>()).add(user1Id);
//        // Add user2 to user1's adjacency list
//        adjacencyList.computeIfAbsent(user1Id, k -> new HashSet<>()).add(user2Id);
//    }
//
//    // Get the adjacency list for a user
//    public Set<Integer> getInteractions(int userId) {
//        return adjacencyList.getOrDefault(userId, new HashSet<>());
//    }
//
//    // Display the graph
//    public void display() {
//        JTextArea textArea = new JTextArea();
//        for (Map.Entry<Integer, Set<Integer>> entry : adjacencyList.entrySet()) {
//            int userId = entry.getKey();
//            Set<Integer> interactions = entry.getValue();
//            textArea.append("User " + userId + " interacts with: ");
//            for (int interaction : interactions) {
//                textArea.append(interaction + " ");
//            }
//            textArea.append("\n");
//        }
//        JScrollPane scrollPane = new JScrollPane(textArea);
//        add(scrollPane);
//        
//        setSize(400, 300);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setLocationRelativeTo(null);
//        setVisible(true);
//    }
//
//    // Test the graph implementation
//    public static void main(String[] args) {
//        SocialNetworkGraph graph = new SocialNetworkGraph();
//        graph.addUser(1);
//        graph.addUser(2);
//        graph.addUser(3);
//        graph.addInteraction(1, 2);
//        graph.addInteraction(1, 3);
//        graph.addInteraction(2, 3);
//        graph.display();
//    }
//}
