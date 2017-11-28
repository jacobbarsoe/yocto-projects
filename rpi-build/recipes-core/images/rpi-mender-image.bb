include recipes-core/images/rpi-hwup-image.bb

#IMAGE_INSTALL_append = "home-assistant hiawatha rf24 homemonitor s3-bash"


# raspberrypi files aligned with mender layout requirements
IMAGE_DEPENDS_sdimg += " bcm2835-bootfiles"
IMAGE_BOOT_FILES_append = " bcm2835-bootfiles/* boot.scr u-boot.bin;${SDIMG_KERNELIMAGE}"

IMAGE_INSTALL_append = " kernel-image \
	kernel-devicetree \
	hiawatha \
	openssh-sshd \
	python-pyserial \
	loggerMichael \
	python-paho-mqtt \
	python \
	rpi-gpio \
	ppp \
	bind-utils \
	curl \
	${@bb.utils.contains('DISTRO_FEATURES', 'systemd', ' wlan0-systemd', 'wpa-supplicant', d)} \
	linux-firmware-rtl8188eu"



IMAGE_FSTYPES = "ext4"
SDIMG_ROOTFS_TYPE = "ext4"


