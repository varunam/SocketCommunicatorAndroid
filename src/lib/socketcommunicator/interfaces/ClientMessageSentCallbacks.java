package lib.socketcommunicator.interfaces;

/**
 * Created by varun.am on 24/10/18
 */
public interface ClientMessageSentCallbacks {

    void clientMessageSentSuccessful(String messageSent);
    void clientMessageSendFailure();

}
