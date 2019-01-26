package com.swift.sandhook;

import android.app.Application;

import com.swift.sandhook.testHookers.AbsHooker;
import com.swift.sandhook.testHookers.ActivityHooker;
import com.swift.sandhook.testHookers.CtrHook;
import com.swift.sandhook.testHookers.CustmizeHooker;
import com.swift.sandhook.testHookers.JniHooker;
import com.swift.sandhook.testHookers.LogHooker;
import com.swift.sandhook.testHookers.ObjectHooker;
import com.swift.sandhook.wrapper.HookErrorException;

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        try {
            SandHook.addHookClass(JniHooker.class,
                    CtrHook.class,
                    LogHooker.class,
                    CustmizeHooker.class,
                    ActivityHooker.class,
                    ObjectHooker.class,
                    AbsHooker.class);
        } catch (HookErrorException e) {
            e.printStackTrace();
        }

    }
}
