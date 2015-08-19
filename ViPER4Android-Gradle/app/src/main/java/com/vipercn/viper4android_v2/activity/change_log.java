package com.vipercn.viper4android_v2.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.vipercn.viper4android_v2.R;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by 최요한 on 2015-08-19.
 */
     public class change_log extends Activity {
            @Override
            protected void onCreate(Bundle savedInstanceState)
            {
                super.onCreate(savedInstanceState);
                // See assets/res/any/layout/styled_text.xml for this
                // view layout definition.
                setContentView(R.layout.layout_change_log);
                // Programmatically load text from an asset and place it into the
                // text view.  Note that the text we are loading is ASCII, so we
                // need to convert it to UTF-16.
                try {
         /*
          * /assets/read_asset.txt 파일을 열고 있습니다.
          * 시스템에서  getAssets()메소드가 AssetManager 객체를 가져와서,
          * open 메소드에 파일명을 인자로 넘기면, /assets/ 폴더안에서
          * 해당 파일명에 해당하는 파일을 오픈하게 됩니다.
          */
                    InputStream is = getAssets().open("Changelog_en_US.txt");

                    // We guarantee that the available method returns the total
                    // size of the asset...  of course, this does mean that a single
                    // asset can't be more than 2 gigs.
                    // 파일 사이즈를 얻습니다.
                    int size = is.available();

                    // Read the entire asset into a local byte buffer.
                    // 파일 사이즈만큼 메모리에 데이터를 읽어 들입니다.
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();

                    // Convert the buffer into a string.
                    // 파일로부터 읽어들인 데이터를 텍스트변수에 저장합니다.
                    String text = new String(buffer);

                    // Finally stick the string into the text view.
                    // 파일내용을 텍스트 뷰 객체에 출력합니다.
                    TextView tv = (TextView)findViewById(R.id.text_change_log);
                    tv.setText(text);
                } catch (IOException e) {
                    // Should never happen!
                    throw new RuntimeException(e);
                }
    }
}
