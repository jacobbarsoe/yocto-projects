#!/usr/bin/env python
import serial, sys, time
import os
import errno

serialPort = sys.argv[1]
ser = serial.Serial(
    port=serialPort,
    baudrate=115200,
    parity=serial.PARITY_NONE,
    stopbits=serial.STOPBITS_ONE,
    bytesize=serial.EIGHTBITS
)                                                                               

filename = '/data/monitor/db.csv'
if not os.path.exists(os.path.dirname(filename)):
    try:
        os.makedirs(os.path.dirname(filename))
    except OSError as exc: # Guard against race condition
        if exc.errno != errno.EEXIST:
            raise
                                                                                
while True:                                                                     
    for line in ser.read():                                                     
        f1=open(filename, 'w+')                                
        f1.write(line)                                                          
        f1.close()                                                              
                                                                                
ser.close()   
