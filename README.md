# Socket Communicator for Android

## **The module helps android developers communicate with other apps through socket  communication.**

### How to use?

To make your app behave as a server,
call below method.

        SocketCommunicator.listenToClients(
              PortsToOpenAndListen, 
              messageReceivedCallbacks, 
              clientConnectedCallbacks)

If you want to make your app behave as a client and send a message to server, 

        SocketCommunicator.sendMessageToServer(
              serverIpAddress, 
              port, 
              messageToSend, 
              clientMessageSentCallbacks)

Implement required methods to perform action on events occurance. 

### Feel free to raise a PR if you want to improve it.
