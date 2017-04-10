package watch;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * Created by suxin on 17-4-10.
 */
public class WatchServerSupervisorHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) {

        WatchCMD watchCMD = (WatchCMD) msg;
        System.out.println("=====================");
        System.out.println("======> type : " + watchCMD.getType() + " <======");
        System.out.println("=====================");
    }
}
