package com.zubilay.yahooweather.model.POJO;

/**
 * Created by Esteven on 9/9/2016.
 */


   import com.google.gson.annotations.Expose;
    import com.google.gson.annotations.SerializedName;

//@Generated("org.jsonschema2pojo")
public class Results {

    @SerializedName("channel")
     @Expose
    private Channel channel;

    /**
     *
     * @return
     * The channel
     */
    public Channel getChannel() {
        return channel;
    }

    /**
     *
     * @param channel
     * The channel
     */
    public void setChannel(Channel channel) {
        this.channel = channel;
    }

}
