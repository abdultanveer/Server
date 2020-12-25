package com.next.server;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

public class AddService extends Service {//step1
    public AddService() {
    }

    private AddAidl.Stub mBinder = new AddAidl.Stub() {//step 3
        @Override
        public int add(int a, int b) throws RemoteException {
            return a+b;//step 4
        }
    };

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
      return  mBinder;//step 5
    }
}