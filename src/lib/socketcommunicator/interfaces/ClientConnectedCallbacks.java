package lib.socketcommunicator.interfaces;

/**
 * Created by varun.am on 24/10/18
 */
public interface ClientConnectedCallbacks {
    void onClientConnected(String clientIpAddress, int clientPort);
    void onClientConnectionFailure();
}
