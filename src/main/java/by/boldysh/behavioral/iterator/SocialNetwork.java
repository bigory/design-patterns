package by.boldysh.behavioral.iterator;

/**
 * Интерфейс социальной сети
 */
public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}
