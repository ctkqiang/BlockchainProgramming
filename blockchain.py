#!/usr/bin/env python
Copyright = """
                  Copyright 2020 © John Melody Me

      Licensed under the Apache License, Version 2.0 (the "License");
      you may not use this file except in compliance with the License.
      You may obtain a copy of the License at

                  http://www.apache.org/licenses/LICENSE-2.0

      Unless required by applicable law or agreed to in writing, software
      distributed under the License is distributed on an "AS IS" BASIS,
      WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
      See the License for the specific language governing permissions and
      limitations under the License.
      @Author : John Melody Me
      @Copyright: John Melody Me & Tan Sin Dee © Copyright 2020
      @INPIREDBYGF: Cindy Tan Sin Dee <3
"""
from block import Block
import datetime
import time

print(Copyright)
num_blocks_to_add = 10

block_chain = [Block.create_genesis_block()]
print("The genesis block has been created.")
print("Hash: %s" % block_chain[0].hash)

while True:
    for i in range(1, num_blocks_to_add):
        block_chain.append(Block(block_chain[i-1].hash,
                             "Block number %d" % i,
                             datetime.datetime.now()))
        print("Block #%d created." % i, "Hash: %s" % block_chain[-1].hash)
        time.sleep(0.3)