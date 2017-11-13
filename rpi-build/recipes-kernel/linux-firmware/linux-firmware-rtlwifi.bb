SRC_URI = "git://github.com/lwfinger/rtl8188eu.git"

LICENSE="GPLv2"
LIC_FILES_CHKSUM = "file://${S}/COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"

S = "${WORKDIR}/git"

SRCREV="00b5f0d1d9e0f1166c3b486d88b7a04d5efb0d70"

do_install() {
	mkdir -p ${D}/lib/firmware/rtlwifi
	install -m 664 ${S}/rtl8188eufw.bin  ${D}/lib/firmware/rtlwifi/
}

FILES_${PN} = "/lib/firmware/rtlwifi"