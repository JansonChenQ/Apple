package Base;

import android.app.Application;

import com.avos.avoscloud.AVOSCloud;

/**
 * Created by Administrator on 2017/6/13.
 */

public class WEIMBaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // 初始化参数依次为 this, AppId, AppKey
        AVOSCloud.initialize(this,"XMabfOum9Ut8tWz0hKl62oyq-gzGzoHsz","FsTubx30NqKeMD3IV83h8pL9");
        AVOSCloud.setDebugLogEnabled(true);

    }
}
