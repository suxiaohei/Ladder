package watch;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.socket.SocketChannel;

/**
 * Created by suxin on 17-4-10.
 */
public class WatchServerSupervisorHandler extends ChannelInboundHandlerAdapter {

    private IWatchCMDReceive iWatchCMDReceive = new IWatchCMDReceiveImpl();

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) {

        WatchCMD watchCMD = (WatchCMD) msg;
        SocketChannel socketChannel = NettyChannelMap.get(watchCMD.getImei());
        if (socketChannel == null) {
            socketChannel = (SocketChannel) ctx.channel();
            NettyChannelMap.add(watchCMD.getImei(), socketChannel);
        }
        switch (watchCMD.getType()) {
            case 1:
                iWatchCMDReceive.syncTime(socketChannel, watchCMD);
            case 2:
                iWatchCMDReceive.boot(socketChannel, watchCMD);
            case 44:
                iWatchCMDReceive.heartBeat(socketChannel, watchCMD);
        }
    }
}
