package com.example.adminangkut.receiver;

import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;

import androidx.core.app.NotificationCompat;

import com.example.adminangkut.MainActivity;
import com.example.adminangkut.R;

import java.io.IOException;

public class PesananReceiver extends BroadcastReceiver {
    private static final String TAG = "PesananReceiver";
    MediaPlayer mediaPlayer = null;

    @Override
    public void onReceive(Context context, Intent intent) {
//        String action = intent.getAction();
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer = null;
        }

        mediaPlayer = MediaPlayer.create(context, R.raw.klakson);

        mediaPlayer.start();
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                if (!mp.isPlaying()) {
                    mp.release();
                }
                else {
                    mp.stop();
                    mp.release();
                }
            }
        });


        sendNotifcation(context, context.getResources().getString(R.string.app_name), ""+
                "Pesanan Terbaru", 58);

    }

    private void sendNotifcation(Context context, String title, String desc, int requestCode) {
        Log.d(TAG, "sendNotifcation: ");
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        Intent intent = new Intent(context, MainActivity.class);
        PendingIntent pendingIntent =PendingIntent.getActivity(context, requestCode, intent, PendingIntent.FLAG_UPDATE_CURRENT);

        String NOTIF_CHANNEL_ID = "pesanan_id";
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            int important =NotificationManager.IMPORTANCE_HIGH;
            String NOTIFICATION_CHANNEL_NAME = "pesanan channel";
            NotificationChannel channel = new NotificationChannel(
                    NOTIF_CHANNEL_ID, NOTIFICATION_CHANNEL_NAME, important
            );
            notificationManager.createNotificationChannel(channel);
        }

        Uri uri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, desc)
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentTitle(title)
                .setContentText(desc)
                .setContentIntent(pendingIntent)
                .setVibrate(new long[]{1000, 1000, 1000, 1000, 1000})
                .setAutoCancel(true);

        int NOTIF_ID = 998;
        notificationManager.notify(NOTIF_ID, builder.build());

    }

}
