package lib.socketcommunicator.interfaces;

/**
 * Created by varun.am on 24/10/18
 */
public interface ClientMessageReceivedCallbacks {

    /**
     * This will be executed on a separate thread
     * Use runOnUiThread() to update any UI on implementing these methods
     * @param messageReceived - message received
     */
    void onMessageReceivedByClient(String messageReceived);
    void onMessageReceiveFailure();

}
