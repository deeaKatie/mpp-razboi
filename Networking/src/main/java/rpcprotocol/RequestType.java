package rpcprotocol;

public enum RequestType {
    LOGIN,
    LOGOUT,
    SELECTED_CARD,
    NO_MORE_CARDS,
    WINNER_CARDS,
    START_GAME;
    private RequestType() {
    }
}
