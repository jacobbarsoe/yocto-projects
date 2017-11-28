include recipes-core/images/rpi-hwup-image.bb

#IMAGE_INSTALL_append = "home-assistant hiawatha rf24 homemonitor s3-bash"

IMAGE_INSTALL_append = " \
	hiawatha \
	python-paho-mqtt \
	python-pyserial \
	python \
	bind-utils "

IMAGE_FSTYPES = "ext4"
SDIMG_ROOTFS_TYPE = "ext4"


