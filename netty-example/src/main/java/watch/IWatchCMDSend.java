package watch;

import io.netty.channel.socket.SocketChannel;

/**
 * Created by suxin on 17-4-10.
 */
public interface IWatchCMDSend {

    void sendServerCurrentTime(SocketChannel socketChannel);

}
