package guru.springframework.services.security;

/**
 * Created by El-Feky on 8/17/17.
 */
public interface EncryptionService {
    String encryptString(String input);
    boolean checkPassword(String plainPassword, String encryptedPassword);
}
