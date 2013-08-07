/**
 * Copyright 2013 Adam Stroud
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.adstrosoftware.launchappops;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Launches the app ops settings then finishes itself.
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // TODO: Settings.ACTION_APP_OPS_SETTINGS should be used when it is exposed
        startActivity(new Intent("android.settings.APP_OPS_SETTINGS"));
        finish();
    }
}
