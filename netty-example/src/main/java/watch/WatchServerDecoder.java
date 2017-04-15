package watch;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.util.CharsetUtil;

import java.util.List;

/**
 * Created by suxin on 17-4-10.
 */
public class WatchServerDecoder extends ByteToMessageDecoder {

    @Override
    protected void decode(ChannelHandlerContext ctx, ByteBuf msg, List<Object> out) {

        if (!msg.isReadable() && msg.readableBytes() < 4) {
            return;
        }

        String msg_str = msg.toString(CharsetUtil.UTF_8);
        if (!msg_str.startsWith("@B#@")) {
            ctx.close();
            return;
        }
        int end_str_index = msg_str.indexOf("@E#@");
        if (end_str_index < 0) {
            return;
        }
        out.add(msg.readBytes(end_str_index + 4));
    }
}
