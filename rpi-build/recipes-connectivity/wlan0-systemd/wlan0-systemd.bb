SRC_URI = "file://wlan0.network"
SRC_URI += "file://wlan0.service"
SRC_URI += "file://wlan0.conf"

LICENSE="CLOSED"

RDEPENDS_${PN} += " wpa-supplicant"

inherit systemd

SYSTEMD_PACKAGES = "${PN}"

SYSTEMD_SERVICE_${PN} = " wlan0.service"

do_install() {
	     install -d ${D}/${sysconfdir}/systemd/system/
	     install -m 0755 ${WORKDIR}/wlan0.service ${D}/${sysconfdir}/systemd/system/
	     install -d ${D}/${sysconfdir}/systemd/network/
     	     install -m 0755 ${WORKDIR}/wlan0.network ${D}/${sysconfdir}/systemd/network/
     	     install -d ${D}/${sysconfdir}/wpa_supplicant/
     	     install -m 0755 ${WORKDIR}/wlan0.conf ${D}/${sysconfdir}/wpa_supplicant/
}

