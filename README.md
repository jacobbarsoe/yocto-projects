This is a repo to hold my various hobby projects.

I have added a distro on top so I can build mender supported OTA images.

examples

clean SD card image ready to dd to sd card without mender (and uboot):

. ./poky/oe-init-build-env rpi-build/
MACHINE=raspberrypi2 bitbake rpi-image

bootstrap sd card image ready for 1st time before mender:

DISTRO=rpi-mender MACHINE=raspberrypi2 bitbake rpi-mender-image

samestuff for older raspberry:

. ./poky/oe-init-build-env rpi-build/
MACHINE=raspberry bitbake rpi-image OR
DISTRO=rpi-mender MACHINE=raspberrypi2 bitbake rpi-mender-image OR
DISTRO=poky MACHINE=raspberrypi2 bitbake rpi-image OR
DISTRO=poky MACHINE=orange-pi-zero bitbake rpi-image OR
DISTRO=rpi-mender MACHINE=orange-pi-zero bitbake rpi-mender-image 

SDimg from mender can be used to bootstrap
sudo dd if=tmp-glibc/deploy/images/raspberrypi2/rpi-mender-image-raspberrypi2.sdimg of=/dev/mmcblk0 bs=2M