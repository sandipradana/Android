package com.lapsap.android_learning._1_dragAndDrop;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(new picture_move_logics(this));
  }
} 