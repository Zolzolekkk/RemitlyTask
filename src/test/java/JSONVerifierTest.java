import org.junit.jupiter.api.Test;

import static org.example.Main.verifyJSON;
import static org.junit.jupiter.api.Assertions.*;

public class JSONVerifierTest {

    @Test
    public void givenJsonWithResourceContainingAsterisk_whenVerifyInputJson_thenReturnFalse() {
        // Given
        String json = "asterisk.json";

        // When
        boolean result = verifyJSON(json);

        // Then
        assertFalse(result);
    }

    @Test
    public void givenJsonWithResourceNotContainingAsterisk_whenVerifyInputJson_thenReturnTrue() {
        // Given
        String json = "no_asterisk.json";

        // When
        boolean result = verifyJSON(json);

        // Then
        assertTrue(result);
    }

    @Test
    public void givenJsonWithResourceArrayNotContainingAsterisk_whenVerifyInputJson_thenReturnTrue() {
        // Given
        String json = "array.json";

        // When
        boolean result = verifyJSON(json);

        // Then
        assertTrue(result);
    }

    @Test
    public void givenJsonWithResourceArrayContainingAsterisk_whenVerifyInputJson_thenReturnFalse() {
        // Given
        String json = "array_with_asterisk.json";

        // When
        boolean result = verifyJSON(json);

        // Then
        assertFalse(result);
    }

    @Test
    public void givenJsonWithResourceContainingAsteriskWithoutPolicyDocumentField_whenVerifyInputJson_thenReturnFalse() {
        // Given
        String json = "no_policy_field_asterisk.json";

        // When
        boolean result = verifyJSON(json);

        // Then
        assertFalse(result);
    }

    @Test
    public void givenJsonWithResourceNotContainingAsteriskWithoutPolicyDocumentField_whenVerifyInputJson_thenReturnTrue() {
        // Given
        String json = "no_policy_field_no_asterisk.json";

        // When
        boolean result = verifyJSON(json);

        // Then
        assertTrue(result);
    }

    @Test
    public void givenJsonWithResourceArrayNotContainingAsteriskWithoutPolicyDocumentField_whenVerifyInputJson_thenReturnTrue() {
        // Given
        String json = "no_policy_field_array.json";

        // When
        boolean result = verifyJSON(json);

        // Then
        assertTrue(result);
    }

    @Test
    public void givenJsonWithResourceArrayContainingAsteriskWithoutPolicyDocumentField_whenVerifyInputJson_thenReturnFalse() {
        // Given
        String json = "no_policy_field_array_with_asterisk.json";

        // When
        boolean result = verifyJSON(json);

        // Then
        assertFalse(result);
    }

    @Test
    public void givenJsonWithResourceContainingAsteriskWhereStatementFieldIsNotAnArray_whenVerifyInputJson_thenReturnFalse() {
        // Given
        String json = "statement_not_array_asterisk.json";

        // When
        boolean result = verifyJSON(json);

        // Then
        assertFalse(result);
    }

    @Test
    public void givenJsonWithResourceNotContainingAsteriskWhereStatementFieldIsNotAnArray_whenVerifyInputJson_thenReturnTrue() {
        // Given
        String json = "statement_not_array_no_asterisk.json";

        // When
        boolean result = verifyJSON(json);

        // Then
        assertTrue(result);
    }

    @Test
    public void givenJsonWithMissingResourceField_whenVerifyInputJson_thenThrowIllegalArgumentException() {
        // Given
        String json = "missing_resource_field.json";

        // When, Then
        assertThrows(IllegalArgumentException.class, () -> verifyJSON(json));
    }

    @Test
    public void givenJsonWithResourceWithMultipleAsterisks_whenVerifyInputJson_thenReturnTrue() {
        // Given
        String json = "multiple_asterisks.json";

        // When
        boolean result = verifyJSON(json);

        // Then
        assertTrue(result);
    }
}