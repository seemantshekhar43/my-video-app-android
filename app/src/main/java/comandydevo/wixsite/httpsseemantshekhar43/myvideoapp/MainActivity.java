package comandydevo.wixsite.httpsseemantshekhar43.myvideoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // how to add video

        // 1. Get video view
        VideoView videoview = (VideoView) findViewById(R.id.videoView);

        //2. Locate the video
        videoview.setVideoPath("android.resource://" + getPackageName() +"/" +R.raw.intro);

        //3. Add the media controls
        MediaController mediaController = new MediaController(this);

        // assign video to controller
        mediaController.setAnchorView(videoview);

        // assign controller to video
        videoview.setMediaController(mediaController);


        // 4. Run it
        videoview.start();

  }

}
