package app;

import app.Login;
import javax.swing.*;
import java.awt.*;

import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class TiktokForm extends javax.swing.JFrame {
// Database connection details
    private static final String DB_URL = "jdbc:mysql://localhost:3306/trackhub";
    private static final String USER = "root"; 
    private static final String PASSWORD = "12345";
 
    // User ID of the logged-in user
    private int loggedInUserId;
    //database connection
    private Connection connection;

    // Constructor
    public TiktokForm(int loggedInUserId) {
        super("Social Media App");
        initComponents();
        
         // Initialize logged-in user ID
    this.loggedInUserId = loggedInUserId;

     // Establish database connection
    try {
        connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Failed to connect to the database.", "Error", JOptionPane.ERROR_MESSAGE);
        System.exit(1);
    }
            // Setting up UI layout and components
        getContentPane().setLayout(new BorderLayout());

        getContentPane().add(panel, BorderLayout.SOUTH);
        getContentPane().add(interactionPanel, BorderLayout.NORTH);
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        
          // Display recommendations and content
        displayOtherUsersRecommendations();
          displayComments();
          displayUserContent(loggedInUserId);
    }

     // Method to upload content to the database of posts table
private void uploadContent(int userId, String content) {
    try {
        String query = "INSERT INTO posts (user_id, content) VALUES (?, ?)";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, userId);
        statement.setString(2, content);
        statement.executeUpdate();
        statement.close();
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Failed to upload content to the database.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

      // Method to fetch content from the database
    private String fetchContent() {
        String content = null;
        try {
            String query = "SELECT content FROM posts WHERE user_id = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, loggedInUserId);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                content = resultSet.getString("content");
            } else {
                content = JOptionPane.showInputDialog(null, "Enter content:");
            }
            resultSet.close();
            statement.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Failed to fetch content from the database.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return content;
    }
    
    //method to insert data in database in comments table
    private void commentOnContent(int contentId, String comment) {
        try {
            String insertQuery = "INSERT INTO comments (user_id, content) VALUES (?, ?)";
            PreparedStatement insertStatement = connection.prepareStatement(insertQuery);
            insertStatement.setInt(1, loggedInUserId);
            insertStatement.setString(2, comment);
            insertStatement.executeUpdate();
            insertStatement.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Failed to add comment.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
   
    //methods to display comments in the UI
private void displayComments() {
        String comments = fetchComments();
        if (comments != null && !comments.isEmpty()) {
            contentTextArea.append(comments + "\n");
        }
    }
  // Method to fetch comments from the database
private String fetchComments() {
    StringBuilder comments = new StringBuilder();
    try {
        String query = "SELECT content FROM comments WHERE user_id = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, loggedInUserId);
        ResultSet resultSet = statement.executeQuery();
        contentTextArea.append("\n");
   contentTextArea.append("User " + loggedInUserId + "'s Comments:\n");
        while (resultSet.next()) {
            String comment = resultSet.getString("content");
            comments.append(comment).append("\n");
        }
        resultSet.close();
        statement.close();
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Failed to fetch content from the database.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    return comments.toString();
}

 // Method to display user content in the UI
    private void displayUserContent(int userId) {
    try {
        String query = "SELECT content FROM posts WHERE user_id = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, userId);
        ResultSet resultSet = statement.executeQuery();

        contentTextArea.append("User" + userId + "'s Content:\n");

       while (resultSet.next()) {
    String content = resultSet.getString("content");
 
    contentTextArea.append(content); 
    contentTextArea.append("\n");
}
        resultSet.close();
        statement.close();
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Failed to fetch content from the database.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    
     // Method to follow a user and save that data in database.
private void followUser(int followerId, int followedId) {
    try {
        
        String query = "INSERT INTO follows (follower_id, followed_id) VALUES (?, ?)";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, followerId);
        statement.setInt(2, followedId);
        statement.executeUpdate();
        statement.close();
        JOptionPane.showMessageDialog(null, "You are now following the recommended user.", "Follow Success", JOptionPane.INFORMATION_MESSAGE);
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Already followed the recommended User", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    // Method to get the user ID from the database
     private static int getUserId() {
        int userId = 0;
        String sql = "SELECT user_id FROM registerdsa WHERE firstName = ? AND lastName = ?";
        
        try (Connection connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
             PreparedStatement pstmt = connection.prepareStatement(sql)) {
          
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    userId = rs.getInt("user_id");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return userId;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        interactionPanel = new javax.swing.JPanel();
        SearchBtn = new javax.swing.JButton();
        SearchField = new javax.swing.JTextField();
        uploadButton = new javax.swing.JButton();
        panel = new javax.swing.JPanel();
        commentButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        OtherUsers = new javax.swing.JTextArea();
        FollowRecommended = new javax.swing.JButton();
        scrollPane = new javax.swing.JScrollPane();
        contentTextArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        contentText = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        interactionPanel.setBackground(new java.awt.Color(204, 204, 255));

        SearchBtn.setBackground(new java.awt.Color(51, 51, 255));
        SearchBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        SearchBtn.setForeground(new java.awt.Color(255, 255, 255));
        SearchBtn.setText("Search");
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });

        SearchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchFieldActionPerformed(evt);
            }
        });

        uploadButton.setBackground(new java.awt.Color(51, 51, 255));
        uploadButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        uploadButton.setForeground(new java.awt.Color(255, 255, 255));
        uploadButton.setText("Upload");
        uploadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout interactionPanelLayout = new javax.swing.GroupLayout(interactionPanel);
        interactionPanel.setLayout(interactionPanelLayout);
        interactionPanelLayout.setHorizontalGroup(
            interactionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, interactionPanelLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(uploadButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(SearchBtn)
                .addGap(401, 401, 401))
        );
        interactionPanelLayout.setVerticalGroup(
            interactionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(interactionPanelLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addGroup(interactionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uploadButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SearchBtn))
                .addContainerGap())
        );

        panel.setBackground(new java.awt.Color(204, 204, 255));

        commentButton.setBackground(new java.awt.Color(51, 51, 255));
        commentButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        commentButton.setForeground(new java.awt.Color(255, 255, 255));
        commentButton.setText("Comment");
        commentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commentButtonActionPerformed(evt);
            }
        });

        OtherUsers.setColumns(20);
        OtherUsers.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        OtherUsers.setRows(5);
        OtherUsers.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                OtherUsersAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(OtherUsers);

        FollowRecommended.setBackground(new java.awt.Color(51, 51, 255));
        FollowRecommended.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        FollowRecommended.setForeground(new java.awt.Color(255, 255, 255));
        FollowRecommended.setText("Follow Recommended User");
        FollowRecommended.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FollowRecommendedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(commentButton)
                .addGap(313, 313, 313)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(FollowRecommended)
                .addContainerGap(303, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(FollowRecommended, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(commentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        contentTextArea.setColumns(20);
        contentTextArea.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        contentTextArea.setRows(5);
        scrollPane.setViewportView(contentTextArea);

        contentText.setColumns(20);
        contentText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        contentText.setRows(5);
        jScrollPane2.setViewportView(contentText);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1013, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE))
                    .addComponent(interactionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(interactionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
                    .addComponent(scrollPane))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Method to display name for recommendations of users for the currently logged-in user
    private int getRecommendedUserId() {
    int recommendedUserId = -1;
    try {
       
        String query = "SELECT user_id, firstName, lastName FROM registerdsa WHERE user_id != ? LIMIT 1";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, loggedInUserId);
        ResultSet resultSet = statement.executeQuery();

        StringBuilder recommendations = new StringBuilder();
        recommendations.append("Other Users' Recommendations:\n");

        if (resultSet.next()) {
            recommendedUserId = resultSet.getInt("user_id");
            String firstName = resultSet.getString("firstName");
            String lastName = resultSet.getString("lastName");
            recommendations.append("User ").append(recommendedUserId).append(": ").append(firstName).append(" ").append(lastName).append("\n");
        } else {
            recommendations.append("No other users found.\n");
        }
        OtherUsers.setText(recommendations.toString());
        resultSet.close();
        statement.close();
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Failed to fetch recommendations for other users.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    return recommendedUserId;
}

    private void OtherUsersAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_OtherUsersAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_OtherUsersAncestorAdded

    // Method for handlinge the action when the comment button is clicked
    private void commentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commentButtonActionPerformed
    // Prompt the user to enter a comment
              String newComment = JOptionPane.showInputDialog(null, "Enter your comment:");
                if (newComment != null && !newComment.isEmpty()) {
                 // Add the comment to the database and display it in the UI
                    commentOnContent(loggedInUserId, newComment);
             
                    String commentText = "User " + loggedInUserId + " commented:  " + newComment;
                    contentTextArea.append(commentText + "\n");
                }
    }//GEN-LAST:event_commentButtonActionPerformed
// Method for handling the action when the upload button is clicked
    private void uploadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadButtonActionPerformed
 // Prompt the user to enter content
         String content = fetchContent();     
            content = JOptionPane.showInputDialog(null, "Enter content:");      
        if (content != null && !content.isEmpty()) { 
              // Upload the content to the database and display it in the UI
            uploadContent(loggedInUserId, content);
  contentTextArea.append("User " + loggedInUserId + " posted"+"\n");
            contentTextArea.append(content + "\n");
         
        }
    }//GEN-LAST:event_uploadButtonActionPerformed
//handle the action when the search button is clicked
    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
 // Retrieve the search query from the search field
        String query = SearchField.getText().trim();
   // Search for users based on the query
        if (!query.isEmpty()) {
         
            searchUsers(query);
        } else {
        // Display a warning message if the search query is empty
            JOptionPane.showMessageDialog(null, "Please enter a search query.", "Empty Query", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_SearchBtnActionPerformed

    private void SearchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchFieldActionPerformed

    }//GEN-LAST:event_SearchFieldActionPerformed

    // Variable to track if content has been displayed for a recommended user
    private boolean contentDisplayed = false; 
    
    // Method to handle the action when the Follow Recommended button is clicked
    private void FollowRecommendedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FollowRecommendedActionPerformed
  // Retrieve the recommended user ID
        int recommendedUserId = getRecommendedUserId();

// Check if the logged-in user is already following the recommended user
    boolean isFollowing = isFollowingUser(loggedInUserId, recommendedUserId);
  // If already following, display the content of the recommended user
    if (isFollowing) {
        if (!contentDisplayed) {
       
            displayContentForUser(recommendedUserId);
            contentDisplayed = true; // Set the flag to true to indicate content is displayed
        }
    } else {
        // Follow the recommended user and then display content
        followUser(loggedInUserId, recommendedUserId);
        displayContentForUser(recommendedUserId);
        contentDisplayed = true; // Set the flag to true to indicate content is displayed
    }
    }//GEN-LAST:event_FollowRecommendedActionPerformed

    // Method to display content (comments and posts) for a specific user
    private void displayContentForUser(int userId) {
        
        // Fetch and display comments and posts for the specified user
    // This method is invoked when the user clicks the Follow Recommended button
    try {
        String commentsQuery = "SELECT content FROM comments WHERE user_id = ?";
        PreparedStatement commentsStatement = connection.prepareStatement(commentsQuery);
        commentsStatement.setInt(1, userId);
        ResultSet commentsResultSet = commentsStatement.executeQuery();
        StringBuilder content = new StringBuilder();
        content.append("User ").append(userId).append("'s Comments:\n");
        while (commentsResultSet.next()) {
            String comment = commentsResultSet.getString("content");
            content.append(comment).append("\n");
        }
        commentsResultSet.close();
        commentsStatement.close();
        String postsQuery = "SELECT content FROM posts WHERE user_id = ?";
        PreparedStatement postsStatement = connection.prepareStatement(postsQuery);
        postsStatement.setInt(1, userId);
        ResultSet postsResultSet = postsStatement.executeQuery();
        content.append("User ").append(userId).append("'s Posts:\n");
        while (postsResultSet.next()) {
            String post = postsResultSet.getString("content");
            content.append(post).append("\n");
        }
        postsResultSet.close();
        postsStatement.close();
        contentTextArea.append(content.toString());
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Failed to fetch content for the user.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}
// Method to check if the logged-in user is following a specific user
    private boolean isFollowingUser(int followerId, int followedId) {
    
        // Check if the logged-in user is following the specified user
    // Returns true if following, false otherwise
        boolean isFollowing = false;
    try {
        String query = "SELECT * FROM follows WHERE follower_id = ? AND followed_id = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, followerId);
        statement.setInt(2, followedId);
        ResultSet resultSet = statement.executeQuery();
        isFollowing = resultSet.next(); 
        resultSet.close();
        statement.close();
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Failed to check if you are following the recommended user.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    return isFollowing;
}
    // Method to search for users based on a query
    private void searchUsers(String query) {
        
        // Search for users whose first name or last name matches the query
    try {
        String searchQuery = "SELECT user_id, firstName, lastName FROM registerdsa WHERE firstName LIKE ? OR lastName LIKE ?";
        PreparedStatement statement = connection.prepareStatement(searchQuery);
        statement.setString(1, "%" + query + "%");
        statement.setString(2, "%" + query + "%");
        ResultSet resultSet = statement.executeQuery();
        StringBuilder searchResults = new StringBuilder();
        searchResults.append("Search Results for Users with Name: ").append(query).append("\n");

        while (resultSet.next()) {
            int userId = resultSet.getInt("user_id");
            String firstName = resultSet.getString("firstName");
            String lastName = resultSet.getString("lastName");
            searchResults.append("User ID: ").append(userId).append(", Name: ").append(firstName).append(" ").append(lastName).append("\n");
            appendCommentsForUser(userId);
        }
        if (searchResults.length() == 0) {
            searchResults.append("No results found.");
        }
        JOptionPane.showMessageDialog(null, searchResults.toString(), "User Search Results", JOptionPane.INFORMATION_MESSAGE);
        resultSet.close();
        statement.close();
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Failed to search for users.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}
    // Method to append comments and posts for a specific user in the search results
private void appendCommentsForUser(int userId) {
     // Append comments and posts for the specified user in the search results
   try {
        String commentsQuery = "SELECT content FROM comments WHERE user_id = ?";
        PreparedStatement commentsStatement = connection.prepareStatement(commentsQuery);
        commentsStatement.setInt(1, userId);
        ResultSet commentsResultSet = commentsStatement.executeQuery();
        StringBuilder content = new StringBuilder();
        content.append("User ").append(userId).append("'s Comments:\n");
      while (commentsResultSet.next()) {
            String comment = commentsResultSet.getString("content");
            content.append(comment).append("\n");
        }
        commentsResultSet.close();
        commentsStatement.close();
       String postsQuery = "SELECT content FROM posts WHERE user_id = ?";
        PreparedStatement postsStatement = connection.prepareStatement(postsQuery);
        postsStatement.setInt(1, userId);
        ResultSet postsResultSet = postsStatement.executeQuery();
        content.append("User ").append(userId).append("'s Posts:\n");
        while (postsResultSet.next()) {
            String post = postsResultSet.getString("content");
            content.append(post).append("\n");
        }
        postsResultSet.close();
        postsStatement.close();
        contentText.append(content.toString());
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Failed to fetch content for the user.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}
// Method to display recommendations for other users
     private void displayOtherUsersRecommendations() {
          // Display recommendations for other users (currently limited to one user)
    try {
        String query = "SELECT user_id, firstName, lastName FROM registerdsa WHERE user_id != ? LIMIT 1";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, loggedInUserId);
        ResultSet resultSet = statement.executeQuery();
        StringBuilder recommendations = new StringBuilder();
        recommendations.append("Other Users' Recommendations:\n");
        if (resultSet.next()) {
            int userId = resultSet.getInt("user_id");
            String firstName = resultSet.getString("firstName");
            String lastName = resultSet.getString("lastName");
            recommendations.append("User ").append(userId).append(": ").append(firstName).append(" ").append(lastName).append("\n");
        } else {
            recommendations.append("No other users found.\n");
        }
       OtherUsers.setText(recommendations.toString());
        resultSet.close();
        statement.close();
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Failed to fetch recommendations for other users.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}
     
     // Main method
    public static void main(String args[]) {
        
             // Get the logged-in user ID
 int loggedInUserId = getUserId();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TiktokForm(loggedInUserId).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FollowRecommended;
    private javax.swing.JTextArea OtherUsers;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JTextField SearchField;
    private javax.swing.JButton commentButton;
    private javax.swing.JTextArea contentText;
    private javax.swing.JTextArea contentTextArea;
    private javax.swing.JPanel interactionPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panel;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JButton uploadButton;
    // End of variables declaration//GEN-END:variables
}
