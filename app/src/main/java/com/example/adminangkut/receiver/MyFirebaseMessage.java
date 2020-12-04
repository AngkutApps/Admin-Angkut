package com.example.adminangkut.receiver;

import android.content.Intent;
import android.util.Log;

import androidx.localbroadcastmanager.content.LocalBroadcastManager;

import com.example.adminangkut.util.Util;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MyFirebaseMessage extends FirebaseMessagingService {
    private static final String TAG = "MyFirebaseMessage";
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);

        Intent intent = new Intent(Util.LOAD_DATA_RECEIVER);
        LocalBroadcastManager.getInstance(MyFirebaseMessage.this).sendBroadcast(intent);

        Log.d(TAG, "onMessageReceived: ada data");

    }
}
