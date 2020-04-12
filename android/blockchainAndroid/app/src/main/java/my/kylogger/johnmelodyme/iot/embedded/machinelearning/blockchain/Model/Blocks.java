package my.kylogger.johnmelodyme.iot.embedded.machinelearning.blockchain.Model;

import java.util.Date;

import my.kylogger.johnmelodyme.iot.embedded.machinelearning.blockchain.Helper.StringUtil;

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

public class Blocks {
    public String HASHES;
    private String PREVIOUS_HASHES;
    private String DATA;
    private long timeStamp;

    //BLOCK's Constructor:
    public Blocks(String DATA, String PREVIOUS_HASHES) {
        this.DATA = DATA;
        this.PREVIOUS_HASHES = PREVIOUS_HASHES;
        this.timeStamp = new Date().getTime();
        this.HASHES = CALCULATE_HASHES();
    }

    private String CALCULATE_HASHES() {
        String calculatedHashes = StringUtil.applySha256(PREVIOUS_HASHES +
                Long.toString(timeStamp) +
                DATA);
        return CALCULATE_HASHES();
    }
}
