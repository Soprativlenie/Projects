package api.dog;/* Created by user on 25.02.20 */

public enum Header {
    CONTENT_TYPE_JSON("application/json");

    private String header;

    Header(String header) {
        this.header = header;
    }
}
