package lib.socketcommunicator;

import lib.socketcommunicator.interfaces.ClientConnectedCallbacks;
import lib.socketcommunicator.interfaces.ClientMessageSentCallbacks;
import lib.socketcommunicator.interfaces.ServerMessageReceivedCallbacks;

/**
 * Created by varun.am on 25/10/18
 */
public class SocketCommunicator {


    /**
     * Use this method to send a message to server (Fire and Forget)
     * @param ipAddress - IP Address of the server
     * @param port - Server port to which message needs to be sent
     * @param message - message to be sent
     * @param clientMessageSentCallbacks - callbacks to do operations on message sent success/failure
     */
    public void sendMessageToServer(String ipAddress, int port, String message, ClientMessageSentCallbacks clientMessageSentCallbacks) {
        new Thread(new ClientSender(ipAddress, port, message, clientMessageSentCallbacks)).start();
    }

    /*public void listenToServer(String serverIpAddress, int port, ClientMessageReceivedCallbacks clientMessageReceivedCallbacks) {
        new Thread(new ClientReceiver(serverIpAddress, port, clientMessageReceivedCallbacks)).start();
    }*/

    /**
     * Call this message to add server behaviour to your device
     * @param listeningPort - port which should be listening to client connections
     * @param serverMessageReceivedCallbacks - callbacks to handle when message is received
     * @param clientConnectedCallbacks - callbacks to handle when client is connected
     */
    public void listenToClient(int[] listeningPort, ServerMessageReceivedCallbacks serverMessageReceivedCallbacks, ClientConnectedCallbacks clientConnectedCallbacks) {
        for (int i = 0; i < listeningPort.length; i++) {
            new Thread(new ServerReceiver(listeningPort[i], serverMessageReceivedCallbacks, clientConnectedCallbacks)).start();
        }
    }

}
