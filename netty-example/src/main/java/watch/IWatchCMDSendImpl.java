package watch;

import io.netty.buffer.Unpooled;
import io.netty.channel.socket.SocketChannel;
import io.netty.util.CharsetUtil;

/**
 * Created by suxin on 17-4-11.
 */
public class IWatchCMDSendImpl implements IWatchCMDSend {

    @Override
    public void sendServerCurrentTime(SocketChannel socketChannel) {
        socketChannel.writeAndFlush(Unpooled.copiedBuffer("time is sync", CharsetUtil.UTF_8));
    }
}
