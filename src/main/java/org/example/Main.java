package org.example;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;

public class Main {

    // Constants for JSON keys and file path
    public static final String POLICY_DOCUMENT = "/PolicyDocument";
    public static final String STATEMENT = "/Statement";
    public static final String RESOURCE = "/Resource";
    public static final String FIRST_RESOURCE = "/0/Resource";
    public static final String ASTERISK = "*";
    public static final String INPUT_JSON = "input.json";

    // Method to retrieve InputStream from classpath for a given file path
    private static InputStream inputStreamFromClasspath(String path ) {
        return Thread.currentThread().getContextClassLoader().getResourceAsStream( path );
    }

    // Method to get the resource node from the JSON object
    private static JsonNode getResourceNode(JsonNode rootNode) {
        JsonNode policyDocumentNode = rootNode.at(POLICY_DOCUMENT);

        JsonNode statementNode;
        if (!policyDocumentNode.isMissingNode()) {
            statementNode = policyDocumentNode.at(STATEMENT);
        } else {
            statementNode = rootNode.at(STATEMENT);
        }

        JsonNode resourceNode;
        if (statementNode.isArray()) {
            resourceNode = statementNode.at(FIRST_RESOURCE);
        } else {
            resourceNode = statementNode.at(RESOURCE);
        }
        if (resourceNode.isMissingNode()) {
            throw new IllegalArgumentException("Resource field not found in JSON");
        }
        else {
            return resourceNode;
        }
    }

    // Method to verify if JSON contains single asterisk in the Resource field
    public static boolean verifyJSON(String filePath ) {
        try {
            // Read JSON file
            ObjectMapper objectMapper = new ObjectMapper();
            InputStream jsonStream = inputStreamFromClasspath(filePath);
            JsonNode rootNode = objectMapper.readTree(jsonStream);

            // Get the resource node from JSON
            JsonNode resourceNode = getResourceNode(rootNode);

            // Check if Resource field is equal or contains a single asterisk
            if (resourceNode.isTextual()) {
                String resource = resourceNode.textValue();
                return !resource.equals(ASTERISK);
            } else {
                if (resourceNode.isArray()) {
                    // Iterate over array elements
                    for (JsonNode node : resourceNode) {
                        if (node.isTextual()) {
                            String resource = node.textValue();
                            if (resource.equals(ASTERISK)) {
                                return false;
                            }
                        }
                    }
                }
                // Handle case where Resource field is not a string
                return true;
            }
        } catch (IOException e) {
            // Print stack trace if there's an IOException
            e.printStackTrace();
            return false;
        }
    }

    public static void main(String[] args) {
        boolean result = verifyJSON(INPUT_JSON);
        System.out.println("Input JSON verification result: " + result);
    }
}