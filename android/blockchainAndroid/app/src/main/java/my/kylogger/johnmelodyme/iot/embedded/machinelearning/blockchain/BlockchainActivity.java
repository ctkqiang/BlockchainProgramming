package my.kylogger.johnmelodyme.iot.embedded.machinelearning.blockchain;

/**
 *                   Copyright 2020 © John Melody Me
 *
 *       Licensed under the Apache License, Version 2.0 (the "License");
 *       you may not use this file except in compliance with the License.
 *       You may obtain a copy of the License at
 *
 *                   http://www.apache.org/licenses/LICENSE-2.0
 *
 *       Unless required by applicable law or agreed to in writing, software
 *       distributed under the License is distributed on an "AS IS" BASIS,
 *       WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *       See the License for the specific language governing permissions and
 *       limitations under the License.
 *       @Author : John Melody Me
 *       @Copyright: John Melody Me & Tan Sin Dee © Copyright 2020
 *       @INPIREDBYGF: Cindy Tan Sin Dee <3
 */

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class BlockchainActivity extends AppCompatActivity {
    public static final String TAG = "Blockchain";

    public void DeclarationInit() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "Starting " + BlockchainActivity.class.getSimpleName());
        DeclarationInit();
    }
}
