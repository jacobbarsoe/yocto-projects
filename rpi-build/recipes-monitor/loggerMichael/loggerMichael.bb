SRC_URI = "file://log.py"
SRC_URI += "file://loggerMichael.service"

LICENSE="CLOSED"

inherit systemd

SYSTEMD_PACKAGES = "${PN}"

SYSTEMD_SERVICE_${PN} = " ${PN}.service"

#FILES_${PN} += "${PN}.service"

do_install() {
	     install -d ${D}/${bindir}/
	     install -m 0755 ${WORKDIR}/log.py ${D}/${bindir}/
	     install -d ${D}/${sysconfdir}/systemd/system
	     install -m 0755 ${WORKDIR}/${PN}.service ${D}/${sysconfdir}/systemd/system
}

