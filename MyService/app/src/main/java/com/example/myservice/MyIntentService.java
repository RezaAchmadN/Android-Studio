package com.example.myservice;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;


/**
 * An {@link IntentService} subclass for handling asynchronous task requests in
 * a service on a separate handler thread.
 * <p>
 * TODO: Customize class - update intent actions and extra parameters.
 */
public class MyIntentService extends IntentService {
    public static String EXTRA_DURATION = "extra_duration";
    public static final String TAG = MyIntentService.class.getSimpleName();

    public MyIntentService() {
        super ( "MyIntentService" );
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.d(TAG, "onHandleIntent: Mulai.....");
        if ( intent != null ) {
            final String action = intent.getAction ();
            long duration = intent.getLongExtra(EXTRA_DURATION, 0);
            try {
                Thread.sleep(duration);
                Log.d(TAG, "onHandleIntent: Selesai.....");
            } catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy ();
        Log.d(TAG, "onDestroy()");
    }

    /**
     * Handle action Foo in the provided background thread with the provided
     * parameters.
     */
    private void handleActionFoo(String param1 , String param2) {
        // TODO: Handle action Foo
        throw new UnsupportedOperationException ( "Not yet implemented" );
    }

    /**
     * Handle action Baz in the provided background thread with the provided
     * parameters.
     */
    private void handleActionBaz(String param1 , String param2) {
        // TODO: Handle action Baz
        throw new UnsupportedOperationException ( "Not yet implemented" );
    }
}
