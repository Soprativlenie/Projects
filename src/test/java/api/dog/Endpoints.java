package api.dog;/* Created by user on 25.02.20 */

public final class Endpoints {
    private static final String LIST_ALL_BREEDS = "breeds/list/all";
    private static final String RANDOM_IMAGE = "/breeds/image/random";
    private static final String BY_BREED = "/breed/hound/images";
    private static final String BY_SUB_BREED = "/breed/hound/list";

    public static String getListAllBreeds() {
        return LIST_ALL_BREEDS;
    }

    public static String getRandomImage() {
        return RANDOM_IMAGE;
    }

    public static String getByBreed() {
        return BY_BREED;
    }

    public static String getBySubBreed() {
        return BY_SUB_BREED;
    }
}
