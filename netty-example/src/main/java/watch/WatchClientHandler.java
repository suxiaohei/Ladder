package watch;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.util.CharsetUtil;

/**
 * Created by suxin on 17-4-10.
 */
public class WatchClientHandler extends SimpleChannelInboundHandler<ByteBuf> {

    @Override
    public void channelActive(ChannelHandlerContext ctx) {
        ctx.writeAndFlush(Unpooled.copiedBuffer("@B#@,V01,1,1111122222333331,8888888888888888,20150312010203,460;0;2515;362;-88|" +
                "460;0;12514;363;-100|" +
                "460;1;12514;363;-100," +
                "00:0b:0e:7d:17:84;cmcc;-89|" +
                "01:0b:0e:7d:32:56;china_mobile;-103," +
                "@E#@" +
                "@B#@,V01,2,1111122222333331,8888888888888888,20150312010203,58" +
                "@E#@"+
                "@B#@,V01,44,1111122222333331,8888888888888888," +
                "@E#@", CharsetUtil.UTF_8));
    }

    @Override
    public void channelRead0(ChannelHandlerContext ctx, ByteBuf in) {
        System.out.println("Client received: " + in.toString(CharsetUtil.UTF_8));
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        cause.printStackTrace();
        ctx.close();
    }
}
