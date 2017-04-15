package watch;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by suxin on 17-4-10.
 */
public class WatchCMD implements Serializable{
    private String version;
    private Integer type;
    private String imei;
    private String imsi;
    private List<String> content;

    public String getVersion() {
        return version;
    }
    public void setVersion(String version) {
        this.version = version;
    }

    public Integer getType() {
        return type;
    }
    public void setType(Integer type) {
        this.type = type;
    }

    public String getImei() {
        return imei;
    }
    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getImsi() {
        return imsi;
    }
    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

    public List<String> getContent() {
        if(content == null){
            content = new ArrayList<String>();
        }
        return content;
    }
    public void setContent(String content) {
        if(this.content == null){
            this.content = new ArrayList<String>();
        }
        this.content.add(content);
    }
}
