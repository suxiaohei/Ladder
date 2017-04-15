package watch;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.CharsetUtil;

/**
 * Created by suxin on 17-4-10.
 */
public class WatchServerConvertHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) {
        ByteBuf in = (ByteBuf) msg;
        String receiveMsg = in.toString(CharsetUtil.UTF_8);
        String[] msgData = receiveMsg.split(",");
        WatchCMD watchCMD = new WatchCMD();
        watchCMD.setVersion(msgData[1]);
        watchCMD.setType(Integer.parseInt(msgData[2]));
        watchCMD.setImei(msgData[3]);
        watchCMD.setImsi(msgData[4]);
        for (int i = 5; i < msgData.length - 1; i++) {
            watchCMD.setContent(msgData[i]);
        }
        ctx.fireChannelRead(watchCMD);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        cause.printStackTrace();
        ctx.close();
    }
}
