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
import time
import json
import pprint
import hashlib
import struct
import re
import base64
import http.client
import sys
from multiprocessing import Process

ERROR_SLEEP = 15
MAXIMUM_NONCE = 1000000
SETTINGS = {}
PP = pprint.PrettyPrinter(indent=4)

class BitcoinInRPC:
      OBJID = 1
      def __init__(self, host, port, username, password):
            authPair = "%s : %s "% (username, password)
            self.authhdr = "Basic %s" % (base64.b64encode(authPair))
            self.conn = http.client.HTTPConnection(host, port, False, 30)