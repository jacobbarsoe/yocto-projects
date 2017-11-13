FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI += "file://wpa_supplicant.conf"

do_install[postfuncs] += "do_install_overrideconf"

do_install_overrideconf() {
        install -m 0755 ${WORKDIR}/wpa_supplicant.conf ${D}/${sysconfdir}/wpa_supplicant.conf
}
