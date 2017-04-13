package watch;

import io.netty.channel.socket.SocketChannel;

/**
 * Created by suxin on 17-4-11.
 */
public class IWatchCMDReceiveImpl implements IWatchCMDReceive {

    private IWatchCMDSend iWatchCMDSend = new IWatchCMDSendImpl();

    @Override
    public void syncTime(SocketChannel socketChannel, WatchCMD watchCMD) {
        iWatchCMDSend.sendServerCurrentTime(socketChannel);
    }

    @Override
    public void boot(SocketChannel socketChannel, WatchCMD watchCMD) {
        socketChannel.writeAndFlush("netty is boot");
    }

    @Override
    public void heartBeat(SocketChannel socketChannel, WatchCMD watchCMD) {
        socketChannel.writeAndFlush("netty is heartBeat");
    }
}
