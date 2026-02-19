package classes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UserFiles {
    private static final String USER_FILE_PATH = "Data//UserFiles.txt";

    public static String getLoggedInUser() {
        String loggedInUsername = "";

        try (BufferedReader reader = new BufferedReader(new FileReader(USER_FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("User Name:")) {
                    loggedInUsername = line.substring("User Name:".length()).trim();
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return loggedInUsername;
    }

    public static void updateLoggedInUser(String newUsername) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(USER_FILE_PATH, true))) {
            // Append the new user's data to the file
            writer.write("User Name: " + newUsername + System.lineSeparator());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void logout() {
        String loggedInUser = getLoggedInUser();
        String fileContent = readExistingContent();

        // Remove the data related to the logged-out user
        fileContent = fileContent.replace("User Name: " + loggedInUser, "");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(USER_FILE_PATH))) {
            writer.write(fileContent.trim());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Helper method to read existing content from the file
    private static String readExistingContent() {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(USER_FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append(System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }
}
