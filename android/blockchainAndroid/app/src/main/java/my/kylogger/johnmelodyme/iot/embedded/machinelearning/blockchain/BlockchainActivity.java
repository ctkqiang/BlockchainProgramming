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

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.widget.TextView;

import java.util.concurrent.BlockingQueue;

import my.kylogger.johnmelodyme.iot.embedded.machinelearning.blockchain.Model.Blocks;

public class BlockchainActivity extends AppCompatActivity {
    public static final String TAG = "Blockchain";
    private TextView BlockchainOutput;

    public void DeclarationInit() {
        BlockchainOutput = findViewById(R.id.blockchain);
        BlockchainOutput.setMovementMethod(new ScrollingMovementMethod());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "Starting " + BlockchainActivity.class.getSimpleName());
        DeclarationInit();
        DisplayHashesToScreen();
    }

    private void DisplayHashesToScreen() {
        final int Hashebyte = 0;
        final int i = +1;
        final Runnable InfiniteHashes = new Runnable() {
            @Override
            public void run() {
                int testByte = 0;
                while (testByte == 0) {
                    BlockchainOutput.post(new Runnable() {
                        @SuppressLint("SetTextI18n")
                        @Override
                        public void run() {
                            Blocks genericblocks = new Blocks("Hashes", "0");
                            Blocks blocks = new Blocks("Hashes", genericblocks.HASHES);
                            BlockchainOutput.setText("Block created." +genericblocks + blocks);
                            Log.d(TAG, "run: " + blocks);
                        }
                    });
                }
            }
        };

        Thread HASHESLOOP = new Thread(InfiniteHashes);
        HASHESLOOP.start();
    }
}
