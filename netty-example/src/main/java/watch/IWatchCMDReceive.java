package watch;

import io.netty.channel.socket.SocketChannel;
import watch.WatchCMD;

/**
 * Created by suxin on 17-4-10.
 */
public interface IWatchCMDReceive {
    /**
     * 时间同步
     *
     * @param socketChannel
     * @param watchCMD
     */
    void syncTime(SocketChannel socketChannel, WatchCMD watchCMD);

    /**
     * 开机通告
     *
     * @param socketChannel
     * @param watchCMD
     */
    void boot(SocketChannel socketChannel, WatchCMD watchCMD);

    /**
     * 心跳
     * @param socketChannel
     * @param watchCMD
     */
    void heartBeat(SocketChannel socketChannel, WatchCMD watchCMD);
}
