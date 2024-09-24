// Java Program to Create Directories Recursively
 
// Importing required classes
import java.io.File;
 
// Main class
class GFG {
 
    // Method
    // To create directories
    static void file(String md, String path, int depth)
    {
 
        // md stores the starting path each character in
        // path represents new directory depth stores
        // the number of directories to be created
        // terminating condition
 
        if (depth == 0)
            return;
 
        // Decrementing the depth by 1
        depth -= 1;
 
        // Checking if the path exists
        if (path.length() == 0)
            System.out.println("Path does not exist");
 
        // execute if the path has more directories
        else {